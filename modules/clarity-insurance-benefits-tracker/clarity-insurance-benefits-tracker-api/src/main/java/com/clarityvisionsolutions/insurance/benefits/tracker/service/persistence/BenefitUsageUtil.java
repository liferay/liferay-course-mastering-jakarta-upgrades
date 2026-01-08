/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the benefit usage service. This utility wraps <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.impl.BenefitUsagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsagePersistence
 * @generated
 */
public class BenefitUsageUtil {

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
	public static void clearCache(BenefitUsage benefitUsage) {
		getPersistence().clearCache(benefitUsage);
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
	public static Map<Serializable, BenefitUsage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BenefitUsage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BenefitUsage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BenefitUsage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BenefitUsage update(BenefitUsage benefitUsage) {
		return getPersistence().update(benefitUsage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BenefitUsage update(
		BenefitUsage benefitUsage, ServiceContext serviceContext) {

		return getPersistence().update(benefitUsage, serviceContext);
	}

	/**
	 * Returns all the benefit usages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the benefit usages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByUuid_First(
			String uuid, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByUuid_First(
		String uuid, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByUuid_Last(
			String uuid, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByUuid_Last(
		String uuid, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByUuid_PrevAndNext(
			long benefitUsageId, String uuid,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUuid_PrevAndNext(
			benefitUsageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of benefit usages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching benefit usages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the benefit usage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBenefitUsageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByUUID_G(String uuid, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the benefit usage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the benefit usage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the benefit usage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the benefit usage that was removed
	 */
	public static BenefitUsage removeByUUID_G(String uuid, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of benefit usages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching benefit usages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByUuid_C_PrevAndNext(
			long benefitUsageId, String uuid, long companyId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			benefitUsageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching benefit usages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByGroupId_First(
			long groupId, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByGroupId_First(
		long groupId, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByGroupId_Last(
			long groupId, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByGroupId_Last(
		long groupId, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByGroupId_PrevAndNext(
			long benefitUsageId, long groupId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByGroupId_PrevAndNext(
			benefitUsageId, groupId, orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByGroupId_PrevAndNext(
			long benefitUsageId, long groupId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			benefitUsageId, groupId, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching benefit usages
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the benefit usages where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the benefit usages where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByCompanyId_First(
			long companyId, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByCompanyId_First(
		long companyId, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByCompanyId_Last(
			long companyId, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByCompanyId_Last(
		long companyId, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByCompanyId_PrevAndNext(
			long benefitUsageId, long companyId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByCompanyId_PrevAndNext(
			benefitUsageId, companyId, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of benefit usages where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching benefit usages
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_S_First(
			long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_S_Last(
			long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByG_S_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_S_PrevAndNext(
			benefitUsageId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_S(long groupId, int status) {
		return getPersistence().filterFindByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByG_S_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByG_S_PrevAndNext(
			benefitUsageId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_S(long groupId, int status) {
		return getPersistence().filterCountByG_S(groupId, status);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_NotS(long groupId, int status) {
		return getPersistence().findByG_NotS(groupId, status);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_NotS(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_NotS(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_NotS_First(
			long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_NotS_First(
		long groupId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_NotS_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_NotS_Last(
			long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_NotS_Last(
		long groupId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_NotS_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByG_NotS_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_NotS_PrevAndNext(
			benefitUsageId, groupId, status, orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_NotS(
		long groupId, int status) {

		return getPersistence().filterFindByG_NotS(groupId, status);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_NotS(
		long groupId, int status, int start, int end) {

		return getPersistence().filterFindByG_NotS(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_NotS(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByG_NotS_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByG_NotS_PrevAndNext(
			benefitUsageId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_NotS(long groupId, int status) {
		getPersistence().removeByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByG_NotS(long groupId, int status) {
		return getPersistence().countByG_NotS(groupId, status);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_NotS(long groupId, int status) {
		return getPersistence().filterCountByG_NotS(groupId, status);
	}

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status) {

		return getPersistence().findByPE_S(planEnrollmentId, status);
	}

	/**
	 * Returns a range of all the benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status, int start, int end) {

		return getPersistence().findByPE_S(
			planEnrollmentId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByPE_S(
			planEnrollmentId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPE_S(
			planEnrollmentId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPE_S_First(
			long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPE_S_First(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPE_S_First(
		long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPE_S_First(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPE_S_Last(
			long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPE_S_Last(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPE_S_Last(
		long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPE_S_Last(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByPE_S_PrevAndNext(
			long benefitUsageId, long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPE_S_PrevAndNext(
			benefitUsageId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; and status = &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public static void removeByPE_S(long planEnrollmentId, int status) {
		getPersistence().removeByPE_S(planEnrollmentId, status);
	}

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByPE_S(long planEnrollmentId, int status) {
		return getPersistence().countByPE_S(planEnrollmentId, status);
	}

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status) {

		return getPersistence().findByPE_NotS(planEnrollmentId, status);
	}

	/**
	 * Returns a range of all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status, int start, int end) {

		return getPersistence().findByPE_NotS(
			planEnrollmentId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByPE_NotS(
			planEnrollmentId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPE_NotS(
			planEnrollmentId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPE_NotS_First(
			long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPE_NotS_First(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPE_NotS_First(
		long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPE_NotS_First(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPE_NotS_Last(
			long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPE_NotS_Last(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPE_NotS_Last(
		long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPE_NotS_Last(
			planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByPE_NotS_PrevAndNext(
			long benefitUsageId, long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPE_NotS_PrevAndNext(
			benefitUsageId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public static void removeByPE_NotS(long planEnrollmentId, int status) {
		getPersistence().removeByPE_NotS(planEnrollmentId, status);
	}

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByPE_NotS(long planEnrollmentId, int status) {
		return getPersistence().countByPE_NotS(planEnrollmentId, status);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().findByG_PE_S(groupId, planEnrollmentId, status);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end) {

		return getPersistence().findByG_PE_S(
			groupId, planEnrollmentId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_PE_S(
			groupId, planEnrollmentId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_PE_S(
			groupId, planEnrollmentId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_PE_S_First(
			long groupId, long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_PE_S_First(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_PE_S_First(
		long groupId, long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_PE_S_First(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_PE_S_Last(
			long groupId, long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_PE_S_Last(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_PE_S_Last(
		long groupId, long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_PE_S_Last(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByG_PE_S_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_PE_S_PrevAndNext(
			benefitUsageId, groupId, planEnrollmentId, status,
			orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_PE_S(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().filterFindByG_PE_S(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end) {

		return getPersistence().filterFindByG_PE_S(
			groupId, planEnrollmentId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_PE_S(
			groupId, planEnrollmentId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByG_PE_S_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByG_PE_S_PrevAndNext(
			benefitUsageId, groupId, planEnrollmentId, status,
			orderByComparator);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public static void removeByG_PE_S(
		long groupId, long planEnrollmentId, int status) {

		getPersistence().removeByG_PE_S(groupId, planEnrollmentId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByG_PE_S(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().countByG_PE_S(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_PE_S(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().filterCountByG_PE_S(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().findByG_PE_NotS(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end) {

		return getPersistence().findByG_PE_NotS(
			groupId, planEnrollmentId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_PE_NotS(
			groupId, planEnrollmentId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_PE_NotS(
			groupId, planEnrollmentId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_PE_NotS_First(
			long groupId, long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_PE_NotS_First(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_PE_NotS_First(
		long groupId, long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_PE_NotS_First(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_PE_NotS_Last(
			long groupId, long planEnrollmentId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_PE_NotS_Last(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_PE_NotS_Last(
		long groupId, long planEnrollmentId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_PE_NotS_Last(
			groupId, planEnrollmentId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByG_PE_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_PE_NotS_PrevAndNext(
			benefitUsageId, groupId, planEnrollmentId, status,
			orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_PE_NotS(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().filterFindByG_PE_NotS(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end) {

		return getPersistence().filterFindByG_PE_NotS(
			groupId, planEnrollmentId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_PE_NotS(
			groupId, planEnrollmentId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByG_PE_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status, OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByG_PE_NotS_PrevAndNext(
			benefitUsageId, groupId, planEnrollmentId, status,
			orderByComparator);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public static void removeByG_PE_NotS(
		long groupId, long planEnrollmentId, int status) {

		getPersistence().removeByG_PE_NotS(groupId, planEnrollmentId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByG_PE_NotS(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().countByG_PE_NotS(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_PE_NotS(
		long groupId, long planEnrollmentId, int status) {

		return getPersistence().filterCountByG_PE_NotS(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns all the benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByC_S(long companyId, int status) {
		return getPersistence().findByC_S(companyId, status);
	}

	/**
	 * Returns a range of all the benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByC_S(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_S(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByC_S_First(
			long companyId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByC_S_Last(
			long companyId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByC_S_PrevAndNext(
			long benefitUsageId, long companyId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByC_S_PrevAndNext(
			benefitUsageId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_S(long companyId, int status) {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	 * Returns the number of benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByC_S(long companyId, int status) {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	 * Returns all the benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByC_NotS(long companyId, int status) {
		return getPersistence().findByC_NotS(companyId, status);
	}

	/**
	 * Returns a range of all the benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByC_NotS(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_NotS(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByC_NotS(
		long companyId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_NotS(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByC_NotS_First(
			long companyId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByC_NotS_First(
		long companyId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByC_NotS_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByC_NotS_Last(
			long companyId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByC_NotS_Last(
		long companyId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByC_NotS_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByC_NotS_PrevAndNext(
			long benefitUsageId, long companyId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByC_NotS_PrevAndNext(
			benefitUsageId, companyId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_NotS(long companyId, int status) {
		getPersistence().removeByC_NotS(companyId, status);
	}

	/**
	 * Returns the number of benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByC_NotS(long companyId, int status) {
		return getPersistence().countByC_NotS(companyId, status);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_U_S_First(
			long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_U_S_First(
		long groupId, long userId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_U_S_Last(
			long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_U_S_Last(
		long groupId, long userId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByG_U_S_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_U_S_PrevAndNext(
			benefitUsageId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByG_U_S_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByG_U_S_PrevAndNext(
			benefitUsageId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterFindByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().findByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, statuses, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching benefit usages
	 */
	public static int countByG_U_S(long groupId, long userId, int[] statuses) {
		return getPersistence().countByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_U_S(
		long groupId, long userId, int[] statuses) {

		return getPersistence().filterCountByG_U_S(groupId, userId, statuses);
	}

	/**
	 * Returns all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns a range of all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_U_NotS_First(
			long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByG_U_NotS_Last(
			long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByG_U_NotS_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByG_U_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByG_U_NotS_PrevAndNext(
			benefitUsageId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterFindByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns a range of all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages that the user has permissions to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages that the user has permission to view
	 */
	public static List<BenefitUsage> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().filterFindByG_U_NotS(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] filterFindByG_U_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().filterFindByG_U_NotS_PrevAndNext(
			benefitUsageId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_NotS(long groupId, long userId, int status) {
		getPersistence().removeByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public static int countByG_U_NotS(long groupId, long userId, int status) {
		return getPersistence().countByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public static int filterCountByG_U_NotS(
		long groupId, long userId, int status) {

		return getPersistence().filterCountByG_U_NotS(groupId, userId, status);
	}

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId) {

		return getPersistence().findByPlanEnrollment(planEnrollmentId);
	}

	/**
	 * Returns a range of all the benefit usages where planEnrollmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId, int start, int end) {

		return getPersistence().findByPlanEnrollment(
			planEnrollmentId, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByPlanEnrollment(
			planEnrollmentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPlanEnrollment(
			planEnrollmentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPlanEnrollment_First(
			long planEnrollmentId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPlanEnrollment_First(
			planEnrollmentId, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPlanEnrollment_First(
		long planEnrollmentId,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPlanEnrollment_First(
			planEnrollmentId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPlanEnrollment_Last(
			long planEnrollmentId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPlanEnrollment_Last(
			planEnrollmentId, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPlanEnrollment_Last(
		long planEnrollmentId,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPlanEnrollment_Last(
			planEnrollmentId, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByPlanEnrollment_PrevAndNext(
			long benefitUsageId, long planEnrollmentId,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPlanEnrollment_PrevAndNext(
			benefitUsageId, planEnrollmentId, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 */
	public static void removeByPlanEnrollment(long planEnrollmentId) {
		getPersistence().removeByPlanEnrollment(planEnrollmentId);
	}

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @return the number of matching benefit usages
	 */
	public static int countByPlanEnrollment(long planEnrollmentId) {
		return getPersistence().countByPlanEnrollment(planEnrollmentId);
	}

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @return the matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate) {

		return getPersistence().findByPlanEnrollmentServiceDate(
			planEnrollmentId, serviceDate);
	}

	/**
	 * Returns a range of all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate, int start, int end) {

		return getPersistence().findByPlanEnrollmentServiceDate(
			planEnrollmentId, serviceDate, start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findByPlanEnrollmentServiceDate(
			planEnrollmentId, serviceDate, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching benefit usages
	 */
	public static List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPlanEnrollmentServiceDate(
			planEnrollmentId, serviceDate, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPlanEnrollmentServiceDate_First(
			long planEnrollmentId, Date serviceDate,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPlanEnrollmentServiceDate_First(
			planEnrollmentId, serviceDate, orderByComparator);
	}

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPlanEnrollmentServiceDate_First(
		long planEnrollmentId, Date serviceDate,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPlanEnrollmentServiceDate_First(
			planEnrollmentId, serviceDate, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByPlanEnrollmentServiceDate_Last(
			long planEnrollmentId, Date serviceDate,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPlanEnrollmentServiceDate_Last(
			planEnrollmentId, serviceDate, orderByComparator);
	}

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByPlanEnrollmentServiceDate_Last(
		long planEnrollmentId, Date serviceDate,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().fetchByPlanEnrollmentServiceDate_Last(
			planEnrollmentId, serviceDate, orderByComparator);
	}

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage[] findByPlanEnrollmentServiceDate_PrevAndNext(
			long benefitUsageId, long planEnrollmentId, Date serviceDate,
			OrderByComparator<BenefitUsage> orderByComparator)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPlanEnrollmentServiceDate_PrevAndNext(
			benefitUsageId, planEnrollmentId, serviceDate, orderByComparator);
	}

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 */
	public static void removeByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate) {

		getPersistence().removeByPlanEnrollmentServiceDate(
			planEnrollmentId, serviceDate);
	}

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @return the number of matching benefit usages
	 */
	public static int countByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate) {

		return getPersistence().countByPlanEnrollmentServiceDate(
			planEnrollmentId, serviceDate);
	}

	/**
	 * Returns the benefit usage where externalReferenceCode = &#63; and groupId = &#63; or throws a <code>NoSuchBenefitUsageException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public static BenefitUsage findByERC_G(
			String externalReferenceCode, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the benefit usage where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByERC_G(
		String externalReferenceCode, long groupId) {

		return getPersistence().fetchByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the benefit usage where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchByERC_G(
		String externalReferenceCode, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByERC_G(
			externalReferenceCode, groupId, useFinderCache);
	}

	/**
	 * Removes the benefit usage where externalReferenceCode = &#63; and groupId = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the benefit usage that was removed
	 */
	public static BenefitUsage removeByERC_G(
			String externalReferenceCode, long groupId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().removeByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Returns the number of benefit usages where externalReferenceCode = &#63; and groupId = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the number of matching benefit usages
	 */
	public static int countByERC_G(String externalReferenceCode, long groupId) {
		return getPersistence().countByERC_G(externalReferenceCode, groupId);
	}

	/**
	 * Caches the benefit usage in the entity cache if it is enabled.
	 *
	 * @param benefitUsage the benefit usage
	 */
	public static void cacheResult(BenefitUsage benefitUsage) {
		getPersistence().cacheResult(benefitUsage);
	}

	/**
	 * Caches the benefit usages in the entity cache if it is enabled.
	 *
	 * @param benefitUsages the benefit usages
	 */
	public static void cacheResult(List<BenefitUsage> benefitUsages) {
		getPersistence().cacheResult(benefitUsages);
	}

	/**
	 * Creates a new benefit usage with the primary key. Does not add the benefit usage to the database.
	 *
	 * @param benefitUsageId the primary key for the new benefit usage
	 * @return the new benefit usage
	 */
	public static BenefitUsage create(long benefitUsageId) {
		return getPersistence().create(benefitUsageId);
	}

	/**
	 * Removes the benefit usage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage that was removed
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage remove(long benefitUsageId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().remove(benefitUsageId);
	}

	public static BenefitUsage updateImpl(BenefitUsage benefitUsage) {
		return getPersistence().updateImpl(benefitUsage);
	}

	/**
	 * Returns the benefit usage with the primary key or throws a <code>NoSuchBenefitUsageException</code> if it could not be found.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage findByPrimaryKey(long benefitUsageId)
		throws com.clarityvisionsolutions.insurance.benefits.tracker.exception.
			NoSuchBenefitUsageException {

		return getPersistence().findByPrimaryKey(benefitUsageId);
	}

	/**
	 * Returns the benefit usage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage, or <code>null</code> if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage fetchByPrimaryKey(long benefitUsageId) {
		return getPersistence().fetchByPrimaryKey(benefitUsageId);
	}

	/**
	 * Returns all the benefit usages.
	 *
	 * @return the benefit usages
	 */
	public static List<BenefitUsage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the benefit usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of benefit usages
	 */
	public static List<BenefitUsage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the benefit usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of benefit usages
	 */
	public static List<BenefitUsage> findAll(
		int start, int end, OrderByComparator<BenefitUsage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the benefit usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of benefit usages
	 */
	public static List<BenefitUsage> findAll(
		int start, int end, OrderByComparator<BenefitUsage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the benefit usages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of benefit usages.
	 *
	 * @return the number of benefit usages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BenefitUsagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(BenefitUsagePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile BenefitUsagePersistence _persistence;

}