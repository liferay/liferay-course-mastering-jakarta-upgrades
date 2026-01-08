/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service utility for BenefitUsage. This utility wraps
 * <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.BenefitUsageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsageLocalService
 * @generated
 */
public class BenefitUsageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.BenefitUsageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the benefit usage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BenefitUsageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param benefitUsage the benefit usage
	 * @return the benefit usage that was added
	 */
	public static BenefitUsage addBenefitUsage(BenefitUsage benefitUsage) {
		return getService().addBenefitUsage(benefitUsage);
	}

	public static BenefitUsage addBenefitUsage(
			long planEnrollmentId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addBenefitUsage(
			planEnrollmentId, benefitType, amountUsedCents, serviceDate,
			reference, notes, sourceType, sourceReference, serviceContext);
	}

	public static void addResources(
			BenefitUsage usage, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		getService().addResources(
			usage, addGroupPermissions, addGuestPermissions);
	}

	public static void addResources(
			BenefitUsage usage,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws PortalException {

		getService().addResources(usage, modelPermissions);
	}

	/**
	 * Creates a new benefit usage with the primary key. Does not add the benefit usage to the database.
	 *
	 * @param benefitUsageId the primary key for the new benefit usage
	 * @return the new benefit usage
	 */
	public static BenefitUsage createBenefitUsage(long benefitUsageId) {
		return getService().createBenefitUsage(benefitUsageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the benefit usage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BenefitUsageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param benefitUsage the benefit usage
	 * @return the benefit usage that was removed
	 * @throws PortalException
	 */
	public static BenefitUsage deleteBenefitUsage(BenefitUsage benefitUsage)
		throws PortalException {

		return getService().deleteBenefitUsage(benefitUsage);
	}

	/**
	 * Deletes the benefit usage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BenefitUsageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage that was removed
	 * @throws PortalException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage deleteBenefitUsage(long benefitUsageId)
		throws PortalException {

		return getService().deleteBenefitUsage(benefitUsageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * deletePlanEnrollmentBenefitUsages: Deletes all of the benefit usages associated with the
	 * given plan enrollment. Used to clean up data and not leave orphaned records.
	 *
	 * @param planEnrollmentId
	 * @throws PortalException
	 */
	public static void deletePlanEnrollmentBenefitUsages(long planEnrollmentId)
		throws PortalException {

		getService().deletePlanEnrollmentBenefitUsages(planEnrollmentId);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static BenefitUsage fetchBenefitUsage(long benefitUsageId) {
		return getService().fetchBenefitUsage(benefitUsageId);
	}

	public static BenefitUsage fetchBenefitUsageByExternalReferenceCode(
		String externalReferenceCode, long groupId) {

		return getService().fetchBenefitUsageByExternalReferenceCode(
			externalReferenceCode, groupId);
	}

	/**
	 * Returns the benefit usage matching the UUID and group.
	 *
	 * @param uuid the benefit usage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	public static BenefitUsage fetchBenefitUsageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchBenefitUsageByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the benefit usage with the primary key.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage
	 * @throws PortalException if a benefit usage with the primary key could not be found
	 */
	public static BenefitUsage getBenefitUsage(long benefitUsageId)
		throws PortalException {

		return getService().getBenefitUsage(benefitUsageId);
	}

	public static BenefitUsage getBenefitUsageByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws PortalException {

		return getService().getBenefitUsageByExternalReferenceCode(
			externalReferenceCode, groupId);
	}

	/**
	 * Returns the benefit usage matching the UUID and group.
	 *
	 * @param uuid the benefit usage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching benefit usage
	 * @throws PortalException if a matching benefit usage could not be found
	 */
	public static BenefitUsage getBenefitUsageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getBenefitUsageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the benefit usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.BenefitUsageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @return the range of benefit usages
	 */
	public static List<BenefitUsage> getBenefitUsages(int start, int end) {
		return getService().getBenefitUsages(start, end);
	}

	public static List<BenefitUsage> getBenefitUsagesByPlanEnrollmentsStatus(
			List<Long> planEnrollmentIds, int status, int start, int max)
		throws PortalException {

		return getService().getBenefitUsagesByPlanEnrollmentsStatus(
			planEnrollmentIds, status, start, max);
	}

	public static List<BenefitUsage> getBenefitUsagesByPlanEnrollmentStatus(
			long planEnrollmentId, int status, int start, int max)
		throws PortalException {

		return getService().getBenefitUsagesByPlanEnrollmentStatus(
			planEnrollmentId, status, start, max);
	}

	/**
	 * Returns all the benefit usages matching the UUID and company.
	 *
	 * @param uuid the UUID of the benefit usages
	 * @param companyId the primary key of the company
	 * @return the matching benefit usages, or an empty list if no matches were found
	 */
	public static List<BenefitUsage> getBenefitUsagesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getBenefitUsagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of benefit usages matching the UUID and company.
	 *
	 * @param uuid the UUID of the benefit usages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of benefit usages
	 * @param end the upper bound of the range of benefit usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching benefit usages, or an empty list if no matches were found
	 */
	public static List<BenefitUsage> getBenefitUsagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator) {

		return getService().getBenefitUsagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of benefit usages.
	 *
	 * @return the number of benefit usages
	 */
	public static int getBenefitUsagesCount() {
		return getService().getBenefitUsagesCount();
	}

	public static int getBenefitUsagesCountByPlanEnrollmentsStatus(
			List<Long> planEnrollmentIds, int status)
		throws PortalException {

		return getService().getBenefitUsagesCountByPlanEnrollmentsStatus(
			planEnrollmentIds, status);
	}

	public static int getBenefitUsagesCountByPlanEnrollmentStatus(
			long planEnrollmentId, int status)
		throws PortalException {

		return getService().getBenefitUsagesCountByPlanEnrollmentStatus(
			planEnrollmentId, status);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param usage the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static BenefitUsage moveBenefitUsageToTrash(
			long userId, BenefitUsage usage)
		throws PortalException {

		return getService().moveBenefitUsageToTrash(userId, usage);
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static BenefitUsage moveBenefitUsageToTrash(
			long userId, long benefitUsageId)
		throws PortalException {

		return getService().moveBenefitUsageToTrash(userId, benefitUsageId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	public static BenefitUsage restoreBenefitUsageFromTrash(
			long userId, long benefitUsageId)
		throws PortalException {

		return getService().restoreBenefitUsageFromTrash(
			userId, benefitUsageId);
	}

	public static void updateAsset(
			long userId, BenefitUsage usage, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws PortalException {

		getService().updateAsset(
			userId, usage, assetCategoryIds, assetTagNames, assetLinkEntryIds,
			assetPriority);
	}

	/**
	 * Updates the benefit usage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BenefitUsageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param benefitUsage the benefit usage
	 * @return the benefit usage that was updated
	 */
	public static BenefitUsage updateBenefitUsage(BenefitUsage benefitUsage) {
		return getService().updateBenefitUsage(benefitUsage);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public static BenefitUsage updateBenefitUsage(
			long benefitUsageId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateBenefitUsage(
			benefitUsageId, benefitType, amountUsedCents, serviceDate,
			reference, notes, sourceType, sourceReference, serviceContext);
	}

	public static BenefitUsage updateStatus(
			long userId, long benefitUsageId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			Map<String, Serializable> workflowContext)
		throws PortalException {

		return getService().updateStatus(
			userId, benefitUsageId, status, serviceContext, workflowContext);
	}

	public static BenefitUsageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BenefitUsageLocalService> _serviceSnapshot =
		new Snapshot<>(
			BenefitUsageLocalServiceUtil.class, BenefitUsageLocalService.class);

}