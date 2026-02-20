/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerConstants;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.base.PlanEnrollmentServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.trash.exception.RestoreEntryException;
import com.liferay.trash.exception.TrashEntryException;
import com.liferay.trash.model.TrashEntry;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=cibt",
		"json.web.service.context.path=PlanEnrollment"
	},
	service = AopService.class
)
public class PlanEnrollmentServiceImpl extends PlanEnrollmentServiceBaseImpl {

	@Override
	public PlanEnrollment addPlanEnrollment(final long insurancePlanId, final long memberUserId, final String memberId, final String groupNumber,
											final Date startDate, final Date endDate, final int enrollmentStatus, final String notes, final ServiceContext serviceContext) throws PortalException {

		_portletResourcePermission.check(
				getPermissionChecker(), serviceContext.getScopeGroupId(),
				ActionKeys.ADD_ENTRY);

		return planEnrollmentLocalService.addPlanEnrollment(insurancePlanId, memberUserId, memberId, groupNumber, startDate, endDate, enrollmentStatus, notes, serviceContext);
	}

	@Override
	public PlanEnrollment deletePlanEnrollment(long planEnrollmentId) throws PortalException {
		_planEnrollmentModelResourcePermission.check(
				getPermissionChecker(), planEnrollmentId, ActionKeys.DELETE);


		return planEnrollmentLocalService.deletePlanEnrollment(planEnrollmentId);
	}

	@Override
	public PlanEnrollment getPlanEnrollment(final long planEnrollmentId) throws PortalException {
		PlanEnrollment enrollment = planEnrollmentLocalService.getPlanEnrollment(planEnrollmentId);

		_planEnrollmentModelResourcePermission.check(getPermissionChecker(), enrollment, ActionKeys.VIEW);

		return enrollment;
	}

	@Override
	public List<PlanEnrollment> getGroupMemberPlanEnrollments(final long groupId, final long insurancePlanId, final long memberUserId, final int status) throws PortalException {

		if (status == WorkflowConstants.STATUS_ANY) {
			return planEnrollmentPersistence.filterFindByG_IP_M_NotS(groupId, insurancePlanId, memberUserId, WorkflowConstants.STATUS_IN_TRASH);
		}

		return planEnrollmentPersistence.filterFindByG_IP_M_S(groupId, insurancePlanId, memberUserId, status);
	}

	@Override
	public List<PlanEnrollment> getActiveGroupEnrollments(final long groupId) throws PortalException {
		_portletResourcePermission.check(
				getPermissionChecker(), groupId,
				ActionKeys.VIEW);

		return planEnrollmentLocalService.getActiveGroupEnrollments(groupId);
	}


	@Override
	public List<PlanEnrollment> getMemberPlanEnrollments(final long groupId, final long memberUserId, final int enrollmentStatus) throws PortalException {

		_portletResourcePermission.check(
				getPermissionChecker(), groupId,
				ActionKeys.VIEW);

		return planEnrollmentLocalService.getMemberPlanEnrollments(groupId, memberUserId, enrollmentStatus);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public PlanEnrollment updatePlanEnrollment(final long planEnrollmentId, final String memberId, final String groupNumber,
											   final Date startDate, final Date endDate, final int enrollmentStatus, final String notes, final ServiceContext serviceContext) throws PortalException {

		_planEnrollmentModelResourcePermission.check(
				getPermissionChecker(), planEnrollmentId, ActionKeys.UPDATE);

		return planEnrollmentLocalService.updatePlanEnrollment(planEnrollmentId, memberId, groupNumber, startDate, endDate, enrollmentStatus, notes, serviceContext);
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

		_planEnrollmentModelResourcePermission.check(
				getPermissionChecker(), planEnrollmentId, ActionKeys.DELETE);

		return planEnrollmentLocalService.movePlanEnrollmentToTrash(userId, planEnrollmentId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param  userId the primary key of the user restoring the insurance plan
	 * @param  planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public PlanEnrollment restorePlanEnrollmentFromTrash(long userId, long planEnrollmentId)
			throws PortalException {

		_planEnrollmentModelResourcePermission.check(
				getPermissionChecker(), planEnrollmentId, ActionKeys.DELETE);

		return planEnrollmentLocalService.restorePlanEnrollmentFromTrash(userId, planEnrollmentId);
	}

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment)"
	)
	private volatile ModelResourcePermission<PlanEnrollment>
			_planEnrollmentModelResourcePermission;

	@Reference(
			policy = ReferencePolicy.DYNAMIC,
			policyOption = ReferencePolicyOption.GREEDY,
			target = "(resource.name=" + InsuranceBenefitsTrackerConstants.RESOURCE_NAME + ")"
	)
	private volatile PortletResourcePermission _portletResourcePermission;

	private static final Log _log = LogFactoryUtil.getLog(PlanEnrollmentServiceImpl.class);
}