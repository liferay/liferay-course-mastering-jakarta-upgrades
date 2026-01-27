/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.base.InsurancePlanLocalServiceBaseImpl;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.asset.link.constants.AssetLinkConstants;
import com.liferay.asset.link.service.AssetLinkLocalService;
import com.liferay.expando.kernel.service.ExpandoRowLocalService;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.portal.kernel.service.ResourceLocalService;
import com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalService;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.trash.exception.RestoreEntryException;
import com.liferay.trash.exception.TrashEntryException;
import com.liferay.trash.model.TrashEntry;
import com.liferay.trash.service.TrashEntryLocalService;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;

import java.util.*;
import java.io.Serializable;

import com.liferay.portal.kernel.util.ContentTypes;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import org.osgi.service.component.annotations.Reference;

/**
 * @author liferay-enablement
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan",
	service = AopService.class
)
public class InsurancePlanLocalServiceImpl extends InsurancePlanLocalServiceBaseImpl {

	private static final Log _log = LogFactoryUtil.getLog(InsurancePlanLocalServiceImpl.class);

	/**
	 * Adds a new insurance plan with the default coverage period of 12 months.
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public InsurancePlan addInsurancePlan(final String providerName, final String planName,
		final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents, 
		final long annualContactsAllowanceCents, final ServiceContext serviceContext) throws PortalException {
		
		return insurancePlanLocalService.addInsurancePlan(providerName, planName, annualExamAllowanceCents, annualFramesAllowanceCents,
			annualLensesAllowanceCents, annualContactsAllowanceCents, 12, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public InsurancePlan addInsurancePlan(final String providerName, final String planName,
		final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents, 
		final long annualContactsAllowanceCents, final int coveragePeriodMonths, final ServiceContext serviceContext) throws PortalException {
		
		return insurancePlanLocalService.addInsurancePlan(providerName, planName, true, annualExamAllowanceCents, annualFramesAllowanceCents,
			annualLensesAllowanceCents, annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param providerName
	 * @param planName
	 * @param active
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsurancePlan addInsurancePlan(final String providerName, final String planName, final boolean active,
		final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents, 
		final long annualContactsAllowanceCents, final int coveragePeriodMonths, final ServiceContext serviceContext) throws PortalException {

		InsurancePlan insurancePlan = createInsurancePlan(counterLocalService.increment(InsurancePlan.class.getName()));

		// set the standard fields
		insurancePlan.setGroupId(serviceContext.getScopeGroupId());
		insurancePlan.setCompanyId(serviceContext.getCompanyId());
		insurancePlan.setUserId(serviceContext.getUserId());
		insurancePlan.setCreateDate(serviceContext.getCreateDate(new Date()));
		insurancePlan.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		User user = userLocalService.getUser(serviceContext.getUserId());

		if (! Validator.isNull(user)) {
			insurancePlan.setUserName(user.getFullName());
		}

		// set the business fields
		insurancePlan.setProviderName(providerName);
		insurancePlan.setPlanName(planName);
		insurancePlan.setActive(active);
		insurancePlan.setAnnualExamAllowanceCents(annualExamAllowanceCents);
		insurancePlan.setAnnualFramesAllowanceCents(annualFramesAllowanceCents);
		insurancePlan.setAnnualLensesAllowanceCents(annualLensesAllowanceCents);
		insurancePlan.setAnnualContactsAllowanceCents(annualContactsAllowanceCents);
		insurancePlan.setCoveragePeriodMonths(coveragePeriodMonths);

		insurancePlan = insurancePlanPersistence.update(insurancePlan);

		// Resources
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addResources(insurancePlan, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions());
		}
		else {
			addResources(insurancePlan, serviceContext.getModelPermissions());
		}

		// Asset
		updateAsset(serviceContext.getUserId(), insurancePlan, serviceContext.getAssetCategoryIds(),
			serviceContext.getAssetTagNames(), serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());
		
		// Workflow
		return _startWorkflowInstance(serviceContext.getUserId(), insurancePlan, serviceContext);
	}

	@Indexable(type = IndexableType.DELETE)
	@Override
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public InsurancePlan deleteInsurancePlan(InsurancePlan insurancePlan) throws PortalException {

		// plan entries
		_planEnrollmentLocalService.deleteInsurancePlanEnrollments(insurancePlan.getInsurancePlanId());

		// Entry

		insurancePlanPersistence.remove(insurancePlan);

		// Resources

		_resourceLocalService.deleteResource(
				insurancePlan.getCompanyId(), InsurancePlan.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, insurancePlan.getInsurancePlanId());

		// Asset

		_assetEntryLocalService.deleteEntry(
				InsurancePlan.class.getName(), insurancePlan.getInsurancePlanId());

		// Expando

		_expandoRowLocalService.deleteRows(
				insurancePlan.getCompanyId(),
				_classNameLocalService.getClassNameId(InsurancePlan.class.getName()),
				insurancePlan.getInsurancePlanId());

		// Trash

		_trashEntryLocalService.deleteEntry(
				InsurancePlan.class.getName(), insurancePlan.getInsurancePlanId());

		// Workflow

		_workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
				insurancePlan.getCompanyId(), insurancePlan.getGroupId(),
				InsurancePlan.class.getName(), insurancePlan.getInsurancePlanId());

		return insurancePlan;
	}

	@Override
	public InsurancePlan deleteInsurancePlan(long insurancePlanId) throws PortalException {
		InsurancePlan insurancePlan = insurancePlanPersistence.findByPrimaryKey(insurancePlanId);

		return insurancePlanLocalService.deleteInsurancePlan(insurancePlan);
	}

	/**
	 * deleteGroupInsurancePlans: Deletes all insurance plans in the group, called by the group
	 * model listener to clean up any data when the group is being deleted.
	 *
	 * @param groupId
	 * @throws PortalException
	 */
	@Override
	public void deleteGroupInsurancePlans(final long groupId) throws PortalException {
		ActionableDynamicQuery adq = insurancePlanLocalService.getActionableDynamicQuery();

		adq.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
			@Override
			public void addCriteria(DynamicQuery dynamicQuery) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("groupId", groupId));
			}
		});

		adq.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<InsurancePlan>() {
			@Override
			public void performAction(InsurancePlan insurancePlan) throws PortalException {
				insurancePlanLocalService.deleteInsurancePlan(insurancePlan);
			}
		});

		adq.performActions();
	}

	@Override
	public InsurancePlan getInsurancePlanByExternalReferenceCode(final String externalReferenceCode) {
		DynamicQuery dq = insurancePlanLocalService.dynamicQuery();

		dq.add(RestrictionsFactoryUtil.eq("externalReferenceCode", externalReferenceCode));

		List<InsurancePlan> results = insurancePlanPersistence.findWithDynamicQuery(dq);

		if (results.size() > 0) {
			return results.get(0);
		}

		return null;
	}

	@Override
	public List<InsurancePlan> getInsurancePlansByGroup(final long groupId, final int start, final int max) throws PortalException {
		return insurancePlanPersistence.findByGroupId(groupId, start, max);
	}

	/**
	 * getInsurancePlans: Returns all of the plans in the given group with the given status, used by the
	 * TrashHandler implementation.
	 * @param groupId
	 * @param status
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 */
	public List<InsurancePlan> getInsurancePlans(final long groupId, final int status, final int start, final int end) throws PortalException {
		if (status == WorkflowConstants.STATUS_ANY) {
			return insurancePlanPersistence.findByGroupId(groupId, start, end);
		}

		return insurancePlanPersistence.findByG_S(groupId, status, start, end);
	}

	public int getInsurancePlansCount(final long groupId, final int status) throws PortalException {
		if (status == WorkflowConstants.STATUS_ANY) {
			return insurancePlanPersistence.countByGroupId(groupId);
		}

		return insurancePlanPersistence.countByG_S(groupId, status);
	}

	/**
	 * Adds a new insurance plan with the default coverage period of 12 months.
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public InsurancePlan updateInsurancePlan(final long insurancePlanId, final String providerName, final String planName,
		final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents, 
		final long annualContactsAllowanceCents, final ServiceContext serviceContext) throws PortalException {
		
		return insurancePlanLocalService.updateInsurancePlan(insurancePlanId, providerName, planName, annualExamAllowanceCents, annualFramesAllowanceCents,
			annualLensesAllowanceCents, annualContactsAllowanceCents, 12, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public InsurancePlan updateInsurancePlan(final long insurancePlanId, final String providerName, final String planName,
		final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents, 
		final long annualContactsAllowanceCents, final int coveragePeriodMonths, final ServiceContext serviceContext) throws PortalException {
		
		return insurancePlanLocalService.updateInsurancePlan(insurancePlanId, providerName, planName, true, annualExamAllowanceCents, annualFramesAllowanceCents,
			annualLensesAllowanceCents, annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param providerName
	 * @param planName
	 * @param active
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsurancePlan updateInsurancePlan(final long insurancePlanId, final String providerName, final String planName, final boolean active,
		final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents, 
		final long annualContactsAllowanceCents, final int coveragePeriodMonths, final ServiceContext serviceContext) throws PortalException {

		InsurancePlan insurancePlan = insurancePlanLocalService.getInsurancePlan(insurancePlanId);

		int status = insurancePlan.getStatus();

		if (!insurancePlan.isPending() && !insurancePlan.isDraft()) {
			status = WorkflowConstants.STATUS_DRAFT;

			insurancePlan.setStatus(status);
			insurancePlan.setStatusByUserId(serviceContext.getUserId());

			User user = userLocalService.getUser(serviceContext.getUserId());
			if (! Validator.isNull(user)) {
				insurancePlan.setStatusByUserName(user.getFullName());
			}
			insurancePlan.setStatusDate(serviceContext.getModifiedDate(new Date()));
		}

		// set the standard fields
		insurancePlan.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		// set the business fields
		insurancePlan.setProviderName(providerName);
		insurancePlan.setPlanName(planName);
		insurancePlan.setActive(active);
		insurancePlan.setAnnualExamAllowanceCents(annualExamAllowanceCents);
		insurancePlan.setAnnualFramesAllowanceCents(annualFramesAllowanceCents);
		insurancePlan.setAnnualLensesAllowanceCents(annualLensesAllowanceCents);
		insurancePlan.setAnnualContactsAllowanceCents(annualContactsAllowanceCents);
		insurancePlan.setCoveragePeriodMonths(coveragePeriodMonths);

		insurancePlan = insurancePlanPersistence.update(insurancePlan);

		// Asset
		updateAsset(serviceContext.getUserId(), insurancePlan, serviceContext.getAssetCategoryIds(),
			serviceContext.getAssetTagNames(), serviceContext.getAssetLinkEntryIds(), serviceContext.getAssetPriority());
		
		// Workflow
		return _startWorkflowInstance(serviceContext.getUserId(), insurancePlan, serviceContext);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param  userId the primary key of the user moving the insurance plan
	 * @param  insurancePlan the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsurancePlan moveInsurancePlanToTrash(long userId, InsurancePlan insurancePlan)
		throws PortalException {

		// Entry

		if (insurancePlan.isInTrash()) {
			throw new TrashEntryException();
		}

		int oldStatus = insurancePlan.getStatus();

		if (oldStatus == WorkflowConstants.STATUS_PENDING) {
			insurancePlan.setStatus(WorkflowConstants.STATUS_DRAFT);

			insurancePlan = insurancePlanPersistence.update(insurancePlan);
		}

		insurancePlan = updateStatus(
			userId, insurancePlan.getInsurancePlanId(), WorkflowConstants.STATUS_IN_TRASH,
			new ServiceContext(), new HashMap<>());

		// Workflow

		if (oldStatus == WorkflowConstants.STATUS_PENDING) {
			_workflowInstanceLinkLocalService.deleteWorkflowInstanceLink(
				insurancePlan.getCompanyId(), insurancePlan.getGroupId(),
				InsurancePlan.class.getName(), insurancePlan.getInsurancePlanId());
		}

		return insurancePlan;
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param  userId the primary key of the user moving the insurance plan
	 * @param  insurancePlanId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public InsurancePlan moveInsurancePlanToTrash(long userId, long insurancePlanId)
		throws PortalException {

		InsurancePlan insurancePlan = insurancePlanPersistence.findByPrimaryKey(insurancePlanId);

		return insurancePlanLocalService.moveInsurancePlanToTrash(userId, insurancePlan);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param  userId the primary key of the user restoring the insurance plan
	 * @param  insurancePlanId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsurancePlan restoreInsurancePlanFromTrash(long userId, long insurancePlanId)
		throws PortalException {

		// Insurance Plan

		InsurancePlan insurancePlan = insurancePlanPersistence.findByPrimaryKey(insurancePlanId);

		if (!insurancePlan.isInTrash()) {
			throw new RestoreEntryException(
				RestoreEntryException.INVALID_STATUS);
		}

		TrashEntry trashEntry = _trashEntryLocalService.getEntry(
			InsurancePlan.class.getName(), insurancePlanId);

		insurancePlan = updateStatus(
			userId, insurancePlanId, trashEntry.getStatus(), new ServiceContext(),
			new HashMap<>());

		return insurancePlan;
	}

	public void addResources(final InsurancePlan insurancePlan, final boolean addGroupPermissions, final boolean addGuestPermissions) throws PortalException {
		_resourceLocalService.addResources(insurancePlan.getCompanyId(), insurancePlan.getGroupId(), insurancePlan.getUserId(), InsurancePlan.class.getName(), 
			insurancePlan.getInsurancePlanId(), false, addGroupPermissions, addGuestPermissions);
	}

	public void addResources(final InsurancePlan insurancePlan, final ModelPermissions modelPermissions) throws PortalException {
		_resourceLocalService.addModelResources(insurancePlan.getCompanyId(), insurancePlan.getGroupId(), insurancePlan.getUserId(), InsurancePlan.class.getName(),
			insurancePlan.getInsurancePlanId(), modelPermissions);
	}

	public void updateAsset(final long userId, final InsurancePlan insurancePlan, final long[] assetCategoryIds, 
			final String[] assetTagNames, final long[] assetLinkEntryIds, final double assetPriority) throws PortalException {
		boolean visible = false;

		if (insurancePlan.isApproved()) {
			visible = true;
		}

		AssetEntry assetEntry = _assetEntryLocalService.updateEntry(userId, insurancePlan.getGroupId(), insurancePlan.getCreateDate(),
			insurancePlan.getModifiedDate(), InsurancePlan.class.getName(), insurancePlan.getInsurancePlanId(), insurancePlan.getUuid(), 0, assetCategoryIds, 
			assetTagNames, true, visible, null, null, null, null, ContentTypes.TEXT_HTML, insurancePlan.getPlanName(),
				insurancePlan.getSummary(), insurancePlan.getSummary(), null, null, 0, 0, assetPriority);

		_assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), assetLinkEntryIds, AssetLinkConstants.TYPE_RELATED);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InsurancePlan updateStatus(
			long userId, long insurancePlanId, int status,
			ServiceContext serviceContext,
			Map<String, Serializable> workflowContext)
		throws PortalException {

		// Insurance Plan

		User user = userLocalService.getUser(userId);
		Date date = new Date();

		InsurancePlan insurancePlan = insurancePlanPersistence.findByPrimaryKey(insurancePlanId);

		int oldStatus = insurancePlan.getStatus();

		insurancePlan.setStatus(status);
		insurancePlan.setStatusByUserId(user.getUserId());
		insurancePlan.setStatusByUserName(user.getFullName());
		insurancePlan.setStatusDate(serviceContext.getModifiedDate(date));

		insurancePlan = insurancePlanPersistence.update(insurancePlan);

		// Statistics

		AssetEntry assetEntry = _assetEntryLocalService.fetchEntry(
			InsurancePlan.class.getName(), insurancePlanId);

		if ((assetEntry == null) || (assetEntry.getPublishDate() == null)) {
			serviceContext.setCommand(Constants.ADD);
		}

		JSONObject extraDataJSONObject = JSONUtil.put(
			"title", insurancePlan.getPlanName());

		if (status == WorkflowConstants.STATUS_APPROVED) {

			// Resources

			if ((oldStatus == WorkflowConstants.STATUS_DRAFT) &&
				GetterUtil.getBoolean(
					serviceContext.getAttribute("addEntryResources"))) {

				if (serviceContext.isAddGroupPermissions() ||
					serviceContext.isAddGuestPermissions()) {

					addResources(
						insurancePlan, serviceContext.isAddGroupPermissions(),
						serviceContext.isAddGuestPermissions());
				}
				else {
					addResources(
						insurancePlan, serviceContext.getModelPermissions());
				}
			}

			// Asset

			_assetEntryLocalService.updateEntry(
				InsurancePlan.class.getName(), insurancePlanId, insurancePlan.getCreateDate(),
				null, true, true);

			// Trash

			if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.deleteEntry(
					InsurancePlan.class.getName(), insurancePlanId);
			}
		}
		else {

			// Asset

			_assetEntryLocalService.updateVisible(
				InsurancePlan.class.getName(), insurancePlanId, false);

			// Trash

			if (status == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.addTrashEntry(
					userId, insurancePlan.getGroupId(), InsurancePlan.class.getName(),
					insurancePlan.getInsurancePlanId(), insurancePlan.getUuid(), null, oldStatus, null,
					null);
			}
			else if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
				_trashEntryLocalService.deleteEntry(
					InsurancePlan.class.getName(), insurancePlanId);
			}
		}

		return insurancePlan;
	}

	private InsurancePlan _startWorkflowInstance(final long userId, final InsurancePlan insurancePlan, final ServiceContext serviceContext) throws PortalException {
		Map<String, Serializable> workflowContext =
			(Map<String, Serializable>) serviceContext.removeAttribute(
				"workflowContext");

		if (workflowContext == null) {
			workflowContext = Collections.emptyMap();
		}

		return WorkflowHandlerRegistryUtil.startWorkflowInstance(
			insurancePlan.getCompanyId(), insurancePlan.getGroupId(),
			userId, InsurancePlan.class.getName(),
			insurancePlan.getInsurancePlanId(), insurancePlan,
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
}
