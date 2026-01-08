/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence;

import com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchPlanEnrollmentException;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the plan enrollment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentUtil
 * @generated
 */
@ProviderType
public interface PlanEnrollmentPersistence
	extends BasePersistence<PlanEnrollment>, CTPersistence<PlanEnrollment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlanEnrollmentUtil} to access the plan enrollment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the plan enrollments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid(String uuid);

	/**
	 * Returns a range of all the plan enrollments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByUuid_PrevAndNext(
			long planEnrollmentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of plan enrollments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching plan enrollments
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the plan enrollment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPlanEnrollmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUUID_G(String uuid, long groupId)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the plan enrollment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the plan enrollment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the plan enrollment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the plan enrollment that was removed
	 */
	public PlanEnrollment removeByUUID_G(String uuid, long groupId)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the number of plan enrollments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByUuid_C_PrevAndNext(
			long planEnrollmentId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching plan enrollments
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the plan enrollments where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupId(long groupId);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByGroupId_PrevAndNext(
			long planEnrollmentId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByGroupId(long groupId);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByGroupId_PrevAndNext(
			long planEnrollmentId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of plan enrollments where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the plan enrollments where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the plan enrollments where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByCompanyId_PrevAndNext(
			long planEnrollmentId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of plan enrollments where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching plan enrollments
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_S(long groupId, int status);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_S(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByG_S_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_S(
		long groupId, int status);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_S(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByG_S_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_S(long groupId, int status);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_NotS(
		long groupId, int status);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_NotS(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_NotS_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_NotS_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_NotS_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_NotS_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByG_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_NotS(
		long groupId, int status);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_NotS(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByG_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_NotS(long groupId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByG_NotS(long groupId, int status);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_NotS(long groupId, int status);

	/**
	 * Returns all the plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status);

	/**
	 * Returns a range of all the plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByIP_S_First(
			long insurancePlanId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByIP_S_First(
		long insurancePlanId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByIP_S_Last(
			long insurancePlanId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByIP_S_Last(
		long insurancePlanId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByIP_S_PrevAndNext(
			long planEnrollmentId, long insurancePlanId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where insurancePlanId = &#63; and status = &#63; from the database.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 */
	public void removeByIP_S(long insurancePlanId, int status);

	/**
	 * Returns the number of plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByIP_S(long insurancePlanId, int status);

	/**
	 * Returns all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status);

	/**
	 * Returns a range of all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByIP_NotS_First(
			long insurancePlanId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByIP_NotS_First(
		long insurancePlanId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByIP_NotS_Last(
			long insurancePlanId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByIP_NotS_Last(
		long insurancePlanId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByIP_NotS_PrevAndNext(
			long planEnrollmentId, long insurancePlanId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 */
	public void removeByIP_NotS(long insurancePlanId, int status);

	/**
	 * Returns the number of plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByIP_NotS(long insurancePlanId, int status);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_IP_M_S_First(
			long groupId, long insurancePlanId, long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_IP_M_S_First(
		long groupId, long insurancePlanId, long memberUserId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_IP_M_S_Last(
			long groupId, long insurancePlanId, long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_IP_M_S_Last(
		long groupId, long insurancePlanId, long memberUserId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByG_IP_M_S_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByG_IP_M_S_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 */
	public void removeByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_IP_M_NotS_First(
			long groupId, long insurancePlanId, long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_IP_M_NotS_First(
		long groupId, long insurancePlanId, long memberUserId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_IP_M_NotS_Last(
			long groupId, long insurancePlanId, long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_IP_M_NotS_Last(
		long groupId, long insurancePlanId, long memberUserId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByG_IP_M_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByG_IP_M_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 */
	public void removeByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status);

	/**
	 * Returns all the plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_S(long companyId, int status);

	/**
	 * Returns a range of all the plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_S(
		long companyId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByC_S_PrevAndNext(
			long planEnrollmentId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns all the plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_NotS(
		long companyId, int status);

	/**
	 * Returns a range of all the plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_NotS(
		long companyId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByC_NotS_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByC_NotS_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByC_NotS_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByC_NotS_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByC_NotS_PrevAndNext(
			long planEnrollmentId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_NotS(long companyId, int status);

	/**
	 * Returns the number of plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByC_NotS(long companyId, int status);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_U_S_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_U_S_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_U_S_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_U_S_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByG_U_S_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int status);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByG_U_S_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int[] statuses);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching plan enrollments
	 */
	public int countByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_U_NotS_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByG_U_NotS_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByG_U_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_NotS(
		long groupId, long userId, int status);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByG_U_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public int countByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns all the plan enrollments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserId(long userId);

	/**
	 * Returns a range of all the plan enrollments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByUserId_PrevAndNext(
			long planEnrollmentId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of plan enrollments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching plan enrollments
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus);

	/**
	 * Returns a range of all the plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUserIdEnrollmentStatus_First(
			long userId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUserIdEnrollmentStatus_First(
		long userId, int enrollmentStatus,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByUserIdEnrollmentStatus_Last(
			long userId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByUserIdEnrollmentStatus_Last(
		long userId, int enrollmentStatus,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByUserIdEnrollmentStatus_PrevAndNext(
			long planEnrollmentId, long userId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where userId = &#63; and enrollmentStatus = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 */
	public void removeByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus);

	/**
	 * Returns the number of plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @return the number of matching plan enrollments
	 */
	public int countByUserIdEnrollmentStatus(long userId, int enrollmentStatus);

	/**
	 * Returns all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus);

	/**
	 * Returns a range of all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByGroupIdEnrollmentStatus_First(
			long groupId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByGroupIdEnrollmentStatus_First(
		long groupId, int enrollmentStatus,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByGroupIdEnrollmentStatus_Last(
			long groupId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByGroupIdEnrollmentStatus_Last(
		long groupId, int enrollmentStatus,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByGroupIdEnrollmentStatus_PrevAndNext(
			long planEnrollmentId, long groupId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus);

	/**
	 * Returns a range of all the plan enrollments that the user has permission to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments that the user has permissions to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments that the user has permission to view
	 */
	public java.util.List<PlanEnrollment> filterFindByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] filterFindByGroupIdEnrollmentStatus_PrevAndNext(
			long planEnrollmentId, long groupId, int enrollmentStatus,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 */
	public void removeByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus);

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the number of matching plan enrollments
	 */
	public int countByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus);

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public int filterCountByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus);

	/**
	 * Returns all the plan enrollments where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberUserId(long memberUserId);

	/**
	 * Returns a range of all the plan enrollments where memberUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param memberUserId the member user ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberUserId(
		long memberUserId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where memberUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param memberUserId the member user ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberUserId(
		long memberUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where memberUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param memberUserId the member user ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberUserId(
		long memberUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByMemberUserId_First(
			long memberUserId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByMemberUserId_First(
		long memberUserId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByMemberUserId_Last(
			long memberUserId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByMemberUserId_Last(
		long memberUserId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByMemberUserId_PrevAndNext(
			long planEnrollmentId, long memberUserId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where memberUserId = &#63; from the database.
	 *
	 * @param memberUserId the member user ID
	 */
	public void removeByMemberUserId(long memberUserId);

	/**
	 * Returns the number of plan enrollments where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @return the number of matching plan enrollments
	 */
	public int countByMemberUserId(long memberUserId);

	/**
	 * Returns all the plan enrollments where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberId(String memberId);

	/**
	 * Returns a range of all the plan enrollments where memberId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param memberId the member ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberId(
		String memberId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where memberId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param memberId the member ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberId(
		String memberId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where memberId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param memberId the member ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByMemberId(
		String memberId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByMemberId_First(
			String memberId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByMemberId_First(
		String memberId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByMemberId_Last(
			String memberId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByMemberId_Last(
		String memberId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByMemberId_PrevAndNext(
			long planEnrollmentId, String memberId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where memberId = &#63; from the database.
	 *
	 * @param memberId the member ID
	 */
	public void removeByMemberId(String memberId);

	/**
	 * Returns the number of plan enrollments where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @return the number of matching plan enrollments
	 */
	public int countByMemberId(String memberId);

	/**
	 * Returns all the plan enrollments where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @return the matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId);

	/**
	 * Returns a range of all the plan enrollments where insurancePlanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId, int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments where insurancePlanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments where insurancePlanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plan enrollments
	 */
	public java.util.List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByInsurancePlan_First(
			long insurancePlanId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByInsurancePlan_First(
		long insurancePlanId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByInsurancePlan_Last(
			long insurancePlanId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByInsurancePlan_Last(
		long insurancePlanId,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment[] findByInsurancePlan_PrevAndNext(
			long planEnrollmentId, long insurancePlanId,
			com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
				orderByComparator)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Removes all the plan enrollments where insurancePlanId = &#63; from the database.
	 *
	 * @param insurancePlanId the insurance plan ID
	 */
	public void removeByInsurancePlan(long insurancePlanId);

	/**
	 * Returns the number of plan enrollments where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @return the number of matching plan enrollments
	 */
	public int countByInsurancePlan(long insurancePlanId);

	/**
	 * Returns the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; or throws a <code>NoSuchPlanEnrollmentException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public PlanEnrollment findByERC_G(
			String externalReferenceCode, long groupId)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByERC_G(
		String externalReferenceCode, long groupId);

	/**
	 * Returns the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public PlanEnrollment fetchByERC_G(
		String externalReferenceCode, long groupId, boolean useFinderCache);

	/**
	 * Removes the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the plan enrollment that was removed
	 */
	public PlanEnrollment removeByERC_G(
			String externalReferenceCode, long groupId)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the number of plan enrollments where externalReferenceCode = &#63; and groupId = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments
	 */
	public int countByERC_G(String externalReferenceCode, long groupId);

	/**
	 * Caches the plan enrollment in the entity cache if it is enabled.
	 *
	 * @param planEnrollment the plan enrollment
	 */
	public void cacheResult(PlanEnrollment planEnrollment);

	/**
	 * Caches the plan enrollments in the entity cache if it is enabled.
	 *
	 * @param planEnrollments the plan enrollments
	 */
	public void cacheResult(java.util.List<PlanEnrollment> planEnrollments);

	/**
	 * Creates a new plan enrollment with the primary key. Does not add the plan enrollment to the database.
	 *
	 * @param planEnrollmentId the primary key for the new plan enrollment
	 * @return the new plan enrollment
	 */
	public PlanEnrollment create(long planEnrollmentId);

	/**
	 * Removes the plan enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planEnrollmentId the primary key of the plan enrollment
	 * @return the plan enrollment that was removed
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment remove(long planEnrollmentId)
		throws NoSuchPlanEnrollmentException;

	public PlanEnrollment updateImpl(PlanEnrollment planEnrollment);

	/**
	 * Returns the plan enrollment with the primary key or throws a <code>NoSuchPlanEnrollmentException</code> if it could not be found.
	 *
	 * @param planEnrollmentId the primary key of the plan enrollment
	 * @return the plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment findByPrimaryKey(long planEnrollmentId)
		throws NoSuchPlanEnrollmentException;

	/**
	 * Returns the plan enrollment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param planEnrollmentId the primary key of the plan enrollment
	 * @return the plan enrollment, or <code>null</code> if a plan enrollment with the primary key could not be found
	 */
	public PlanEnrollment fetchByPrimaryKey(long planEnrollmentId);

	/**
	 * Returns all the plan enrollments.
	 *
	 * @return the plan enrollments
	 */
	public java.util.List<PlanEnrollment> findAll();

	/**
	 * Returns a range of all the plan enrollments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @return the range of plan enrollments
	 */
	public java.util.List<PlanEnrollment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the plan enrollments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plan enrollments
	 */
	public java.util.List<PlanEnrollment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plan enrollments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plan enrollments
	 * @param end the upper bound of the range of plan enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of plan enrollments
	 */
	public java.util.List<PlanEnrollment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the plan enrollments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of plan enrollments.
	 *
	 * @return the number of plan enrollments
	 */
	public int countAll();

}