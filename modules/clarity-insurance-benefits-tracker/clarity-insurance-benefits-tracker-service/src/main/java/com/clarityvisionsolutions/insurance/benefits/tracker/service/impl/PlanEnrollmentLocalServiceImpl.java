/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.base.PlanEnrollmentLocalServiceBaseImpl;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.asset.link.constants.AssetLinkConstants;
import com.liferay.asset.link.service.AssetLinkLocalService;
import com.liferay.expando.kernel.service.ExpandoRowLocalService;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.portal.kernel.service.ResourceLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalService;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.trash.exception.RestoreEntryException;
import com.liferay.trash.exception.TrashEntryException;
import com.liferay.trash.model.TrashEntry;
import com.liferay.trash.service.TrashEntryLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.Serializable;
import java.util.*;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment",
	service = AopService.class
)
public class PlanEnrollmentLocalServiceImpl
	extends PlanEnrollmentLocalServiceBaseImpl {

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PlanEnrollment addPlanEnrollment(final long insurancePlanId, final long memberUserId, final String memberId, final String groupNumber,
											final Date startDate, final Date endDate, final int enrollmentStatus, final String notes, final ServiceContext serviceContext) throws PortalException {

		// verify the relationships before we go forward
		InsurancePlan plan = _insurancePlanLocalService.getInsurancePlan(insurancePlanId);
		User member = userLocalService.getUser(memberUserId);

		// now we can create the enrollment
		PlanEnrollment enrollment = planEnrollmentLocalService.createPlanEnrollment(counterLocalService.increment(PlanEnrollment.class.getName()));

		// set the liferay standard values
		enrollment.setGroupId(serviceContext.getScopeGroupId());
		enrollment.setCompanyId(serviceContext.getCompanyId());
		enrollment.setUserId(serviceContext.getUserId());
		enrollment.setCreateDate(serviceContext.getCreateDate(new Date()));
		enrollment.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		User user = userLocalService.getUser(serviceContext.getUserId());

		if (! Validator.isNull(user)) {
			enrollment.setUserName(user.getFullName());
		}

		// set the fields
		enrollment.setInsurancePlanId(insurancePlanId);
		enrollment.setMemberUserId(memberUserId);
		enrollment.setMemberUserName(member.getFullName());
		enrollment.setMemberId(memberId);
		enrollment.setGroupNumber(groupNumber);
		enrollment.setStartDate(startDate);
		enrollment.setEndDate(endDate);
		enrollment.setEnrollmentStatus(enrollmentStatus);
		enrollment.setNotes(notes);

		enrollment = planEnrollmentPersistence.update(enrollment);

		// Resources
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addResources(enrollment, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions());
		}
		else {
			addResources(enrollment, serviceContext.getModelPermissions());
		}

		// Asset
		updateAsset(serviceContext.getUserId(), enrollment, serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());

		// Workflow
		return _startWorkflowInstance(serviceContext.getUserId(), enrollment, serviceContext);
	}

	/**
	 * deleteInsurancePlanEnrollments: Called when an insurance plan is getting deleted so we can
	 * prevent orphaned data from getting into the system.
	 *
	 * @param insurancePlanId
	 * @throws PortalException
	 */
	@Override
	public void deleteInsurancePlanEnrollments(final long insurancePlanId) throws PortalException {
		ActionableDynamicQuery adq = planEnrollmentLocalService.getActionableDynamicQuery();

		adq.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
			@Override
			public void addCriteria(DynamicQuery dynamicQuery) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("insurancePlanId", insurancePlanId));
			}
		});

		adq.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<PlanEnrollment>() {
			@Override
			public void performAction(PlanEnrollment enrollment) throws PortalException {
				planEnrollmentLocalService.deletePlanEnrollment(enrollment);
			}
		});

		adq.performActions();
	}

	@Override
	public void deleteUserPlanEnrollments(final long memberUserId) throws PortalException {
		ActionableDynamicQuery adq = planEnrollmentLocalService.getActionableDynamicQuery();

		adq.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
			@Override
			public void addCriteria(DynamicQuery dynamicQuery) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("memberUserId", memberUserId));
			}
		});

		adq.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<PlanEnrollment>() {
			@Override
			public void performAction(PlanEnrollment enrollment) throws PortalException {
				planEnrollmentLocalService.deletePlanEnrollment(enrollment);
			}
		});

		adq.performActions();
	}

	@Indexable(type = IndexableType.DELETE)
	@Override
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public PlanEnrollment deletePlanEnrollment(PlanEnrollment enrollment) throws PortalException {

		// clean up orphaned records
		_benefitUsageLocalService.deletePlanEnrollmentBenefitUsages(enrollment.getPlanEnrollmentId());

		// Entry

		insurancePlanPersistence.remove(enrollment);

		// Resources

		_resourceLocalService.deleteResource(
				enrollment.getCompanyId(), PlanEnrollment.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, enrollment.getPlanEnrollmentId());

		// Asset

		_assetEntryLocalService.deleteEntry(
				PlanEnrollment.class.getName(), enrollment.getPlanEnrollmentId());

		// Expando

		_expandoRowLocalService.deleteRows(
				enrollment.getCompanyId(),
				_classNameLocalService.getClassNameId(PlanEnrollment.class.getName()),
				enrollment.getPlanEnrollmentId());

		// Trash

		_trashEntryLocalService.deleteEntry(
				PlanEnrollment.class.getName(), enrollment.getPlanEnrollmentId());

		// Workflow

		_workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
				enrollment.getCompanyId(), enrollment.getGroupId(),
				PlanEnrollment.class.getName(), enrollment.getPlanEnrollmentId());

		return enrollment;
	}

	@Override
	public PlanEnrollment deletePlanEnrollment(long planEnrollmentId) throws PortalException {
		PlanEnrollment insurancePlan = planEnrollmentPersistence.findByPrimaryKey(planEnrollmentId);

		return planEnrollmentLocalService.deletePlanEnrollment(insurancePlan);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PlanEnrollment updatePlanEnrollment(final long planEnrollmentId, final String memberId, final String groupNumber,
											   final Date startDate, final Date endDate, final int enrollmentStatus, final String notes, final ServiceContext serviceContext) throws PortalException {

		PlanEnrollment enrollment = planEnrollmentLocalService.getPlanEnrollment(planEnrollmentId);

		int status = enrollment.getStatus();

		if (!enrollment.isPending() && !enrollment.isDraft()) {
			status = WorkflowConstants.STATUS_DRAFT;

			enrollment.setStatus(status);
			enrollment.setStatusByUserId(serviceContext.getUserId());

			User user = userLocalService.getUser(serviceContext.getUserId());
			if (! Validator.isNull(user)) {
				enrollment.setStatusByUserName(user.getFullName());
			}
			enrollment.setStatusDate(serviceContext.getModifiedDate(new Date()));
		}

		// set the standard fields
		enrollment.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		// set the business fields
		enrollment.setMemberId(memberId);
		enrollment.setGroupNumber(groupNumber);
		enrollment.setStartDate(startDate);
		enrollment.setEndDate(endDate);
		enrollment.setEnrollmentStatus(enrollmentStatus);
		enrollment.setNotes(notes);

		enrollment = planEnrollmentPersistence.update(enrollment);

		// Asset
		updateAsset(serviceContext.getUserId(), enrollment, serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());

		// Workflow
		return _startWorkflowInstance(serviceContext.getUserId(), enrollment, serviceContext);
	}

	@Override
	public List<PlanEnrollment> getPlanEnrollments(final long insurancePlanId, final int status, final int start, final int max) {
		if (status == WorkflowConstants.STATUS_ANY) {
			return planEnrollmentPersistence.findByInsurancePlan(insurancePlanId, start, max);
		}

		return planEnrollmentPersistence.findByIP_S(insurancePlanId, status, start, max);
	}

	@Override
	public int getPlanEnrollmentCounts(final long insurancePlanId, final int status) {
		if (status == WorkflowConstants.STATUS_ANY) {
			return planEnrollmentPersistence.countByInsurancePlan(insurancePlanId);
		}

		return planEnrollmentPersistence.countByIP_S(insurancePlanId, status);
	}

	@Override
	public int getPlanEnrollmentAndBenefitUsageCounts(final long insurancePlanId, final int status) throws PortalException{
		// yes this is not ideal, but we shouldn't have numbers that are too big.
		// when we get there, we can turn this into a custom finder.
		List<PlanEnrollment> enrollments = planEnrollmentLocalService.getPlanEnrollments(insurancePlanId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		int count = 0;

		for (PlanEnrollment enrollment : enrollments) {
			count ++;

			count += _benefitUsageLocalService.getBenefitUsagesCountByPlanEnrollmentStatus(enrollment.getPlanEnrollmentId(), status);
		}

		return count;
	}

	@Override
	public List<Object> getPlanEnrollmentAndBenefitUsages(final long insurancePlanId, final int status, int start, int max) throws PortalException{
		// Normalize inputs
		if (start < 0) {
			start = 0;
		}

		if (max <= 0) {
			return Collections.emptyList();
		}

		// list to hold the combined objects
		final List<Object> results = new ArrayList<>();

		// Fetch all enrollments for the plan (as provided in the prompt).
		// not ideal, but we don't know where the start/end will fall.
		final List<PlanEnrollment> enrollments =
				planEnrollmentLocalService.getPlanEnrollments(
						insurancePlanId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		// Current index in the flattened stream
		int globalIndex = 0;

		for (PlanEnrollment enrollment : enrollments) {
			// if we've already hit the end, break out of this loop
			if (results.size() >= max) {
				break;
			}

			// 1) Handle the enrollment item in the flattened stream.
			if (globalIndex >= start) {
				results.add(enrollment);

				if (results.size() >= max) {
					break;
				}
			}

			globalIndex++;

			// 2) Handle the usage block that follows this enrollment.
			final long planEnrollmentId = enrollment.getPlanEnrollmentId();

			final int usageCount =
					_benefitUsageLocalService.getBenefitUsagesCountByPlanEnrollmentStatus(
							planEnrollmentId, status);

			if (usageCount <= 0) {
				continue;
			}

			// If the entire usage block ends before 'start', skip without fetching.
			// Usage block covers indices [globalIndex, globalIndex + usageCount - 1]
			if (globalIndex + usageCount <= start) {
				globalIndex += usageCount;
				continue;
			}

			// Otherwise, the usage block overlaps the requested window.
			// Compute the starting offset within this usage block.
			final int localStart = Math.max(0, start - globalIndex);

			// Compute how many we still need to fill this page.
			final int remaining = max - results.size();

			// Compute localEnd (exclusive) within this usage block.
			final int localEndExclusive = Math.min(localStart + remaining, usageCount);

			if (localStart < localEndExclusive) {
				/*
				 * Prefer fetching only the needed slice.
				 *
				 * If your service layer does NOT have a paged variant, you can:
				 *  - fetch ALL usages for this enrollment and manually add only [localStart, localEndExclusive)
				 *    (still avoids iterating over all enrollments/usages globally, but is less optimal per enrollment).
				 *
				 * Most Liferay *LocalService methods have start/end pagination; adjust the call if your signature differs.
				 */
				final List<BenefitUsage> pageOfUsages =
						_benefitUsageLocalService.getBenefitUsagesByPlanEnrollmentStatus(
								planEnrollmentId, status, localStart, localEndExclusive);

				for (BenefitUsage usage : pageOfUsages) {
					results.add(usage);

					if (results.size() >= max) {
						break;
					}
				}
			}

			// Advance global index by the full usageCount (we conceptually traversed them),
			// even if we only fetched a slice.
			globalIndex += usageCount;
		}

		return results;
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param  userId the primary key of the user moving the insurance plan
	 * @param  enrollment the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PlanEnrollment movePlanEnrollmentToTrash(long userId, PlanEnrollment enrollment)
			throws PortalException {

		// Entry

		if (enrollment.isInTrash()) {
			throw new TrashEntryException();
		}

		int oldStatus = enrollment.getStatus();

		if (oldStatus == WorkflowConstants.STATUS_PENDING) {
			enrollment.setStatus(WorkflowConstants.STATUS_DRAFT);

			enrollment = planEnrollmentPersistence.update(enrollment);
		}

		enrollment = updateStatus(
				userId, enrollment.getPlanEnrollmentId(), WorkflowConstants.STATUS_IN_TRASH,
				new ServiceContext(), new HashMap<>());

		// Workflow

		if (oldStatus == WorkflowConstants.STATUS_PENDING) {
			_workflowInstanceLinkLocalService.deleteWorkflowInstanceLink(
					enrollment.getCompanyId(), enrollment.getGroupId(),
					PlanEnrollment.class.getName(), enrollment.getPlanEnrollmentId());
		}

		return enrollment;
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param  userId the primary key of the user moving the insurance plan
	 * @param  planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public PlanEnrollment movePlanEnrollmentToTrash(long userId, long planEnrollmentId)
			throws PortalException {

		PlanEnrollment enrollment = planEnrollmentPersistence.findByPrimaryKey(planEnrollmentId);

		return planEnrollmentLocalService.movePlanEnrollmentToTrash(userId, enrollment);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param  userId the primary key of the user restoring the insurance plan
	 * @param  planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PlanEnrollment restorePlanEnrollmentFromTrash(long userId, long planEnrollmentId)
			throws PortalException {

		// Insurance Plan

		PlanEnrollment enrollment = planEnrollmentPersistence.findByPrimaryKey(planEnrollmentId);

		if (!enrollment.isInTrash()) {
			throw new RestoreEntryException(
					RestoreEntryException.INVALID_STATUS);
		}

		TrashEntry trashEntry = _trashEntryLocalService.getEntry(
				PlanEnrollment.class.getName(), planEnrollmentId);

		enrollment = updateStatus(
				userId, planEnrollmentId, trashEntry.getStatus(), new ServiceContext(),
				new HashMap<>());

		return enrollment;
	}

	public void addResources(final PlanEnrollment enrollment, final boolean addGroupPermissions, final boolean addGuestPermissions) throws PortalException {
		_resourceLocalService.addResources(enrollment.getCompanyId(), enrollment.getGroupId(), enrollment.getUserId(), PlanEnrollment.class.getName(),
				enrollment.getPlanEnrollmentId(), false, addGroupPermissions, addGuestPermissions);
	}

	public void addResources(final PlanEnrollment enrollment, final ModelPermissions modelPermissions) throws PortalException {
		_resourceLocalService.addModelResources(enrollment.getCompanyId(), enrollment.getGroupId(), enrollment.getUserId(), PlanEnrollment.class.getName(),
				enrollment.getPlanEnrollmentId(), modelPermissions);
	}

	public void updateAsset(final long userId, final PlanEnrollment enrollment, final long[] assetCategoryIds,
							final String[] assetTagNames, final long[] assetLinkEntryIds, final double assetPriority) throws PortalException {
		boolean visible = false;

		if (enrollment.isApproved()) {
			visible = true;
		}

		AssetEntry assetEntry = _assetEntryLocalService.updateEntry(userId, enrollment.getGroupId(), enrollment.getCreateDate(),
				enrollment.getModifiedDate(), PlanEnrollment.class.getName(), enrollment.getPlanEnrollmentId(), enrollment.getUuid(), 0, assetCategoryIds,
				assetTagNames, true, visible, null, null, null, null, ContentTypes.TEXT_HTML, enrollment.getMemberUserName(),
				enrollment.getSummary(), enrollment.getSummary(), null, null, 0, 0, assetPriority);

		_assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), assetLinkEntryIds, AssetLinkConstants.TYPE_RELATED);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PlanEnrollment updateStatus(
			long userId, long planEnrollmentId, int status,
			ServiceContext serviceContext,
			Map<String, Serializable> workflowContext)
			throws PortalException {

		// Insurance Plan

		User user = userLocalService.getUser(userId);
		Date date = new Date();

		PlanEnrollment enrollment = planEnrollmentPersistence.findByPrimaryKey(planEnrollmentId);

		int oldStatus = enrollment.getStatus();

		enrollment.setStatus(status);
		enrollment.setStatusByUserId(user.getUserId());
		enrollment.setStatusByUserName(user.getFullName());
		enrollment.setStatusDate(serviceContext.getModifiedDate(date));

		enrollment = planEnrollmentPersistence.update(enrollment);

		// Statistics

		AssetEntry assetEntry = _assetEntryLocalService.fetchEntry(
				PlanEnrollment.class.getName(), planEnrollmentId);

		if ((assetEntry == null) || (assetEntry.getPublishDate() == null)) {
			serviceContext.setCommand(Constants.ADD);
		}

		InsurancePlan insurancePlan = _insurancePlanLocalService.getInsurancePlan(enrollment.getInsurancePlanId());

		JSONObject extraDataJSONObject = JSONUtil.put(
				"title", insurancePlan.getPlanName() + " For " + enrollment.getMemberUserName());

		if (status == WorkflowConstants.STATUS_APPROVED) {

			// Resources

			if ((oldStatus == WorkflowConstants.STATUS_DRAFT) &&
					GetterUtil.getBoolean(
							serviceContext.getAttribute("addEntryResources"))) {

				if (serviceContext.isAddGroupPermissions() ||
						serviceContext.isAddGuestPermissions()) {

					addResources(
							enrollment, serviceContext.isAddGroupPermissions(),
							serviceContext.isAddGuestPermissions());
				}
				else {
					addResources(
							enrollment, serviceContext.getModelPermissions());
				}
			}

			// Asset

			_assetEntryLocalService.updateEntry(
					PlanEnrollment.class.getName(), planEnrollmentId, enrollment.getCreateDate(),
					null, true, true);

			// Trash

			if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.deleteEntry(
						PlanEnrollment.class.getName(), planEnrollmentId);
			}
		}
		else {

			// Asset

			_assetEntryLocalService.updateVisible(
					PlanEnrollment.class.getName(), planEnrollmentId, false);

			// Trash

			if (status == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.addTrashEntry(
						userId, enrollment.getGroupId(), PlanEnrollment.class.getName(),
						enrollment.getPlanEnrollmentId(), enrollment.getUuid(), null, oldStatus, null,
						null);
			}
			else if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.deleteEntry(
						PlanEnrollment.class.getName(), planEnrollmentId);
			}
		}

		return enrollment;
	}

	private PlanEnrollment _startWorkflowInstance(final long userId, final PlanEnrollment enrollment, final ServiceContext serviceContext) throws PortalException {
		Map<String, Serializable> workflowContext =
				(Map<String, Serializable>) serviceContext.removeAttribute(
						"workflowContext");

		if (workflowContext == null) {
			workflowContext = Collections.emptyMap();
		}

		return WorkflowHandlerRegistryUtil.startWorkflowInstance(
				enrollment.getCompanyId(), enrollment.getGroupId(),
				userId, PlanEnrollment.class.getName(),
				enrollment.getPlanEnrollmentId(), enrollment,
				serviceContext, workflowContext);
	}

	@Reference
	private AssetEntryLocalService _assetEntryLocalService;

	@Reference
	private AssetLinkLocalService _assetLinkLocalService;

	@Reference
	private ClassNameLocalService _classNameLocalService;

	@Reference
	private ExpandoRowLocalService _expandoRowLocalService;

	@Reference
	private ResourceLocalService _resourceLocalService;

	@Reference
	private TrashEntryLocalService _trashEntryLocalService;

	@Reference
	private WorkflowInstanceLinkLocalService _workflowInstanceLinkLocalService;

	@Reference
	private InsurancePlanLocalService _insurancePlanLocalService;

	@Reference
	private BenefitUsageLocalService _benefitUsageLocalService;

	private static final Log _log = LogFactoryUtil.getLog(PlanEnrollmentLocalServiceImpl.class);
}
