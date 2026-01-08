/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence;

import com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchInsurancePlanException;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the insurance plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanUtil
 * @generated
 */
@ProviderType
public interface InsurancePlanPersistence
	extends BasePersistence<InsurancePlan>, CTPersistence<InsurancePlan> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InsurancePlanUtil} to access the insurance plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the insurance plans where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByUuid(String uuid);

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
	public java.util.List<InsurancePlan> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<InsurancePlan> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where uuid = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan[] findByUuid_PrevAndNext(
			long insurancePlanId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of insurance plans where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching insurance plans
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the insurance plan where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByUUID_G(String uuid, long groupId)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the insurance plan where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the insurance plan where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the insurance plan where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the insurance plan that was removed
	 */
	public InsurancePlan removeByUUID_G(String uuid, long groupId)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the number of insurance plans where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching insurance plans
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<InsurancePlan> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<InsurancePlan> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByUuid_C_PrevAndNext(
			long insurancePlanId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of insurance plans where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching insurance plans
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the insurance plans where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByGroupId(long groupId);

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
	public java.util.List<InsurancePlan> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<InsurancePlan> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where groupId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan[] findByGroupId_PrevAndNext(
			long insurancePlanId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByGroupId(long groupId);

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
	public java.util.List<InsurancePlan> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set of insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan[] filterFindByGroupId_PrevAndNext(
			long insurancePlanId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of insurance plans where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching insurance plans
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active);

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
	public java.util.List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active, int start, int end);

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
	public java.util.List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByCompanyIdActive(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByCompanyIdActive_First(
			long companyId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByCompanyIdActive_First(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByCompanyIdActive_Last(
			long companyId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByCompanyIdActive_Last(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByCompanyIdActive_PrevAndNext(
			long insurancePlanId, long companyId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where companyId = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 */
	public void removeByCompanyIdActive(long companyId, boolean active);

	/**
	 * Returns the number of insurance plans where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the number of matching insurance plans
	 */
	public int countByCompanyIdActive(long companyId, boolean active);

	/**
	 * Returns all the insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active);

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
	public java.util.List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active, int start, int end);

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
	public java.util.List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByGroupIdActive(
		long groupId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByGroupIdActive_First(
			long groupId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByGroupIdActive_First(
		long groupId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByGroupIdActive_Last(
			long groupId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByGroupIdActive_Last(
		long groupId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByGroupIdActive_PrevAndNext(
			long insurancePlanId, long groupId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByGroupIdActive(
		long groupId, boolean active);

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
	public java.util.List<InsurancePlan> filterFindByGroupIdActive(
		long groupId, boolean active, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByGroupIdActive(
		long groupId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] filterFindByGroupIdActive_PrevAndNext(
			long insurancePlanId, long groupId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where groupId = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 */
	public void removeByGroupIdActive(long groupId, boolean active);

	/**
	 * Returns the number of insurance plans where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching insurance plans
	 */
	public int countByGroupIdActive(long groupId, boolean active);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByGroupIdActive(long groupId, boolean active);

	/**
	 * Returns all the insurance plans where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByCompanyId(long companyId);

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
	public java.util.List<InsurancePlan> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<InsurancePlan> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the insurance plans before and after the current insurance plan in the ordered set where companyId = &#63;.
	 *
	 * @param insurancePlanId the primary key of the current insurance plan
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan[] findByCompanyId_PrevAndNext(
			long insurancePlanId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of insurance plans where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching insurance plans
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByG_S(long groupId, int status);

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
	public java.util.List<InsurancePlan> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByG_S_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByG_S(
		long groupId, int status);

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
	public java.util.List<InsurancePlan> filterFindByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] filterFindByG_S_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of insurance plans where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByG_S(long groupId, int status);

	/**
	 * Returns all the insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByG_NotS(long groupId, int status);

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
	public java.util.List<InsurancePlan> findByG_NotS(
		long groupId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByG_NotS_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_NotS_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByG_NotS_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_NotS_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByG_NotS_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByG_NotS(
		long groupId, int status);

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
	public java.util.List<InsurancePlan> filterFindByG_NotS(
		long groupId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByG_NotS(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] filterFindByG_NotS_PrevAndNext(
			long insurancePlanId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where groupId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_NotS(long groupId, int status);

	/**
	 * Returns the number of insurance plans where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public int countByG_NotS(long groupId, int status);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByG_NotS(long groupId, int status);

	/**
	 * Returns all the insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByC_S(long companyId, int status);

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
	public java.util.List<InsurancePlan> findByC_S(
		long companyId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByC_S_PrevAndNext(
			long insurancePlanId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of insurance plans where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns all the insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByC_NotS(
		long companyId, int status);

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
	public java.util.List<InsurancePlan> findByC_NotS(
		long companyId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByC_NotS(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByC_NotS_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByC_NotS_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByC_NotS_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByC_NotS_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByC_NotS_PrevAndNext(
			long insurancePlanId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_NotS(long companyId, int status);

	/**
	 * Returns the number of insurance plans where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public int countByC_NotS(long companyId, int status);

	/**
	 * Returns all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

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
	public InsurancePlan findByG_U_S_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_U_S_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan findByG_U_S_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_U_S_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByG_U_S_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] filterFindByG_U_S_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int[] statuses);

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
	public java.util.List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the insurance plans where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of insurance plans where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of insurance plans where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching insurance plans
	 */
	public int countByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans
	 */
	public java.util.List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status);

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
	public java.util.List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

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
	public InsurancePlan findByG_U_NotS_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the first insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_U_NotS_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan findByG_U_NotS_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the last insurance plan in the ordered set where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByG_U_NotS_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] findByG_U_NotS_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns all the insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching insurance plans that the user has permission to view
	 */
	public java.util.List<InsurancePlan> filterFindByG_U_NotS(
		long groupId, long userId, int status);

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
	public java.util.List<InsurancePlan> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<InsurancePlan> filterFindByG_U_NotS(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public InsurancePlan[] filterFindByG_U_NotS_PrevAndNext(
			long insurancePlanId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
				orderByComparator)
		throws NoSuchInsurancePlanException;

	/**
	 * Removes all the insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of insurance plans where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans
	 */
	public int countByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the number of insurance plans that the user has permission to view where groupId = &#63; and userId = &#63; and status &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching insurance plans that the user has permission to view
	 */
	public int filterCountByG_U_NotS(long groupId, long userId, int status);

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByExternalReferenceCode(
			String externalReferenceCode)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByExternalReferenceCode(
		String externalReferenceCode);

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByExternalReferenceCode(
		String externalReferenceCode, boolean useFinderCache);

	/**
	 * Removes the insurance plan where externalReferenceCode = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the insurance plan that was removed
	 */
	public InsurancePlan removeByExternalReferenceCode(
			String externalReferenceCode)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the number of insurance plans where externalReferenceCode = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @return the number of matching insurance plans
	 */
	public int countByExternalReferenceCode(String externalReferenceCode);

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; and groupId = &#63; or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching insurance plan
	 * @throws NoSuchInsurancePlanException if a matching insurance plan could not be found
	 */
	public InsurancePlan findByERC_G(String externalReferenceCode, long groupId)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByERC_G(
		String externalReferenceCode, long groupId);

	/**
	 * Returns the insurance plan where externalReferenceCode = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	public InsurancePlan fetchByERC_G(
		String externalReferenceCode, long groupId, boolean useFinderCache);

	/**
	 * Removes the insurance plan where externalReferenceCode = &#63; and groupId = &#63; from the database.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the insurance plan that was removed
	 */
	public InsurancePlan removeByERC_G(
			String externalReferenceCode, long groupId)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the number of insurance plans where externalReferenceCode = &#63; and groupId = &#63;.
	 *
	 * @param externalReferenceCode the external reference code
	 * @param groupId the group ID
	 * @return the number of matching insurance plans
	 */
	public int countByERC_G(String externalReferenceCode, long groupId);

	/**
	 * Caches the insurance plan in the entity cache if it is enabled.
	 *
	 * @param insurancePlan the insurance plan
	 */
	public void cacheResult(InsurancePlan insurancePlan);

	/**
	 * Caches the insurance plans in the entity cache if it is enabled.
	 *
	 * @param insurancePlans the insurance plans
	 */
	public void cacheResult(java.util.List<InsurancePlan> insurancePlans);

	/**
	 * Creates a new insurance plan with the primary key. Does not add the insurance plan to the database.
	 *
	 * @param insurancePlanId the primary key for the new insurance plan
	 * @return the new insurance plan
	 */
	public InsurancePlan create(long insurancePlanId);

	/**
	 * Removes the insurance plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan that was removed
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan remove(long insurancePlanId)
		throws NoSuchInsurancePlanException;

	public InsurancePlan updateImpl(InsurancePlan insurancePlan);

	/**
	 * Returns the insurance plan with the primary key or throws a <code>NoSuchInsurancePlanException</code> if it could not be found.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan
	 * @throws NoSuchInsurancePlanException if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan findByPrimaryKey(long insurancePlanId)
		throws NoSuchInsurancePlanException;

	/**
	 * Returns the insurance plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan, or <code>null</code> if a insurance plan with the primary key could not be found
	 */
	public InsurancePlan fetchByPrimaryKey(long insurancePlanId);

	/**
	 * Returns all the insurance plans.
	 *
	 * @return the insurance plans
	 */
	public java.util.List<InsurancePlan> findAll();

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
	public java.util.List<InsurancePlan> findAll(int start, int end);

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
	public java.util.List<InsurancePlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator);

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
	public java.util.List<InsurancePlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the insurance plans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of insurance plans.
	 *
	 * @return the number of insurance plans
	 */
	public int countAll();

}