/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.portal.kernel.change.tracking.CTAware;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for PlanEnrollment. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentServiceUtil
 * @generated
 */
@AccessControlled
@CTAware
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PlanEnrollmentService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.PlanEnrollmentServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the plan enrollment remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link PlanEnrollmentServiceUtil} if injection and service tracking are not available.
	 */
	public PlanEnrollment addPlanEnrollment(
			long insurancePlanId, long memberUserId, String memberId,
			String groupNumber, Date startDate, Date endDate,
			int enrollmentStatus, String notes, ServiceContext serviceContext)
		throws PortalException;

	public PlanEnrollment deletePlanEnrollment(long planEnrollmentId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getGroupMemberPlanEnrollments(
			long groupId, long planEnrollmentId, long memberId, int status)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment getPlanEnrollment(long planEnrollmentId)
		throws PortalException;

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public PlanEnrollment movePlanEnrollmentToTrash(
			long userId, long planEnrollmentId)
		throws PortalException;

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	public PlanEnrollment restorePlanEnrollmentFromTrash(
			long userId, long planEnrollmentId)
		throws PortalException;

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public PlanEnrollment updatePlanEnrollment(
			long planEnrollmentId, String memberId, String groupNumber,
			Date startDate, Date endDate, int enrollmentStatus, String notes,
			ServiceContext serviceContext)
		throws PortalException;

}