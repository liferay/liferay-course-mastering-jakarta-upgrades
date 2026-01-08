/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence;

import com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchBenefitUsageException;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the benefit usage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsageUtil
 * @generated
 */
@ProviderType
public interface BenefitUsagePersistence
	extends BasePersistence<BenefitUsage>, CTPersistence<BenefitUsage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BenefitUsageUtil} to access the benefit usage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the benefit usages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByUuid(String uuid);

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
	public java.util.List<BenefitUsage> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<BenefitUsage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where uuid = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage[] findByUuid_PrevAndNext(
			long benefitUsageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of benefit usages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching benefit usages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the benefit usage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBenefitUsageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByUUID_G(String uuid, long groupId)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the benefit usage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the benefit usage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the benefit usage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the benefit usage that was removed
	 */
	public BenefitUsage removeByUUID_G(String uuid, long groupId)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the number of benefit usages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching benefit usages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<BenefitUsage> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<BenefitUsage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByUuid_C_PrevAndNext(
			long benefitUsageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of benefit usages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching benefit usages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the benefit usages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByGroupId(long groupId);

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
	public java.util.List<BenefitUsage> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<BenefitUsage> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where groupId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage[] findByGroupId_PrevAndNext(
			long benefitUsageId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByGroupId(long groupId);

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
	public java.util.List<BenefitUsage> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set of benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage[] filterFindByGroupId_PrevAndNext(
			long benefitUsageId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of benefit usages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching benefit usages
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the benefit usages where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByCompanyId(long companyId);

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
	public java.util.List<BenefitUsage> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<BenefitUsage> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where companyId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage[] findByCompanyId_PrevAndNext(
			long benefitUsageId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of benefit usages where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching benefit usages
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByG_S(long groupId, int status);

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
	public java.util.List<BenefitUsage> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByG_S_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_S(
		long groupId, int status);

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
	public java.util.List<BenefitUsage> filterFindByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] filterFindByG_S_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_S(long groupId, int status);

	/**
	 * Returns all the benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByG_NotS(long groupId, int status);

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
	public java.util.List<BenefitUsage> findByG_NotS(
		long groupId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByG_NotS_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_NotS_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByG_NotS_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_NotS_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByG_NotS_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_NotS(
		long groupId, int status);

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
	public java.util.List<BenefitUsage> filterFindByG_NotS(
		long groupId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] filterFindByG_NotS_PrevAndNext(
			long benefitUsageId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_NotS(long groupId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByG_NotS(long groupId, int status);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_NotS(long groupId, int status);

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status);

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
	public java.util.List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByPE_S(
		long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPE_S_First(
			long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPE_S_First(
		long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPE_S_Last(
			long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPE_S_Last(
		long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByPE_S_PrevAndNext(
			long benefitUsageId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; and status = &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public void removeByPE_S(long planEnrollmentId, int status);

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByPE_S(long planEnrollmentId, int status);

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status);

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
	public java.util.List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByPE_NotS(
		long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPE_NotS_First(
			long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPE_NotS_First(
		long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPE_NotS_Last(
			long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPE_NotS_Last(
		long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByPE_NotS_PrevAndNext(
			long benefitUsageId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public void removeByPE_NotS(long planEnrollmentId, int status);

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByPE_NotS(long planEnrollmentId, int status);

	/**
	 * Returns all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status);

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
	public java.util.List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

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
	public BenefitUsage findByG_PE_S_First(
			long groupId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_PE_S_First(
		long groupId, long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage findByG_PE_S_Last(
			long groupId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_PE_S_Last(
		long groupId, long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByG_PE_S_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_PE_S(
		long groupId, long planEnrollmentId, int status);

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
	public java.util.List<BenefitUsage> filterFindByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_PE_S(
		long groupId, long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] filterFindByG_PE_S_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public void removeByG_PE_S(long groupId, long planEnrollmentId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByG_PE_S(long groupId, long planEnrollmentId, int status);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_PE_S(
		long groupId, long planEnrollmentId, int status);

	/**
	 * Returns all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status);

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
	public java.util.List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

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
	public BenefitUsage findByG_PE_NotS_First(
			long groupId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_PE_NotS_First(
		long groupId, long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage findByG_PE_NotS_Last(
			long groupId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_PE_NotS_Last(
		long groupId, long planEnrollmentId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByG_PE_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_PE_NotS(
		long groupId, long planEnrollmentId, int status);

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
	public java.util.List<BenefitUsage> filterFindByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_PE_NotS(
		long groupId, long planEnrollmentId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] filterFindByG_PE_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long planEnrollmentId,
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 */
	public void removeByG_PE_NotS(
		long groupId, long planEnrollmentId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByG_PE_NotS(
		long groupId, long planEnrollmentId, int status);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and planEnrollmentId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param planEnrollmentId the plan enrollment ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_PE_NotS(
		long groupId, long planEnrollmentId, int status);

	/**
	 * Returns all the benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByC_S(long companyId, int status);

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
	public java.util.List<BenefitUsage> findByC_S(
		long companyId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByC_S_PrevAndNext(
			long benefitUsageId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of benefit usages where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns all the benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByC_NotS(
		long companyId, int status);

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
	public java.util.List<BenefitUsage> findByC_NotS(
		long companyId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByC_NotS_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByC_NotS_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByC_NotS_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByC_NotS_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByC_NotS_PrevAndNext(
			long benefitUsageId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_NotS(long companyId, int status);

	/**
	 * Returns the number of benefit usages where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByC_NotS(long companyId, int status);

	/**
	 * Returns all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

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
	public BenefitUsage findByG_U_S_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_U_S_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage findByG_U_S_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_U_S_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByG_U_S_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] filterFindByG_U_S_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int[] statuses);

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
	public java.util.List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the benefit usages where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching benefit usages
	 */
	public int countByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status);

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
	public java.util.List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

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
	public BenefitUsage findByG_U_NotS_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage findByG_U_NotS_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByG_U_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns all the benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching benefit usages that the user has permission to view
	 */
	public java.util.List<BenefitUsage> filterFindByG_U_NotS(
		long groupId, long userId, int status);

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
	public java.util.List<BenefitUsage> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<BenefitUsage> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] filterFindByG_U_NotS_PrevAndNext(
			long benefitUsageId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of benefit usages where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages
	 */
	public int countByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of benefit usages that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching benefit usages that the user has permission to view
	 */
	public int filterCountByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId);

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
	public java.util.List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId, int start, int end);

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
	public java.util.List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByPlanEnrollment(
		long planEnrollmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPlanEnrollment_First(
			long planEnrollmentId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPlanEnrollment_First(
		long planEnrollmentId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPlanEnrollment_Last(
			long planEnrollmentId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPlanEnrollment_Last(
		long planEnrollmentId,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the benefit usages before and after the current benefit usage in the ordered set where planEnrollmentId = &#63;.
	 *
	 * @param benefitUsageId the primary key of the current benefit usage
	 * @param planEnrollmentId the plan enrollment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage[] findByPlanEnrollment_PrevAndNext(
			long benefitUsageId, long planEnrollmentId,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 */
	public void removeByPlanEnrollment(long planEnrollmentId);

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @return the number of matching benefit usages
	 */
	public int countByPlanEnrollment(long planEnrollmentId);

	/**
	 * Returns all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @return the matching benefit usages
	 */
	public java.util.List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate);

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
	public java.util.List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate, int start, int end);

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
	public java.util.List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPlanEnrollmentServiceDate_First(
			long planEnrollmentId, Date serviceDate,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the first benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPlanEnrollmentServiceDate_First(
		long planEnrollmentId, Date serviceDate,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByPlanEnrollmentServiceDate_Last(
			long planEnrollmentId, Date serviceDate,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the last benefit usage in the ordered set where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByPlanEnrollmentServiceDate_Last(
		long planEnrollmentId, Date serviceDate,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public BenefitUsage[] findByPlanEnrollmentServiceDate_PrevAndNext(
			long benefitUsageId, long planEnrollmentId, Date serviceDate,
			com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
				orderByComparator)
		throws NoSuchBenefitUsageException;

	/**
	 * Removes all the benefit usages where planEnrollmentId = &#63; and serviceDate = &#63; from the database.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 */
	public void removeByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate);

	/**
	 * Returns the number of benefit usages where planEnrollmentId = &#63; and serviceDate = &#63;.
	 *
	 * @param planEnrollmentId the plan enrollment ID
	 * @param serviceDate the service date
	 * @return the number of matching benefit usages
	 */
	public int countByPlanEnrollmentServiceDate(
		long planEnrollmentId, Date serviceDate);

	/**
	 * Returns the benefit usage where externalReferenceCode = &#63; and groupId = &#63; or throws a <code>NoSuchBenefitUsageException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching benefit usage
	 * @throws NoSuchBenefitUsageException if a matching benefit usage could not be found
	 */
	public BenefitUsage findByERC_G(String externalReferenceCode, long groupId)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the benefit usage where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByERC_G(
		String externalReferenceCode, long groupId);

	/**
	 * Returns the benefit usage where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public BenefitUsage fetchByERC_G(
		String externalReferenceCode, long groupId, boolean useFinderCache);

	/**
	 * Removes the benefit usage where externalReferenceCode = &#63; and groupId = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the benefit usage that was removed
	 */
	public BenefitUsage removeByERC_G(
			String externalReferenceCode, long groupId)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the number of benefit usages where externalReferenceCode = &#63; and groupId = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the number of matching benefit usages
	 */
	public int countByERC_G(String externalReferenceCode, long groupId);

	/**
	 * Caches the benefit usage in the entity cache if it is enabled.
	 *
	 * @param benefitUsage the benefit usage
	 */
	public void cacheResult(BenefitUsage benefitUsage);

	/**
	 * Caches the benefit usages in the entity cache if it is enabled.
	 *
	 * @param benefitUsages the benefit usages
	 */
	public void cacheResult(java.util.List<BenefitUsage> benefitUsages);

	/**
	 * Creates a new benefit usage with the primary key. Does not add the benefit usage to the database.
	 *
	 * @param benefitUsageId the primary key for the new benefit usage
	 * @return the new benefit usage
	 */
	public BenefitUsage create(long benefitUsageId);

	/**
	 * Removes the benefit usage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage that was removed
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage remove(long benefitUsageId)
		throws NoSuchBenefitUsageException;

	public BenefitUsage updateImpl(BenefitUsage benefitUsage);

	/**
	 * Returns the benefit usage with the primary key or throws a <code>NoSuchBenefitUsageException</code> if it could not be found.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage
	 * @throws NoSuchBenefitUsageException if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage findByPrimaryKey(long benefitUsageId)
		throws NoSuchBenefitUsageException;

	/**
	 * Returns the benefit usage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage, or <code>null</code> if a benefit usage with the primary key could not be found
	 */
	public BenefitUsage fetchByPrimaryKey(long benefitUsageId);

	/**
	 * Returns all the benefit usages.
	 *
	 * @return the benefit usages
	 */
	public java.util.List<BenefitUsage> findAll();

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
	public java.util.List<BenefitUsage> findAll(int start, int end);

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
	public java.util.List<BenefitUsage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator);

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
	public java.util.List<BenefitUsage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the benefit usages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of benefit usages.
	 *
	 * @return the number of benefit usages
	 */
	public int countAll();

}