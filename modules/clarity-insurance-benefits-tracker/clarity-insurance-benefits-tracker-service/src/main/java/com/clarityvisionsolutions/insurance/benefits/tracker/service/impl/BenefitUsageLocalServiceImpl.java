
/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.base.BenefitUsageLocalServiceBaseImpl;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.asset.link.constants.AssetLinkConstants;
import com.liferay.asset.link.service.AssetLinkLocalService;
import com.liferay.expando.kernel.service.ExpandoRowLocalService;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
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
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage",
	service = AopService.class
)
public class BenefitUsageLocalServiceImpl
	extends BenefitUsageLocalServiceBaseImpl {

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BenefitUsage addBenefitUsage(final long planEnrollmentId, final String benefitType, final long amountUsedCents, final Date serviceDate, final String reference,
										final String notes, final String sourceType, final String sourceReference, final ServiceContext serviceContext) throws PortalException {

		// verify the enrollment exists
		PlanEnrollment enrollment = _planEnrollmentLocalService.getPlanEnrollment(planEnrollmentId);

		BenefitUsage usage = benefitUsageLocalService.createBenefitUsage(counterLocalService.increment(BenefitUsage.class.getName()));

		// update system fields
		usage.setCompanyId(serviceContext.getCompanyId());
		usage.setGroupId(serviceContext.getScopeGroupId());
		usage.setUserId(serviceContext.getUserId());
		User user = userLocalService.getUser(serviceContext.getUserId());
		if (user != null) {
			usage.setUserName(user.getFullName());
		}
		usage.setCreateDate(serviceContext.getCreateDate(new Date()));
		usage.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		// update business fields
		usage.setPlanEnrollmentId(planEnrollmentId);
		usage.setBenefitType(benefitType);
		usage.setAmountUsedCents(amountUsedCents);
		usage.setServiceDate(serviceDate);
		usage.setReference(reference);
		usage.setNotes(notes);
		usage.setSourceType(sourceType);
		usage.setSourceReference(sourceReference);

		usage = benefitUsageLocalService.updateBenefitUsage(usage);

		// Resources
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addResources(usage, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions());
		}
		else {
			addResources(usage, serviceContext.getModelPermissions());
		}

		// Asset
		updateAsset(serviceContext.getUserId(), usage, serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());

		// Workflow
		return _startWorkflowInstance(serviceContext.getUserId(), usage, serviceContext);
	}


	@Indexable(type = IndexableType.DELETE)
	@Override
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public BenefitUsage deleteBenefitUsage(BenefitUsage usage) throws PortalException {

		// Entry

		insurancePlanPersistence.remove(usage);

		// Resources

		_resourceLocalService.deleteResource(
				usage.getCompanyId(), BenefitUsage.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, usage.getBenefitUsageId());

		// Asset

		_assetEntryLocalService.deleteEntry(
				BenefitUsage.class.getName(), usage.getBenefitUsageId());

		// Expando

		_expandoRowLocalService.deleteRows(
				usage.getCompanyId(),
				_classNameLocalService.getClassNameId(BenefitUsage.class.getName()),
				usage.getBenefitUsageId());

		// Trash

		_trashEntryLocalService.deleteEntry(
				BenefitUsage.class.getName(), usage.getBenefitUsageId());

		// Workflow

		_workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
				usage.getCompanyId(), usage.getGroupId(),
				BenefitUsage.class.getName(), usage.getBenefitUsageId());

		return usage;
	}

	@Override
	public BenefitUsage deleteBenefitUsage(long benefitUsageId) throws PortalException {
		BenefitUsage insurancePlan = benefitUsagePersistence.findByPrimaryKey(benefitUsageId);

		return benefitUsageLocalService.deleteBenefitUsage(insurancePlan);
	}

	/**
	 * deletePlanEnrollmentBenefitUsages: Deletes all of the benefit usages associated with the
	 * given plan enrollment. Used to clean up data and not leave orphaned records.
	 * @param planEnrollmentId
	 * @throws PortalException
	 */
	@Override
	public void deletePlanEnrollmentBenefitUsages(final long planEnrollmentId) throws PortalException {
		ActionableDynamicQuery adq = benefitUsageLocalService.getActionableDynamicQuery();

		adq.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
			@Override
			public void addCriteria(DynamicQuery dynamicQuery) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("planEnrollmentId", planEnrollmentId));
			}
		});

		adq.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<BenefitUsage>() {
			@Override
			public void performAction(BenefitUsage usage) throws PortalException {
				benefitUsageLocalService.deleteBenefitUsage(usage);
			}
		});

		adq.performActions();
	}

	@Override
	public List<BenefitUsage> getBenefitUsagesByPlanEnrollmentStatus(final long planEnrollmentId, final int status, final int start, final int max) throws PortalException {
		if (status == WorkflowConstants.STATUS_ANY) {
			return benefitUsagePersistence.findByPlanEnrollment(planEnrollmentId, start, max);
		}

		return benefitUsagePersistence.findByPE_S(planEnrollmentId, status, start, max);
	}

	@Override
	public int getBenefitUsagesCountByPlanEnrollmentStatus(final long planEnrollmentId, final int status) throws PortalException {
		if (status == WorkflowConstants.STATUS_ANY) {
			return benefitUsagePersistence.countByPlanEnrollment(planEnrollmentId);
		}

		return benefitUsagePersistence.countByPE_S(planEnrollmentId, status);
	}

	@Override
	public List<BenefitUsage> getBenefitUsagesByPlanEnrollmentsStatus(final List<Long> planEnrollmentIds, final int status, final int start, final int max) throws PortalException {
		DynamicQuery dq = benefitUsageLocalService.dynamicQuery();

		dq.add(RestrictionsFactoryUtil.in("planEnrollmentId", planEnrollmentIds));

		if (status != WorkflowConstants.STATUS_ANY) {
			dq.add(RestrictionsFactoryUtil.eq("status", status));
		}

		return benefitUsagePersistence.findWithDynamicQuery(dq, start, max);
	}

	@Override
	public int getBenefitUsagesCountByPlanEnrollmentsStatus(final List<Long> planEnrollmentIds, final int status) throws PortalException {
		DynamicQuery dq = benefitUsageLocalService.dynamicQuery();

		dq.add(RestrictionsFactoryUtil.in("planEnrollmentId", planEnrollmentIds));

		if (status != WorkflowConstants.STATUS_ANY) {
			dq.add(RestrictionsFactoryUtil.eq("status", status));
		}

		return (int) benefitUsagePersistence.countWithDynamicQuery(dq);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BenefitUsage updateBenefitUsage(final long benefitUsageId, final String benefitType, final long amountUsedCents, final Date serviceDate, final String reference,
										   final String notes, final String sourceType, final String sourceReference, final ServiceContext serviceContext) throws PortalException {

		BenefitUsage usage = benefitUsageLocalService.getBenefitUsage(benefitUsageId);

		int status = usage.getStatus();

		if (!usage.isPending() && !usage.isDraft()) {
			status = WorkflowConstants.STATUS_DRAFT;

			usage.setStatus(status);
			usage.setStatusByUserId(serviceContext.getUserId());

			User user = userLocalService.getUser(serviceContext.getUserId());
			if (! Validator.isNull(user)) {
				usage.setStatusByUserName(user.getFullName());
			}
			usage.setStatusDate(serviceContext.getModifiedDate(new Date()));
		}

		// set the standard fields
		usage.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		// set the business fields
		usage.setBenefitType(benefitType);
		usage.setAmountUsedCents(amountUsedCents);
		usage.setServiceDate(serviceDate);
		usage.setReference(reference);
		usage.setNotes(notes);
		usage.setSourceType(sourceType);
		usage.setSourceReference(sourceReference);

		usage = benefitUsagePersistence.update(usage);

		// Asset
		updateAsset(serviceContext.getUserId(), usage, serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());

		// Workflow
		return _startWorkflowInstance(serviceContext.getUserId(), usage, serviceContext);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param  userId the primary key of the user moving the insurance plan
	 * @param  usage the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BenefitUsage moveBenefitUsageToTrash(long userId, BenefitUsage usage)
			throws PortalException {

		// Entry

		if (usage.isInTrash()) {
			throw new TrashEntryException();
		}

		int oldStatus = usage.getStatus();

		if (oldStatus == WorkflowConstants.STATUS_PENDING) {
			usage.setStatus(WorkflowConstants.STATUS_DRAFT);

			usage = benefitUsagePersistence.update(usage);
		}

		usage = updateStatus(
				userId, usage.getBenefitUsageId(), WorkflowConstants.STATUS_IN_TRASH,
				new ServiceContext(), new HashMap<>());

		// Workflow

		if (oldStatus == WorkflowConstants.STATUS_PENDING) {
			_workflowInstanceLinkLocalService.deleteWorkflowInstanceLink(
					usage.getCompanyId(), usage.getGroupId(),
					BenefitUsage.class.getName(), usage.getBenefitUsageId());
		}

		return usage;
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param  userId the primary key of the user moving the insurance plan
	 * @param  benefitUsageId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public BenefitUsage moveBenefitUsageToTrash(long userId, long benefitUsageId)
			throws PortalException {

		BenefitUsage usage = benefitUsagePersistence.findByPrimaryKey(benefitUsageId);

		return benefitUsageLocalService.moveBenefitUsageToTrash(userId, usage);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param  userId the primary key of the user restoring the insurance plan
	 * @param  benefitUsageId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BenefitUsage restoreBenefitUsageFromTrash(long userId, long benefitUsageId)
			throws PortalException {

		// Insurance Plan

		BenefitUsage usage = benefitUsagePersistence.findByPrimaryKey(benefitUsageId);

		if (!usage.isInTrash()) {
			throw new RestoreEntryException(
					RestoreEntryException.INVALID_STATUS);
		}

		TrashEntry trashEntry = _trashEntryLocalService.getEntry(
				BenefitUsage.class.getName(), benefitUsageId);

		usage = updateStatus(
				userId, benefitUsageId, trashEntry.getStatus(), new ServiceContext(),
				new HashMap<>());

		return usage;
	}

	public void addResources(final BenefitUsage usage, final boolean addGroupPermissions, final boolean addGuestPermissions) throws PortalException {
		_resourceLocalService.addResources(usage.getCompanyId(), usage.getGroupId(), usage.getUserId(), BenefitUsage.class.getName(),
				usage.getBenefitUsageId(), false, addGroupPermissions, addGuestPermissions);
	}

	public void addResources(final BenefitUsage usage, final ModelPermissions modelPermissions) throws PortalException {
		_resourceLocalService.addModelResources(usage.getCompanyId(), usage.getGroupId(), usage.getUserId(), BenefitUsage.class.getName(),
				usage.getBenefitUsageId(), modelPermissions);
	}

	public void updateAsset(final long userId, final BenefitUsage usage, final long[] assetCategoryIds,
							final String[] assetTagNames, final long[] assetLinkEntryIds, final double assetPriority) throws PortalException {
		boolean visible = false;

		if (usage.isApproved()) {
			visible = true;
		}

		PlanEnrollment enrollment = _planEnrollmentLocalService.getPlanEnrollment(usage.getPlanEnrollmentId());

		AssetEntry assetEntry = _assetEntryLocalService.updateEntry(userId, usage.getGroupId(), usage.getCreateDate(),
				usage.getModifiedDate(), BenefitUsage.class.getName(), usage.getBenefitUsageId(), usage.getUuid(), 0, assetCategoryIds,
				assetTagNames, true, visible, null, null, null, null, ContentTypes.TEXT_HTML, enrollment.getMemberUserName() + " Benefit Usage",
				usage.getSummary(), usage.getSummary(), null, null, 0, 0, assetPriority);

		_assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), assetLinkEntryIds, AssetLinkConstants.TYPE_RELATED);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BenefitUsage updateStatus(
			long userId, long benefitUsageId, int status,
			ServiceContext serviceContext,
			Map<String, Serializable> workflowContext)
			throws PortalException {

		// Insurance Plan

		User user = userLocalService.getUser(userId);
		Date date = new Date();

		BenefitUsage usage = benefitUsagePersistence.findByPrimaryKey(benefitUsageId);

		int oldStatus = usage.getStatus();

		usage.setStatus(status);
		usage.setStatusByUserId(user.getUserId());
		usage.setStatusByUserName(user.getFullName());
		usage.setStatusDate(serviceContext.getModifiedDate(date));

		usage = benefitUsagePersistence.update(usage);

		// Statistics

		AssetEntry assetEntry = _assetEntryLocalService.fetchEntry(
				BenefitUsage.class.getName(), benefitUsageId);

		if ((assetEntry == null) || (assetEntry.getPublishDate() == null)) {
			serviceContext.setCommand(Constants.ADD);
		}

		if (status == WorkflowConstants.STATUS_APPROVED) {

			// Resources

			if ((oldStatus == WorkflowConstants.STATUS_DRAFT) &&
					GetterUtil.getBoolean(
							serviceContext.getAttribute("addEntryResources"))) {

				if (serviceContext.isAddGroupPermissions() ||
						serviceContext.isAddGuestPermissions()) {

					addResources(
							usage, serviceContext.isAddGroupPermissions(),
							serviceContext.isAddGuestPermissions());
				}
				else {
					addResources(
							usage, serviceContext.getModelPermissions());
				}
			}

			// Asset

			_assetEntryLocalService.updateEntry(
					BenefitUsage.class.getName(), benefitUsageId, usage.getCreateDate(),
					null, true, true);

			// Trash

			if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.deleteEntry(
						BenefitUsage.class.getName(), benefitUsageId);
			}
		}
		else {

			// Asset

			_assetEntryLocalService.updateVisible(
					BenefitUsage.class.getName(), benefitUsageId, false);

			// Trash

			if (status == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.addTrashEntry(
						userId, usage.getGroupId(), BenefitUsage.class.getName(),
						usage.getBenefitUsageId(), usage.getUuid(), null, oldStatus, null,
						null);
			}
			else if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.deleteEntry(
						BenefitUsage.class.getName(), benefitUsageId);
			}
		}

		return usage;
	}

	private BenefitUsage _startWorkflowInstance(final long userId, final BenefitUsage usage, final ServiceContext serviceContext) throws PortalException {
		Map<String, Serializable> workflowContext =
				(Map<String, Serializable>) serviceContext.removeAttribute(
						"workflowContext");

		if (workflowContext == null) {
			workflowContext = Collections.emptyMap();
		}

		return WorkflowHandlerRegistryUtil.startWorkflowInstance(
				usage.getCompanyId(), usage.getGroupId(),
				userId, BenefitUsage.class.getName(),
				usage.getBenefitUsageId(), usage,
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
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

	private static final Log _log = LogFactoryUtil.getLog(BenefitUsageLocalServiceImpl.class);
}
