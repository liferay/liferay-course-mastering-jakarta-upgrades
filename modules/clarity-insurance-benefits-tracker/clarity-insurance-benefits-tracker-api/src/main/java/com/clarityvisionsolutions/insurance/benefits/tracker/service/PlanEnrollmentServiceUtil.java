/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for PlanEnrollment. This utility wraps
 * <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.PlanEnrollmentServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentService
 * @generated
 */
public class PlanEnrollmentServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.PlanEnrollmentServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static PlanEnrollment addPlanEnrollment(
			long insurancePlanId, long memberUserId, String memberId,
			String groupNumber, java.util.Date startDate,
			java.util.Date endDate, int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addPlanEnrollment(
			insurancePlanId, memberUserId, memberId, groupNumber, startDate,
			endDate, enrollmentStatus, notes, serviceContext);
	}

	public static PlanEnrollment deletePlanEnrollment(long planEnrollmentId)
		throws PortalException {

		return getService().deletePlanEnrollment(planEnrollmentId);
	}

	public static List<PlanEnrollment> getGroupMemberPlanEnrollments(
			long groupId, long insurancePlanId, long memberUserId, int status)
		throws PortalException {

		return getService().getGroupMemberPlanEnrollments(
			groupId, insurancePlanId, memberUserId, status);
	}

	public static List<PlanEnrollment> getMemberPlanEnrollments(
			long groupId, long memberUserId, int status)
		throws PortalException {

		return getService().getMemberPlanEnrollments(
			groupId, memberUserId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static PlanEnrollment getPlanEnrollment(long planEnrollmentId)
		throws PortalException {

		return getService().getPlanEnrollment(planEnrollmentId);
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static PlanEnrollment movePlanEnrollmentToTrash(
			long userId, long planEnrollmentId)
		throws PortalException {

		return getService().movePlanEnrollmentToTrash(userId, planEnrollmentId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	public static PlanEnrollment restorePlanEnrollmentFromTrash(
			long userId, long planEnrollmentId)
		throws PortalException {

		return getService().restorePlanEnrollmentFromTrash(
			userId, planEnrollmentId);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public static PlanEnrollment updatePlanEnrollment(
			long planEnrollmentId, String memberId, String groupNumber,
			java.util.Date startDate, java.util.Date endDate,
			int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updatePlanEnrollment(
			planEnrollmentId, memberId, groupNumber, startDate, endDate,
			enrollmentStatus, notes, serviceContext);
	}

	public static PlanEnrollmentService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PlanEnrollmentService> _serviceSnapshot =
		new Snapshot<>(
			PlanEnrollmentServiceUtil.class, PlanEnrollmentService.class);

}