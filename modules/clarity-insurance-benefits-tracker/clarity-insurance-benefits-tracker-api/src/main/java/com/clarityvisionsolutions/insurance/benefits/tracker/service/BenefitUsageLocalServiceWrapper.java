/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

/**
 * Provides a wrapper for {@link BenefitUsageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsageLocalService
 * @generated
 */
public class BenefitUsageLocalServiceWrapper
	implements BenefitUsageLocalService,
			   ServiceWrapper<BenefitUsageLocalService> {

	public BenefitUsageLocalServiceWrapper() {
		this(null);
	}

	public BenefitUsageLocalServiceWrapper(
		BenefitUsageLocalService benefitUsageLocalService) {

		_benefitUsageLocalService = benefitUsageLocalService;
	}

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
	@Override
	public BenefitUsage addBenefitUsage(BenefitUsage benefitUsage) {
		return _benefitUsageLocalService.addBenefitUsage(benefitUsage);
	}

	@Override
	public BenefitUsage addBenefitUsage(
			long planEnrollmentId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.addBenefitUsage(
			planEnrollmentId, benefitType, amountUsedCents, serviceDate,
			reference, notes, sourceType, sourceReference, serviceContext);
	}

	@Override
	public void addResources(
			BenefitUsage usage, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		_benefitUsageLocalService.addResources(
			usage, addGroupPermissions, addGuestPermissions);
	}

	@Override
	public void addResources(
			BenefitUsage usage,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		_benefitUsageLocalService.addResources(usage, modelPermissions);
	}

	/**
	 * Creates a new benefit usage with the primary key. Does not add the benefit usage to the database.
	 *
	 * @param benefitUsageId the primary key for the new benefit usage
	 * @return the new benefit usage
	 */
	@Override
	public BenefitUsage createBenefitUsage(long benefitUsageId) {
		return _benefitUsageLocalService.createBenefitUsage(benefitUsageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public BenefitUsage deleteBenefitUsage(BenefitUsage benefitUsage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.deleteBenefitUsage(benefitUsage);
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
	@Override
	public BenefitUsage deleteBenefitUsage(long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.deleteBenefitUsage(benefitUsageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * deletePlanEnrollmentBenefitUsages: Deletes all of the benefit usages associated with the
	 * given plan enrollment. Used to clean up data and not leave orphaned records.
	 *
	 * @param planEnrollmentId
	 * @throws PortalException
	 */
	@Override
	public void deletePlanEnrollmentBenefitUsages(long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_benefitUsageLocalService.deletePlanEnrollmentBenefitUsages(
			planEnrollmentId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _benefitUsageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _benefitUsageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _benefitUsageLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _benefitUsageLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _benefitUsageLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _benefitUsageLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _benefitUsageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _benefitUsageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public BenefitUsage fetchBenefitUsage(long benefitUsageId) {
		return _benefitUsageLocalService.fetchBenefitUsage(benefitUsageId);
	}

	@Override
	public BenefitUsage fetchBenefitUsageByExternalReferenceCode(
		String externalReferenceCode, long groupId) {

		return _benefitUsageLocalService.
			fetchBenefitUsageByExternalReferenceCode(
				externalReferenceCode, groupId);
	}

	/**
	 * Returns the benefit usage matching the UUID and group.
	 *
	 * @param uuid the benefit usage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	@Override
	public BenefitUsage fetchBenefitUsageByUuidAndGroupId(
		String uuid, long groupId) {

		return _benefitUsageLocalService.fetchBenefitUsageByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _benefitUsageLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the benefit usage with the primary key.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage
	 * @throws PortalException if a benefit usage with the primary key could not be found
	 */
	@Override
	public BenefitUsage getBenefitUsage(long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.getBenefitUsage(benefitUsageId);
	}

	@Override
	public BenefitUsage getBenefitUsageByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.getBenefitUsageByExternalReferenceCode(
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
	@Override
	public BenefitUsage getBenefitUsageByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.getBenefitUsageByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<BenefitUsage> getBenefitUsages(int start, int end) {
		return _benefitUsageLocalService.getBenefitUsages(start, end);
	}

	@Override
	public java.util.List<BenefitUsage> getBenefitUsagesByPlanEnrollmentsStatus(
			java.util.List<Long> planEnrollmentIds, int status, int start,
			int max)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.
			getBenefitUsagesByPlanEnrollmentsStatus(
				planEnrollmentIds, status, start, max);
	}

	@Override
	public java.util.List<BenefitUsage> getBenefitUsagesByPlanEnrollmentStatus(
			long planEnrollmentId, int status, int start, int max)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.getBenefitUsagesByPlanEnrollmentStatus(
			planEnrollmentId, status, start, max);
	}

	/**
	 * Returns all the benefit usages matching the UUID and company.
	 *
	 * @param uuid the UUID of the benefit usages
	 * @param companyId the primary key of the company
	 * @return the matching benefit usages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<BenefitUsage> getBenefitUsagesByUuidAndCompanyId(
		String uuid, long companyId) {

		return _benefitUsageLocalService.getBenefitUsagesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<BenefitUsage> getBenefitUsagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BenefitUsage>
			orderByComparator) {

		return _benefitUsageLocalService.getBenefitUsagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of benefit usages.
	 *
	 * @return the number of benefit usages
	 */
	@Override
	public int getBenefitUsagesCount() {
		return _benefitUsageLocalService.getBenefitUsagesCount();
	}

	@Override
	public int getBenefitUsagesCountByPlanEnrollmentsStatus(
			java.util.List<Long> planEnrollmentIds, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.
			getBenefitUsagesCountByPlanEnrollmentsStatus(
				planEnrollmentIds, status);
	}

	@Override
	public int getBenefitUsagesCountByPlanEnrollmentStatus(
			long planEnrollmentId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.
			getBenefitUsagesCountByPlanEnrollmentStatus(
				planEnrollmentId, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _benefitUsageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _benefitUsageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _benefitUsageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param usage the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public BenefitUsage moveBenefitUsageToTrash(long userId, BenefitUsage usage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.moveBenefitUsageToTrash(userId, usage);
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public BenefitUsage moveBenefitUsageToTrash(
			long userId, long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.moveBenefitUsageToTrash(
			userId, benefitUsageId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public BenefitUsage restoreBenefitUsageFromTrash(
			long userId, long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.restoreBenefitUsageFromTrash(
			userId, benefitUsageId);
	}

	@Override
	public void updateAsset(
			long userId, BenefitUsage usage, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws com.liferay.portal.kernel.exception.PortalException {

		_benefitUsageLocalService.updateAsset(
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
	@Override
	public BenefitUsage updateBenefitUsage(BenefitUsage benefitUsage) {
		return _benefitUsageLocalService.updateBenefitUsage(benefitUsage);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public BenefitUsage updateBenefitUsage(
			long benefitUsageId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.updateBenefitUsage(
			benefitUsageId, benefitType, amountUsedCents, serviceDate,
			reference, notes, sourceType, sourceReference, serviceContext);
	}

	@Override
	public BenefitUsage updateStatus(
			long userId, long benefitUsageId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<String, java.io.Serializable> workflowContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageLocalService.updateStatus(
			userId, benefitUsageId, status, serviceContext, workflowContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _benefitUsageLocalService.getBasePersistence();
	}

	@Override
	public CTPersistence<BenefitUsage> getCTPersistence() {
		return _benefitUsageLocalService.getCTPersistence();
	}

	@Override
	public Class<BenefitUsage> getModelClass() {
		return _benefitUsageLocalService.getModelClass();
	}

	@Override
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<BenefitUsage>, R, E>
				updateUnsafeFunction)
		throws E {

		return _benefitUsageLocalService.updateWithUnsafeFunction(
			updateUnsafeFunction);
	}

	@Override
	public BenefitUsageLocalService getWrappedService() {
		return _benefitUsageLocalService;
	}

	@Override
	public void setWrappedService(
		BenefitUsageLocalService benefitUsageLocalService) {

		_benefitUsageLocalService = benefitUsageLocalService;
	}

	private BenefitUsageLocalService _benefitUsageLocalService;

}