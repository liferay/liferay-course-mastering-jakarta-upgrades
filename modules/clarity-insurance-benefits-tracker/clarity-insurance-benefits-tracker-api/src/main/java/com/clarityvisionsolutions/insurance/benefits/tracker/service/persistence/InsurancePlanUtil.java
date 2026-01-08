/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the insurance plan service. This utility wraps <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.impl.InsurancePlanPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanPersistence
 * @generated
 */
public class InsurancePlanUtil {

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
	public static void clearCache(InsurancePlan insurancePlan) {
		getPersistence().clearCache(insurancePlan);
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
	public static Map<Serializable, InsurancePlan> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<InsurancePlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InsurancePlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InsurancePlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static InsurancePlan update(InsurancePlan insurancePlan) {
		return getPersistence().update(insurancePlan);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static InsurancePlan update(
		InsurancePlan insurancePlan, ServiceContext serviceContext) {

		return getPersistence().update(insurancePlan, serviceContext);
	}

	/**
	 * Returns all the insurance plans where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the insurance plans where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByUuid_First(
			String uuid, OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByUuid_First(
		String uuid, OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByUuid_Last(
			String uuid, OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByUuid_Last(
		String uuid, OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByUuid_PrevAndNext(
			long insurancePlanId, String uuid,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUuid_PrevAndNext(
			insurancePlanId, uuid, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of insurance plans where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching insurance plans
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the insurance plan where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByUUID_G(String uuid, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the insurance plan where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the insurance plan where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the insurance plan where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the insurance plan that was removed
	 */
	public static InsurancePlan removeByUUID_G(String uuid, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of insurance plans where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching insurance plans
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByUuid_C_PrevAndNext(
			long insurancePlanId, String uuid, long companyId,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByUuid_C_PrevAndNext(
			insurancePlanId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching insurance plans
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByGroupId_First(
			long groupId, OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByGroupId_First(
		long groupId, OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByGroupId_Last(
			long groupId, OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByGroupId_Last(
		long groupId, OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByGroupId_PrevAndNext(
			long insurancePlanId, long groupId,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByGroupId_PrevAndNext(
			insurancePlanId, groupId, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] filterFindByGroupId_PrevAndNext(
			long insurancePlanId, long groupId,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			insurancePlanId, groupId, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching insurance plans
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active) {

		return getPersistence().findByCompanyIdActive(companyId, active);
	}

	/**
	 * Returns a range of all the insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active, int start, int end) {

		return getPersistence().findByCompanyIdActive(
			companyId, active, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByCompanyIdActive(
			companyId, active, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyIdActive(
			companyId, active, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByCompanyIdActive_First(
			long companyId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByCompanyIdActive_First(
			companyId, active, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByCompanyIdActive_First(
		long companyId, boolean active,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByCompanyIdActive_First(
			companyId, active, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByCompanyIdActive_Last(
			long companyId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByCompanyIdActive_Last(
			companyId, active, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByCompanyIdActive_Last(
		long companyId, boolean active,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByCompanyIdActive_Last(
			companyId, active, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByCompanyIdActive_PrevAndNext(
			long insurancePlanId, long companyId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByCompanyIdActive_PrevAndNext(
			insurancePlanId, companyId, active, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where companyId = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 */
	public static void removeByCompanyIdActive(long companyId, boolean active) {
		getPersistence().removeByCompanyIdActive(companyId, active);
	}

	/**
	 * Returns the number of insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the number of matching insurance plans
	 */
	public static int countByCompanyIdActive(long companyId, boolean active) {
		return getPersistence().countByCompanyIdActive(companyId, active);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active) {

		return getPersistence().findByGroupIdActive(groupId, active);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active, int start, int end) {

		return getPersistence().findByGroupIdActive(
			groupId, active, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByGroupIdActive(
			groupId, active, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupIdActive(
			groupId, active, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByGroupIdActive_First(
			long groupId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByGroupIdActive_First(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByGroupIdActive_First(
		long groupId, boolean active,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByGroupIdActive_First(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByGroupIdActive_Last(
			long groupId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByGroupIdActive_Last(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByGroupIdActive_Last(
		long groupId, boolean active,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByGroupIdActive_Last(
			groupId, active, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByGroupIdActive_PrevAndNext(
			long insurancePlanId, long groupId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByGroupIdActive_PrevAndNext(
			insurancePlanId, groupId, active, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByGroupIdActive(
		long groupId, boolean active) {

		return getPersistence().filterFindByGroupIdActive(groupId, active);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByGroupIdActive(
		long groupId, boolean active, int start, int end) {

		return getPersistence().filterFindByGroupIdActive(
			groupId, active, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permissions to view where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByGroupIdActive(
		long groupId, boolean active, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByGroupIdActive(
			groupId, active, start, end, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] filterFindByGroupIdActive_PrevAndNext(
			long insurancePlanId, long groupId, boolean active,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().filterFindByGroupIdActive_PrevAndNext(
			insurancePlanId, groupId, active, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where groupId = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 */
	public static void removeByGroupIdActive(long groupId, boolean active) {
		getPersistence().removeByGroupIdActive(groupId, active);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching insurance plans
	 */
	public static int countByGroupIdActive(long groupId, boolean active) {
		return getPersistence().countByGroupIdActive(groupId, active);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByGroupIdActive(long groupId, boolean active) {
		return getPersistence().filterCountByGroupIdActive(groupId, active);
	}

	/**
	 * Returns all the insurance plans where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the insurance plans where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByCompanyId_First(
			long companyId, OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByCompanyId_First(
		long companyId, OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByCompanyId_Last(
			long companyId, OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByCompanyId_Last(
		long companyId, OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByCompanyId_PrevAndNext(
			long insurancePlanId, long companyId,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByCompanyId_PrevAndNext(
			insurancePlanId, companyId, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of insurance plans where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching insurance plans
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_S_First(
			long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_S_Last(
			long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByG_S_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_S_PrevAndNext(
			insurancePlanId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_S(
		long groupId, int status) {

		return getPersistence().filterFindByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permissions to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] filterFindByG_S_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().filterFindByG_S_PrevAndNext(
			insurancePlanId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByG_S(long groupId, int status) {
		return getPersistence().filterCountByG_S(groupId, status);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByG_NotS(long groupId, int status) {
		return getPersistence().findByG_NotS(groupId, status);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_NotS(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_NotS_First(
			long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_NotS_First(
		long groupId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_NotS_Last(
			long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_NotS_Last(
		long groupId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByG_NotS_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_NotS_PrevAndNext(
			insurancePlanId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_NotS(
		long groupId, int status) {

		return getPersistence().filterFindByG_NotS(groupId, status);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_NotS(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permissions to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] filterFindByG_NotS_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().filterFindByG_NotS_PrevAndNext(
			insurancePlanId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_NotS(long groupId, int status) {
		getPersistence().removeByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public static int countByG_NotS(long groupId, int status) {
		return getPersistence().countByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByG_NotS(long groupId, int status) {
		return getPersistence().filterCountByG_NotS(groupId, status);
	}

	/**
	 * Returns all the insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByC_S(long companyId, int status) {
		return getPersistence().findByC_S(companyId, status);
	}

	/**
	 * Returns a range of all the insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByC_S(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_S(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByC_S_First(
			long companyId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByC_S_Last(
			long companyId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByC_S_PrevAndNext(
			long insurancePlanId, long companyId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByC_S_PrevAndNext(
			insurancePlanId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_S(long companyId, int status) {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	 * Returns the number of insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public static int countByC_S(long companyId, int status) {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	 * Returns all the insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByC_NotS(long companyId, int status) {
		return getPersistence().findByC_NotS(companyId, status);
	}

	/**
	 * Returns a range of all the insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByC_NotS(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_NotS(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByC_NotS_First(
			long companyId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByC_NotS_First(
		long companyId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByC_NotS_Last(
			long companyId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByC_NotS_Last(
		long companyId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByC_NotS_PrevAndNext(
			long insurancePlanId, long companyId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByC_NotS_PrevAndNext(
			insurancePlanId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_NotS(long companyId, int status) {
		getPersistence().removeByC_NotS(companyId, status);
	}

	/**
	 * Returns the number of insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public static int countByC_NotS(long companyId, int status) {
		return getPersistence().countByC_NotS(companyId, status);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_U_S_First(
			long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_U_S_First(
		long groupId, long userId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_U_S_Last(
			long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_U_S_Last(
		long groupId, long userId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByG_U_S_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_U_S_PrevAndNext(
			insurancePlanId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permissions to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] filterFindByG_U_S_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().filterFindByG_U_S_PrevAndNext(
			insurancePlanId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterFindByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().findByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Removes all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching insurance plans
	 */
	public static int countByG_U_S(long groupId, long userId, int[] statuses) {
		return getPersistence().countByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterCountByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns a range of all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching insurance plans
	 */
	public static List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_U_NotS_First(
			long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByG_U_NotS_Last(
			long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] findByG_U_NotS_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByG_U_NotS_PrevAndNext(
			insurancePlanId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns a range of all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans that the user has permissions to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching insurance plans that the user has permission to view
	 */
	public static List<InsurancePlan> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan[] filterFindByG_U_NotS_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			OrderByComparator<InsurancePlan> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().filterFindByG_U_NotS_PrevAndNext(
			insurancePlanId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_NotS(long groupId, long userId, int status) {
		getPersistence().removeByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public static int countByG_U_NotS(long groupId, long userId, int status) {
		return getPersistence().countByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public static int filterCountByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByExternalReferenceCode(
			String externalReferenceCode)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByExternalReferenceCode(
			externalReferenceCode);
	}

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByExternalReferenceCode(
		String externalReferenceCode) {

		return getPersistence().fetchByExternalReferenceCode(
			externalReferenceCode);
	}

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByExternalReferenceCode(
		String externalReferenceCode, boolean useFinderCache) {

		return getPersistence().fetchByExternalReferenceCode(
			externalReferenceCode, useFinderCache);
	}

	/**
	 * Removes the insurance plan where externalReferenceCode = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the insurance plan that was removed
	 */
	public static InsurancePlan removeByExternalReferenceCode(
			String externalReferenceCode)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().removeByExternalReferenceCode(
			externalReferenceCode);
	}

	/**
	 * Returns the number of insurance plans where externalReferenceCode = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the number of matching insurance plans
	 */
	public static int countByExternalReferenceCode(
		String externalReferenceCode) {

		return getPersistence().countByExternalReferenceCode(
			externalReferenceCode);
	}

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; and groupId = &#63; or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public static InsurancePlan findByERC_G(
			String externalReferenceCode, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByERC_G(
		String externalReferenceCode, long groupId) {

		return getPersistence().fetchByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public static InsurancePlan fetchByERC_G(
		String externalReferenceCode, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByERC_G(
			externalReferenceCode, groupId, useFinderCache);
	}

	/**
	 * Removes the insurance plan where externalReferenceCode = &#63; and groupId = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the insurance plan that was removed
	 */
	public static InsurancePlan removeByERC_G(
			String externalReferenceCode, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().removeByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the number of insurance plans where externalReferenceCode = &#63; and groupId = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the number of matching insurance plans
	 */
	public static int countByERC_G(String externalReferenceCode, long groupId) {
		return getPersistence().countByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Caches the insurance plan in the entity cache if it is enabled.
	 *
	 * @param insurancePlan the insurance plan
	 */
	public static void cacheResult(InsurancePlan insurancePlan) {
		getPersistence().cacheResult(insurancePlan);
	}

	/**
	 * Caches the insurance plans in the entity cache if it is enabled.
	 *
	 * @param insurancePlans the insurance plans
	 */
	public static void cacheResult(List<InsurancePlan> insurancePlans) {
		getPersistence().cacheResult(insurancePlans);
	}

	/**
	 * Creates a new insurance plan with the primary key. Does not add the insurance plan to the database.
	 *
	 * @param insurancePlanId the primary key for the new insurance plan
	 * @return the new insurance plan
	 */
	public static InsurancePlan create(long insurancePlanId) {
		return getPersistence().create(insurancePlanId);
	}

	/**
	 * Removes the insurance plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan that was removed
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan remove(long insurancePlanId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().remove(insurancePlanId);
	}

	public static InsurancePlan updateImpl(InsurancePlan insurancePlan) {
		return getPersistence().updateImpl(insurancePlan);
	}

	/**
	 * Returns the insurance plan with the primary key or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan findByPrimaryKey(long insurancePlanId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchInsurancePlanException {

		return getPersistence().findByPrimaryKey(insurancePlanId);
	}

	/**
	 * Returns the insurance plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan, or <code>null</code> if a insurance plan with the primary key could not be found
	 */
	public static InsurancePlan fetchByPrimaryKey(long insurancePlanId) {
		return getPersistence().fetchByPrimaryKey(insurancePlanId);
	}

	/**
	 * Returns all the insurance plans.
	 *
	 * @return the insurance plans
	 */
	public static List<InsurancePlan> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the insurance plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of insurance plans
	 */
	public static List<InsurancePlan> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the insurance plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of insurance plans
	 */
	public static List<InsurancePlan> findAll(
		int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the insurance plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of insurance plans
	 */
	public static List<InsurancePlan> findAll(
		int start, int end, OrderByComparator<InsurancePlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the insurance plans from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of insurance plans.
	 *
	 * @return the number of insurance plans
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InsurancePlanPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(InsurancePlanPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile InsurancePlanPersistence _persistence;

}