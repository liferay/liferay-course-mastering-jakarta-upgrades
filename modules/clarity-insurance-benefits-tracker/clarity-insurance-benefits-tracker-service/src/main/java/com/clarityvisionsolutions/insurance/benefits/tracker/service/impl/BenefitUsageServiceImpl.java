/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerConstants;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.base.BenefitUsageServiceBaseImpl;

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

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=cibt",
		"json.web.service.context.path=BenefitUsage"
	},
	service = AopService.class
)
public class BenefitUsageServiceImpl extends BenefitUsageServiceBaseImpl {
	@Override
	public BenefitUsage addBenefitUsage(final long planEnrollmentId, final String benefitType, final long amountUsedCents, final Date serviceDate, final String reference,
										final String notes, final String sourceType, final String sourceReference, final ServiceContext serviceContext) throws PortalException {

		_portletResourcePermission.check(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY);

		return benefitUsageLocalService.addBenefitUsage(planEnrollmentId, benefitType, amountUsedCents, serviceDate, reference, notes, sourceType, sourceReference, serviceContext);
	}

	@Override
	public BenefitUsage deleteBenefitUsage(long benefitUsageId) throws PortalException {
		_benefitUsageModelResourcePermission.check(
				getPermissionChecker(), benefitUsageId, ActionKeys.DELETE);


		return benefitUsageLocalService.deleteBenefitUsage(benefitUsageId);
	}

	@Override
	public BenefitUsage getBenefitUsage(final long benefitUsageId) throws PortalException {
		BenefitUsage enrollment = benefitUsageLocalService.getBenefitUsage(benefitUsageId);

		_benefitUsageModelResourcePermission.check(getPermissionChecker(), enrollment, ActionKeys.VIEW);

		return enrollment;
	}

	@Override
	public List<BenefitUsage> getGroupPlanEnrollmentBenefitUsages(final long groupId, final long planEnrollmentId, final int status) throws PortalException {

		if (status == WorkflowConstants.STATUS_ANY) {
			return benefitUsagePersistence.filterFindByG_PE_NotS(groupId, planEnrollmentId, WorkflowConstants.STATUS_IN_TRASH);
		}

		return benefitUsagePersistence.filterFindByG_PE_S(groupId, planEnrollmentId, status);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public BenefitUsage updateBenefitUsage(final long benefitUsageId, final String benefitType, final long amountUsedCents, final Date serviceDate, final String reference,
										   final String notes, final String sourceType, final String sourceReference, final ServiceContext serviceContext) throws PortalException {

		_benefitUsageModelResourcePermission.check(
				getPermissionChecker(), benefitUsageId, ActionKeys.UPDATE);

		return benefitUsageLocalService.updateBenefitUsage(benefitUsageId, benefitType, amountUsedCents, serviceDate, reference, notes, sourceType, sourceReference, serviceContext);
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

		_benefitUsageModelResourcePermission.check(
				getPermissionChecker(), benefitUsageId, ActionKeys.DELETE);

		return benefitUsageLocalService.moveBenefitUsageToTrash(userId, benefitUsageId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param  userId the primary key of the user restoring the insurance plan
	 * @param  benefitUsageId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public BenefitUsage restoreBenefitUsageFromTrash(long userId, long benefitUsageId)
			throws PortalException {

		_benefitUsageModelResourcePermission.check(
				getPermissionChecker(), benefitUsageId, ActionKeys.DELETE);

		return benefitUsageLocalService.restoreBenefitUsageFromTrash(userId, benefitUsageId);
	}

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage)"
	)
	private volatile ModelResourcePermission<BenefitUsage>
			_benefitUsageModelResourcePermission;

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(resource.name=" + InsuranceBenefitsTrackerConstants.RESOURCE_NAME + ")"
	)
	private volatile PortletResourcePermission _portletResourcePermission;

	private static final Log _log = LogFactoryUtil.getLog(BenefitUsageServiceImpl.class);
}