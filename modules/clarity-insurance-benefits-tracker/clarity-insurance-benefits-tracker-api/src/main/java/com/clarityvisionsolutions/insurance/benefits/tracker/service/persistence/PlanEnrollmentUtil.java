/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the plan enrollment service. This utility wraps <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.impl.PlanEnrollmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentPersistence
 * @generated
 */
public class PlanEnrollmentUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(PlanEnrollment planEnrollment) {
		getPersistence().clearCache(planEnrollment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, PlanEnrollment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PlanEnrollment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PlanEnrollment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PlanEnrollment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PlanEnrollment update(PlanEnrollment planEnrollment) {
		return getPersistence().update(planEnrollment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PlanEnrollment update(
		PlanEnrollment planEnrollment, ServiceContext serviceContext) {

		return getPersistence().update(planEnrollment, serviceContext);
	}

	/**
	 * Returns all the plan enrollments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<PlanEnrollment> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<PlanEnrollment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUuid_First(
			String uuid, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUuid_First(
		String uuid, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUuid_Last(
			String uuid, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUuid_Last(
		String uuid, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where uuid = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByUuid_PrevAndNext(
			long planEnrollmentId, String uuid,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUuid_PrevAndNext(
			planEnrollmentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of plan enrollments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching plan enrollments
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the plan enrollment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPlanEnrollmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUUID_G(String uuid, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the plan enrollment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the plan enrollment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the plan enrollment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the plan enrollment that was removed
	 */
	public static PlanEnrollment removeByUUID_G(String uuid, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of plan enrollments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static PlanEnrollment[] findByUuid_C_PrevAndNext(
			long planEnrollmentId, String uuid, long companyId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			planEnrollmentId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of plan enrollments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<PlanEnrollment> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<PlanEnrollment> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByGroupId_First(
			long groupId, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByGroupId_First(
		long groupId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByGroupId_Last(
			long groupId, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByGroupId_Last(
		long groupId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where groupId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByGroupId_PrevAndNext(
			long planEnrollmentId, long groupId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByGroupId_PrevAndNext(
			planEnrollmentId, groupId, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static List<PlanEnrollment> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set of plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] filterFindByGroupId_PrevAndNext(
			long planEnrollmentId, long groupId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			planEnrollmentId, groupId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the plan enrollments where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static List<PlanEnrollment> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static List<PlanEnrollment> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByCompanyId_First(
			long companyId, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByCompanyId_First(
		long companyId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByCompanyId_Last(
			long companyId, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByCompanyId_Last(
		long companyId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where companyId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByCompanyId_PrevAndNext(
			long planEnrollmentId, long companyId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByCompanyId_PrevAndNext(
			planEnrollmentId, companyId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of plan enrollments where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

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
	public static List<PlanEnrollment> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByG_S_First(
			long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByG_S_Last(
			long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByG_S_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_S_PrevAndNext(
			planEnrollmentId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_S(
		long groupId, int status) {

		return getPersistence().filterFindByG_S(groupId, status);
	}

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
	public static List<PlanEnrollment> filterFindByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_S(groupId, status, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_S(
			groupId, status, start, end, orderByComparator);
	}

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
	public static PlanEnrollment[] filterFindByG_S_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByG_S_PrevAndNext(
			planEnrollmentId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_S(long groupId, int status) {
		return getPersistence().filterCountByG_S(groupId, status);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByG_NotS(long groupId, int status) {
		return getPersistence().findByG_NotS(groupId, status);
	}

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
	public static List<PlanEnrollment> findByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_NotS(groupId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByG_NotS_First(
			long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_NotS_First(
		long groupId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByG_NotS_Last(
			long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_NotS_Last(
		long groupId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_NotS_Last(
			groupId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByG_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_NotS_PrevAndNext(
			planEnrollmentId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_NotS(
		long groupId, int status) {

		return getPersistence().filterFindByG_NotS(groupId, status);
	}

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
	public static List<PlanEnrollment> filterFindByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_NotS(groupId, status, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

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
	public static PlanEnrollment[] filterFindByG_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByG_NotS_PrevAndNext(
			planEnrollmentId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_NotS(long groupId, int status) {
		getPersistence().removeByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_NotS(long groupId, int status) {
		return getPersistence().countByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_NotS(long groupId, int status) {
		return getPersistence().filterCountByG_NotS(groupId, status);
	}

	/**
	 * Returns all the plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status) {

		return getPersistence().findByIP_S(insurancePlanId, status);
	}

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
	public static List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status, int start, int end) {

		return getPersistence().findByIP_S(insurancePlanId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByIP_S(
			insurancePlanId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByIP_S(
		long insurancePlanId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByIP_S(
			insurancePlanId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByIP_S_First(
			long insurancePlanId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByIP_S_First(
			insurancePlanId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByIP_S_First(
		long insurancePlanId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByIP_S_First(
			insurancePlanId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByIP_S_Last(
			long insurancePlanId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByIP_S_Last(
			insurancePlanId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByIP_S_Last(
		long insurancePlanId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByIP_S_Last(
			insurancePlanId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByIP_S_PrevAndNext(
			long planEnrollmentId, long insurancePlanId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByIP_S_PrevAndNext(
			planEnrollmentId, insurancePlanId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where insurancePlanId = &#63; and status = &#63; from the database.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 */
	public static void removeByIP_S(long insurancePlanId, int status) {
		getPersistence().removeByIP_S(insurancePlanId, status);
	}

	/**
	 * Returns the number of plan enrollments where insurancePlanId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByIP_S(long insurancePlanId, int status) {
		return getPersistence().countByIP_S(insurancePlanId, status);
	}

	/**
	 * Returns all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status) {

		return getPersistence().findByIP_NotS(insurancePlanId, status);
	}

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
	public static List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status, int start, int end) {

		return getPersistence().findByIP_NotS(
			insurancePlanId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByIP_NotS(
			insurancePlanId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByIP_NotS(
		long insurancePlanId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByIP_NotS(
			insurancePlanId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByIP_NotS_First(
			long insurancePlanId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByIP_NotS_First(
			insurancePlanId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByIP_NotS_First(
		long insurancePlanId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByIP_NotS_First(
			insurancePlanId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByIP_NotS_Last(
			long insurancePlanId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByIP_NotS_Last(
			insurancePlanId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByIP_NotS_Last(
		long insurancePlanId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByIP_NotS_Last(
			insurancePlanId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByIP_NotS_PrevAndNext(
			long planEnrollmentId, long insurancePlanId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByIP_NotS_PrevAndNext(
			planEnrollmentId, insurancePlanId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where insurancePlanId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 */
	public static void removeByIP_NotS(long insurancePlanId, int status) {
		getPersistence().removeByIP_NotS(insurancePlanId, status);
	}

	/**
	 * Returns the number of plan enrollments where insurancePlanId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByIP_NotS(long insurancePlanId, int status) {
		return getPersistence().countByIP_NotS(insurancePlanId, status);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().findByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status);
	}

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
	public static List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end) {

		return getPersistence().findByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status, start, end,
			orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end, OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status, start, end,
			orderByComparator, useFinderCache);
	}

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
	public static PlanEnrollment findByG_IP_M_S_First(
			long groupId, long insurancePlanId, long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_IP_M_S_First(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment fetchByG_IP_M_S_First(
		long groupId, long insurancePlanId, long memberUserId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_IP_M_S_First(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment findByG_IP_M_S_Last(
			long groupId, long insurancePlanId, long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_IP_M_S_Last(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment fetchByG_IP_M_S_Last(
		long groupId, long insurancePlanId, long memberUserId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_IP_M_S_Last(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByG_IP_M_S_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_IP_M_S_PrevAndNext(
			planEnrollmentId, groupId, insurancePlanId, memberUserId, status,
			orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().filterFindByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status);
	}

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
	public static List<PlanEnrollment> filterFindByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end) {

		return getPersistence().filterFindByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status, start, end,
			orderByComparator);
	}

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
	public static PlanEnrollment[] filterFindByG_IP_M_S_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByG_IP_M_S_PrevAndNext(
			planEnrollmentId, groupId, insurancePlanId, memberUserId, status,
			orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 */
	public static void removeByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		getPersistence().removeByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().countByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_IP_M_S(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().filterCountByG_IP_M_S(
			groupId, insurancePlanId, memberUserId, status);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().findByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status);
	}

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
	public static List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end) {

		return getPersistence().findByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status, start, end,
			orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end, OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status, start, end,
			orderByComparator, useFinderCache);
	}

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
	public static PlanEnrollment findByG_IP_M_NotS_First(
			long groupId, long insurancePlanId, long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_IP_M_NotS_First(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment fetchByG_IP_M_NotS_First(
		long groupId, long insurancePlanId, long memberUserId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_IP_M_NotS_First(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment findByG_IP_M_NotS_Last(
			long groupId, long insurancePlanId, long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_IP_M_NotS_Last(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment fetchByG_IP_M_NotS_Last(
		long groupId, long insurancePlanId, long memberUserId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_IP_M_NotS_Last(
			groupId, insurancePlanId, memberUserId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByG_IP_M_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_IP_M_NotS_PrevAndNext(
			planEnrollmentId, groupId, insurancePlanId, memberUserId, status,
			orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().filterFindByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status);
	}

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
	public static List<PlanEnrollment> filterFindByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end) {

		return getPersistence().filterFindByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status,
		int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status, start, end,
			orderByComparator);
	}

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
	public static PlanEnrollment[] filterFindByG_IP_M_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long insurancePlanId,
			long memberUserId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByG_IP_M_NotS_PrevAndNext(
			planEnrollmentId, groupId, insurancePlanId, memberUserId, status,
			orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 */
	public static void removeByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		getPersistence().removeByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().countByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and insurancePlanId = &#63; and memberUserId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param insurancePlanId the insurance plan ID
	 * @param memberUserId the member user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_IP_M_NotS(
		long groupId, long insurancePlanId, long memberUserId, int status) {

		return getPersistence().filterCountByG_IP_M_NotS(
			groupId, insurancePlanId, memberUserId, status);
	}

	/**
	 * Returns all the plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByC_S(long companyId, int status) {
		return getPersistence().findByC_S(companyId, status);
	}

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
	public static List<PlanEnrollment> findByC_S(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_S(companyId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByC_S_First(
			long companyId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByC_S_Last(
			long companyId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByC_S_Last(
			companyId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByC_S_PrevAndNext(
			long planEnrollmentId, long companyId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByC_S_PrevAndNext(
			planEnrollmentId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_S(long companyId, int status) {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	 * Returns the number of plan enrollments where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByC_S(long companyId, int status) {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	 * Returns all the plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByC_NotS(
		long companyId, int status) {

		return getPersistence().findByC_NotS(companyId, status);
	}

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
	public static List<PlanEnrollment> findByC_NotS(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_NotS(companyId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByC_NotS_First(
			long companyId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByC_NotS_First(
		long companyId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByC_NotS_Last(
			long companyId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByC_NotS_Last(
		long companyId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByC_NotS_Last(
			companyId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByC_NotS_PrevAndNext(
			long planEnrollmentId, long companyId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByC_NotS_PrevAndNext(
			planEnrollmentId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_NotS(long companyId, int status) {
		getPersistence().removeByC_NotS(companyId, status);
	}

	/**
	 * Returns the number of plan enrollments where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByC_NotS(long companyId, int status) {
		return getPersistence().countByC_NotS(companyId, status);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_S(groupId, userId, status);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

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
	public static PlanEnrollment findByG_U_S_First(
			long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_U_S_First(
		long groupId, long userId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

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
	public static PlanEnrollment findByG_U_S_Last(
			long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_U_S_Last(
		long groupId, long userId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByG_U_S_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_U_S_PrevAndNext(
			planEnrollmentId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_S(groupId, userId, status);
	}

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
	public static List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

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
	public static PlanEnrollment[] filterFindByG_U_S_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByG_U_S_PrevAndNext(
			planEnrollmentId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterFindByG_U_S(groupId, userId, statuses);
	}

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
	public static List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().findByG_U_S(groupId, userId, statuses);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_U_S(long groupId, long userId, int[] statuses) {
		return getPersistence().countByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterCountByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_NotS(groupId, userId, status);
	}

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
	public static List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end);
	}

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
	public static List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

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
	public static PlanEnrollment findByG_U_NotS_First(
			long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

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
	public static PlanEnrollment findByG_U_NotS_Last(
			long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

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
	public static PlanEnrollment[] findByG_U_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByG_U_NotS_PrevAndNext(
			planEnrollmentId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_NotS(groupId, userId, status);
	}

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
	public static List<PlanEnrollment> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

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
	public static PlanEnrollment[] filterFindByG_U_NotS_PrevAndNext(
			long planEnrollmentId, long groupId, long userId, int status,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByG_U_NotS_PrevAndNext(
			planEnrollmentId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_NotS(long groupId, long userId, int status) {
		getPersistence().removeByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments
	 */
	public static int countByG_U_NotS(long groupId, long userId, int status) {
		return getPersistence().countByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns all the plan enrollments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<PlanEnrollment> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<PlanEnrollment> findByUserId(
		long userId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByUserId(
		long userId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUserId_First(
			long userId, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUserId_First(
		long userId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUserId_Last(
			long userId, OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUserId_Last(
		long userId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where userId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByUserId_PrevAndNext(
			long planEnrollmentId, long userId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUserId_PrevAndNext(
			planEnrollmentId, userId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of plan enrollments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus) {

		return getPersistence().findByUserIdEnrollmentStatus(
			userId, enrollmentStatus);
	}

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
	public static List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus, int start, int end) {

		return getPersistence().findByUserIdEnrollmentStatus(
			userId, enrollmentStatus, start, end);
	}

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
	public static List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByUserIdEnrollmentStatus(
			userId, enrollmentStatus, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserIdEnrollmentStatus(
			userId, enrollmentStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUserIdEnrollmentStatus_First(
			long userId, int enrollmentStatus,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUserIdEnrollmentStatus_First(
			userId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUserIdEnrollmentStatus_First(
		long userId, int enrollmentStatus,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUserIdEnrollmentStatus_First(
			userId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByUserIdEnrollmentStatus_Last(
			long userId, int enrollmentStatus,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUserIdEnrollmentStatus_Last(
			userId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByUserIdEnrollmentStatus_Last(
		long userId, int enrollmentStatus,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByUserIdEnrollmentStatus_Last(
			userId, enrollmentStatus, orderByComparator);
	}

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
	public static PlanEnrollment[] findByUserIdEnrollmentStatus_PrevAndNext(
			long planEnrollmentId, long userId, int enrollmentStatus,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByUserIdEnrollmentStatus_PrevAndNext(
			planEnrollmentId, userId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where userId = &#63; and enrollmentStatus = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 */
	public static void removeByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus) {

		getPersistence().removeByUserIdEnrollmentStatus(
			userId, enrollmentStatus);
	}

	/**
	 * Returns the number of plan enrollments where userId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param enrollmentStatus the enrollment status
	 * @return the number of matching plan enrollments
	 */
	public static int countByUserIdEnrollmentStatus(
		long userId, int enrollmentStatus) {

		return getPersistence().countByUserIdEnrollmentStatus(
			userId, enrollmentStatus);
	}

	/**
	 * Returns all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus) {

		return getPersistence().findByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus);
	}

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
	public static List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end) {

		return getPersistence().findByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus, start, end);
	}

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
	public static List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByGroupIdEnrollmentStatus_First(
			long groupId, int enrollmentStatus,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByGroupIdEnrollmentStatus_First(
			groupId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByGroupIdEnrollmentStatus_First(
		long groupId, int enrollmentStatus,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByGroupIdEnrollmentStatus_First(
			groupId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByGroupIdEnrollmentStatus_Last(
			long groupId, int enrollmentStatus,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByGroupIdEnrollmentStatus_Last(
			groupId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByGroupIdEnrollmentStatus_Last(
		long groupId, int enrollmentStatus,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByGroupIdEnrollmentStatus_Last(
			groupId, enrollmentStatus, orderByComparator);
	}

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
	public static PlanEnrollment[] findByGroupIdEnrollmentStatus_PrevAndNext(
			long planEnrollmentId, long groupId, int enrollmentStatus,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByGroupIdEnrollmentStatus_PrevAndNext(
			planEnrollmentId, groupId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Returns all the plan enrollments that the user has permission to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the matching plan enrollments that the user has permission to view
	 */
	public static List<PlanEnrollment> filterFindByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus) {

		return getPersistence().filterFindByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus);
	}

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
	public static List<PlanEnrollment> filterFindByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end) {

		return getPersistence().filterFindByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus, start, end);
	}

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
	public static List<PlanEnrollment> filterFindByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().filterFindByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus, start, end, orderByComparator);
	}

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
	public static PlanEnrollment[]
			filterFindByGroupIdEnrollmentStatus_PrevAndNext(
				long planEnrollmentId, long groupId, int enrollmentStatus,
				OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().filterFindByGroupIdEnrollmentStatus_PrevAndNext(
			planEnrollmentId, groupId, enrollmentStatus, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where groupId = &#63; and enrollmentStatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 */
	public static void removeByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus) {

		getPersistence().removeByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus);
	}

	/**
	 * Returns the number of plan enrollments where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the number of matching plan enrollments
	 */
	public static int countByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus) {

		return getPersistence().countByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus);
	}

	/**
	 * Returns the number of plan enrollments that the user has permission to view where groupId = &#63; and enrollmentStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param enrollmentStatus the enrollment status
	 * @return the number of matching plan enrollments that the user has permission to view
	 */
	public static int filterCountByGroupIdEnrollmentStatus(
		long groupId, int enrollmentStatus) {

		return getPersistence().filterCountByGroupIdEnrollmentStatus(
			groupId, enrollmentStatus);
	}

	/**
	 * Returns all the plan enrollments where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByMemberUserId(long memberUserId) {
		return getPersistence().findByMemberUserId(memberUserId);
	}

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
	public static List<PlanEnrollment> findByMemberUserId(
		long memberUserId, int start, int end) {

		return getPersistence().findByMemberUserId(memberUserId, start, end);
	}

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
	public static List<PlanEnrollment> findByMemberUserId(
		long memberUserId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByMemberUserId(
			memberUserId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByMemberUserId(
		long memberUserId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByMemberUserId(
			memberUserId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByMemberUserId_First(
			long memberUserId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByMemberUserId_First(
			memberUserId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByMemberUserId_First(
		long memberUserId,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByMemberUserId_First(
			memberUserId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByMemberUserId_Last(
			long memberUserId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByMemberUserId_Last(
			memberUserId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByMemberUserId_Last(
		long memberUserId,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByMemberUserId_Last(
			memberUserId, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where memberUserId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param memberUserId the member user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByMemberUserId_PrevAndNext(
			long planEnrollmentId, long memberUserId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByMemberUserId_PrevAndNext(
			planEnrollmentId, memberUserId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where memberUserId = &#63; from the database.
	 *
	 * @param memberUserId the member user ID
	 */
	public static void removeByMemberUserId(long memberUserId) {
		getPersistence().removeByMemberUserId(memberUserId);
	}

	/**
	 * Returns the number of plan enrollments where memberUserId = &#63;.
	 *
	 * @param memberUserId the member user ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByMemberUserId(long memberUserId) {
		return getPersistence().countByMemberUserId(memberUserId);
	}

	/**
	 * Returns all the plan enrollments where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByMemberId(String memberId) {
		return getPersistence().findByMemberId(memberId);
	}

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
	public static List<PlanEnrollment> findByMemberId(
		String memberId, int start, int end) {

		return getPersistence().findByMemberId(memberId, start, end);
	}

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
	public static List<PlanEnrollment> findByMemberId(
		String memberId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByMemberId(
			memberId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByMemberId(
		String memberId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByMemberId(
			memberId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByMemberId_First(
			String memberId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByMemberId_First(
			memberId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByMemberId_First(
		String memberId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByMemberId_First(
			memberId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByMemberId_Last(
			String memberId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByMemberId_Last(
			memberId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByMemberId_Last(
		String memberId, OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByMemberId_Last(
			memberId, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where memberId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param memberId the member ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByMemberId_PrevAndNext(
			long planEnrollmentId, String memberId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByMemberId_PrevAndNext(
			planEnrollmentId, memberId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where memberId = &#63; from the database.
	 *
	 * @param memberId the member ID
	 */
	public static void removeByMemberId(String memberId) {
		getPersistence().removeByMemberId(memberId);
	}

	/**
	 * Returns the number of plan enrollments where memberId = &#63;.
	 *
	 * @param memberId the member ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByMemberId(String memberId) {
		return getPersistence().countByMemberId(memberId);
	}

	/**
	 * Returns all the plan enrollments where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @return the matching plan enrollments
	 */
	public static List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId) {

		return getPersistence().findByInsurancePlan(insurancePlanId);
	}

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
	public static List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId, int start, int end) {

		return getPersistence().findByInsurancePlan(
			insurancePlanId, start, end);
	}

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
	public static List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findByInsurancePlan(
			insurancePlanId, start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findByInsurancePlan(
		long insurancePlanId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByInsurancePlan(
			insurancePlanId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByInsurancePlan_First(
			long insurancePlanId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByInsurancePlan_First(
			insurancePlanId, orderByComparator);
	}

	/**
	 * Returns the first plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByInsurancePlan_First(
		long insurancePlanId,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByInsurancePlan_First(
			insurancePlanId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByInsurancePlan_Last(
			long insurancePlanId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByInsurancePlan_Last(
			insurancePlanId, orderByComparator);
	}

	/**
	 * Returns the last plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByInsurancePlan_Last(
		long insurancePlanId,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().fetchByInsurancePlan_Last(
			insurancePlanId, orderByComparator);
	}

	/**
	 * Returns the plan enrollments before and after the current plan enrollment in the ordered set where insurancePlanId = &#63;.
	 *
	 * @param planEnrollmentId the primary key of the current plan enrollment
	 * @param insurancePlanId the insurance plan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment[] findByInsurancePlan_PrevAndNext(
			long planEnrollmentId, long insurancePlanId,
			OrderByComparator<PlanEnrollment> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByInsurancePlan_PrevAndNext(
			planEnrollmentId, insurancePlanId, orderByComparator);
	}

	/**
	 * Removes all the plan enrollments where insurancePlanId = &#63; from the database.
	 *
	 * @param insurancePlanId the insurance plan ID
	 */
	public static void removeByInsurancePlan(long insurancePlanId) {
		getPersistence().removeByInsurancePlan(insurancePlanId);
	}

	/**
	 * Returns the number of plan enrollments where insurancePlanId = &#63;.
	 *
	 * @param insurancePlanId the insurance plan ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByInsurancePlan(long insurancePlanId) {
		return getPersistence().countByInsurancePlan(insurancePlanId);
	}

	/**
	 * Returns the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; or throws a <code>NoSuchPlanEnrollmentException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment findByERC_G(
			String externalReferenceCode, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByERC_G(
		String externalReferenceCode, long groupId) {

		return getPersistence().fetchByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plan enrollment, or <code>null</code> if a matching plan enrollment could not be found
	 */
	public static PlanEnrollment fetchByERC_G(
		String externalReferenceCode, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByERC_G(
			externalReferenceCode, groupId, useFinderCache);
	}

	/**
	 * Removes the plan enrollment where externalReferenceCode = &#63; and groupId = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the plan enrollment that was removed
	 */
	public static PlanEnrollment removeByERC_G(
			String externalReferenceCode, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().removeByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the number of plan enrollments where externalReferenceCode = &#63; and groupId = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the number of matching plan enrollments
	 */
	public static int countByERC_G(String externalReferenceCode, long groupId) {
		return getPersistence().countByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Caches the plan enrollment in the entity cache if it is enabled.
	 *
	 * @param planEnrollment the plan enrollment
	 */
	public static void cacheResult(PlanEnrollment planEnrollment) {
		getPersistence().cacheResult(planEnrollment);
	}

	/**
	 * Caches the plan enrollments in the entity cache if it is enabled.
	 *
	 * @param planEnrollments the plan enrollments
	 */
	public static void cacheResult(List<PlanEnrollment> planEnrollments) {
		getPersistence().cacheResult(planEnrollments);
	}

	/**
	 * Creates a new plan enrollment with the primary key. Does not add the plan enrollment to the database.
	 *
	 * @param planEnrollmentId the primary key for the new plan enrollment
	 * @return the new plan enrollment
	 */
	public static PlanEnrollment create(long planEnrollmentId) {
		return getPersistence().create(planEnrollmentId);
	}

	/**
	 * Removes the plan enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planEnrollmentId the primary key of the plan enrollment
	 * @return the plan enrollment that was removed
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment remove(long planEnrollmentId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().remove(planEnrollmentId);
	}

	public static PlanEnrollment updateImpl(PlanEnrollment planEnrollment) {
		return getPersistence().updateImpl(planEnrollment);
	}

	/**
	 * Returns the plan enrollment with the primary key or throws a <code>NoSuchPlanEnrollmentException</code> if it could not be found.
	 *
	 * @param planEnrollmentId the primary key of the plan enrollment
	 * @return the plan enrollment
	 * @throws NoSuchPlanEnrollmentException if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment findByPrimaryKey(long planEnrollmentId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchPlanEnrollmentException {

		return getPersistence().findByPrimaryKey(planEnrollmentId);
	}

	/**
	 * Returns the plan enrollment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param planEnrollmentId the primary key of the plan enrollment
	 * @return the plan enrollment, or <code>null</code> if a plan enrollment with the primary key could not be found
	 */
	public static PlanEnrollment fetchByPrimaryKey(long planEnrollmentId) {
		return getPersistence().fetchByPrimaryKey(planEnrollmentId);
	}

	/**
	 * Returns all the plan enrollments.
	 *
	 * @return the plan enrollments
	 */
	public static List<PlanEnrollment> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<PlanEnrollment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<PlanEnrollment> findAll(
		int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<PlanEnrollment> findAll(
		int start, int end, OrderByComparator<PlanEnrollment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the plan enrollments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of plan enrollments.
	 *
	 * @return the number of plan enrollments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PlanEnrollmentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(PlanEnrollmentPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile PlanEnrollmentPersistence _persistence;

}