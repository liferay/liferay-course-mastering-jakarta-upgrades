/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerConstants;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.base.InsurancePlanServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=cibt",
		"json.web.service.context.path=InsurancePlan"
	},
	service = AopService.class
)
public class InsurancePlanServiceImpl extends InsurancePlanServiceBaseImpl {

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

		_portletResourcePermission.check(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY);

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

		_portletResourcePermission.check(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY);

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
	@Override
	public InsurancePlan addInsurancePlan(final String providerName, final String planName, final boolean active,
										  final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents,
										  final long annualContactsAllowanceCents, final int coveragePeriodMonths, final ServiceContext serviceContext) throws PortalException {

		_portletResourcePermission.check(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY);

		return insurancePlanLocalService.addInsurancePlan(providerName, planName, active, annualExamAllowanceCents, annualFramesAllowanceCents,
				annualLensesAllowanceCents, annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
	}

	@Override
	public InsurancePlan deleteInsurancePlan(long insurancePlanId) throws PortalException {
		_insurancePlanModelResourcePermission.check(
				getPermissionChecker(), insurancePlanId, ActionKeys.DELETE);


		return insurancePlanLocalService.deleteInsurancePlan(insurancePlanId);
	}

	@Override
	public InsurancePlan getInsurancePlan(final long insurancePlanId) throws PortalException {
		InsurancePlan plan = insurancePlanLocalService.getInsurancePlan(insurancePlanId);

		_insurancePlanModelResourcePermission.check(getPermissionChecker(), plan, ActionKeys.VIEW);

		return plan;
	}

	@Override
	public List<InsurancePlan> getGroupInsurancePlans(final long groupId, final int status, final int start, final int end) {
		if (status == WorkflowConstants.STATUS_ANY) {
			return insurancePlanPersistence.filterFindByG_NotS(groupId, WorkflowConstants.STATUS_IN_TRASH, start, end);
		}

		return insurancePlanPersistence.filterFindByG_S(groupId, status, start, end);
	}

	@Override
	public int getGroupInsurancePlansCount(final long groupId, final int status) {
		if (status == WorkflowConstants.STATUS_ANY) {
			return insurancePlanPersistence.filterCountByG_NotS(groupId, WorkflowConstants.STATUS_IN_TRASH);
		}

		return insurancePlanPersistence.filterCountByG_S(groupId, status);
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

		_insurancePlanModelResourcePermission.check(
				getPermissionChecker(), insurancePlanId, ActionKeys.UPDATE);

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

		_insurancePlanModelResourcePermission.check(
				getPermissionChecker(), insurancePlanId, ActionKeys.UPDATE);

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
	@Override
	public InsurancePlan updateInsurancePlan(final long insurancePlanId, final String providerName, final String planName, final boolean active,
											 final long annualExamAllowanceCents, final long annualFramesAllowanceCents, final long annualLensesAllowanceCents,
											 final long annualContactsAllowanceCents, final int coveragePeriodMonths, final ServiceContext serviceContext) throws PortalException {

		_insurancePlanModelResourcePermission.check(
				getPermissionChecker(), insurancePlanId, ActionKeys.UPDATE);

		return insurancePlanLocalService.updateInsurancePlan(insurancePlanId, providerName, planName, active, annualExamAllowanceCents, annualFramesAllowanceCents,
				annualLensesAllowanceCents, annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
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

		_insurancePlanModelResourcePermission.check(
				getPermissionChecker(), insurancePlanId, ActionKeys.DELETE);

		return insurancePlanLocalService.moveInsurancePlanToTrash(userId, insurancePlanId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param  userId the primary key of the user restoring the insurance plan
	 * @param  insurancePlanId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public InsurancePlan restoreInsurancePlanFromTrash(long userId, long insurancePlanId)
			throws PortalException {

		_insurancePlanModelResourcePermission.check(
				getPermissionChecker(), insurancePlanId, ActionKeys.DELETE);

		return insurancePlanLocalService.restoreInsurancePlanFromTrash(userId, insurancePlanId);
	}

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan)"
	)
	private volatile ModelResourcePermission<InsurancePlan>
			_insurancePlanModelResourcePermission;

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(resource.name=" + InsuranceBenefitsTrackerConstants.RESOURCE_NAME + ")"
	)
	private volatile PortletResourcePermission _portletResourcePermission;

	private static final Log _log = LogFactoryUtil.getLog(InsurancePlanServiceImpl.class);
}