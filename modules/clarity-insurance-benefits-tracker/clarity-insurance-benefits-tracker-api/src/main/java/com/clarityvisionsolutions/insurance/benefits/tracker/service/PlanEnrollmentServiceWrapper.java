/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlanEnrollmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentService
 * @generated
 */
public class PlanEnrollmentServiceWrapper
	implements PlanEnrollmentService, ServiceWrapper<PlanEnrollmentService> {

	public PlanEnrollmentServiceWrapper() {
		this(null);
	}

	public PlanEnrollmentServiceWrapper(
		PlanEnrollmentService planEnrollmentService) {

		_planEnrollmentService = planEnrollmentService;
	}

	@Override
	public PlanEnrollment addPlanEnrollment(
			long insurancePlanId, long memberUserId, String memberId,
			String groupNumber, java.util.Date startDate,
			java.util.Date endDate, int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.addPlanEnrollment(
			insurancePlanId, memberUserId, memberId, groupNumber, startDate,
			endDate, enrollmentStatus, notes, serviceContext);
	}

	@Override
	public PlanEnrollment deletePlanEnrollment(long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.deletePlanEnrollment(planEnrollmentId);
	}

	@Override
	public java.util.List<PlanEnrollment> getGroupMemberPlanEnrollments(
			long groupId, long planEnrollmentId, long memberId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.getGroupMemberPlanEnrollments(
			groupId, planEnrollmentId, memberId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _planEnrollmentService.getOSGiServiceIdentifier();
	}

	@Override
	public PlanEnrollment getPlanEnrollment(long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.getPlanEnrollment(planEnrollmentId);
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public PlanEnrollment movePlanEnrollmentToTrash(
			long userId, long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.movePlanEnrollmentToTrash(
			userId, planEnrollmentId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public PlanEnrollment restorePlanEnrollmentFromTrash(
			long userId, long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.restorePlanEnrollmentFromTrash(
			userId, planEnrollmentId);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public PlanEnrollment updatePlanEnrollment(
			long planEnrollmentId, String memberId, String groupNumber,
			java.util.Date startDate, java.util.Date endDate,
			int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentService.updatePlanEnrollment(
			planEnrollmentId, memberId, groupNumber, startDate, endDate,
			enrollmentStatus, notes, serviceContext);
	}

	@Override
	public PlanEnrollmentService getWrappedService() {
		return _planEnrollmentService;
	}

	@Override
	public void setWrappedService(PlanEnrollmentService planEnrollmentService) {
		_planEnrollmentService = planEnrollmentService;
	}

	private PlanEnrollmentService _planEnrollmentService;

}