/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

/**
 * Provides a wrapper for {@link InsurancePlanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanLocalService
 * @generated
 */
public class InsurancePlanLocalServiceWrapper
	implements InsurancePlanLocalService,
			   ServiceWrapper<InsurancePlanLocalService> {

	public InsurancePlanLocalServiceWrapper() {
		this(null);
	}

	public InsurancePlanLocalServiceWrapper(
		InsurancePlanLocalService insurancePlanLocalService) {

		_insurancePlanLocalService = insurancePlanLocalService;
	}

	/**
	 * Adds the insurance plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlan the insurance plan
	 * @return the insurance plan that was added
	 */
	@Override
	public InsurancePlan addInsurancePlan(InsurancePlan insurancePlan) {
		return _insurancePlanLocalService.addInsurancePlan(insurancePlan);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param providerName
	 * @param planName
	 * @param active
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan addInsurancePlan(
			String providerName, String planName, boolean active,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.addInsurancePlan(
			providerName, planName, active, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan addInsurancePlan(
			String providerName, String planName, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.addInsurancePlan(
			providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the default coverage period of 12 months.
	 *
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan addInsurancePlan(
			String providerName, String planName, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.addInsurancePlan(
			providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, serviceContext);
	}

	@Override
	public void addResources(
			InsurancePlan insurancePlan, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		_insurancePlanLocalService.addResources(
			insurancePlan, addGroupPermissions, addGuestPermissions);
	}

	@Override
	public void addResources(
			InsurancePlan insurancePlan,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		_insurancePlanLocalService.addResources(
			insurancePlan, modelPermissions);
	}

	/**
	 * Creates a new insurance plan with the primary key. Does not add the insurance plan to the database.
	 *
	 * @param insurancePlanId the primary key for the new insurance plan
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan createInsurancePlan(long insurancePlanId) {
		return _insurancePlanLocalService.createInsurancePlan(insurancePlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * deleteGroupInsurancePlans: Deletes all insurance plans in the group, called by the group
	 * model listener to clean up any data when the group is being deleted.
	 *
	 * @param groupId
	 * @throws PortalException
	 */
	@Override
	public void deleteGroupInsurancePlans(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_insurancePlanLocalService.deleteGroupInsurancePlans(groupId);
	}

	/**
	 * Deletes the insurance plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlan the insurance plan
	 * @return the insurance plan that was removed
	 * @throws PortalException
	 */
	@Override
	public InsurancePlan deleteInsurancePlan(InsurancePlan insurancePlan)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.deleteInsurancePlan(insurancePlan);
	}

	/**
	 * Deletes the insurance plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan that was removed
	 * @throws PortalException if a insurance plan with the primary key could not be found
	 */
	@Override
	public InsurancePlan deleteInsurancePlan(long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.deleteInsurancePlan(insurancePlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _insurancePlanLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _insurancePlanLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _insurancePlanLocalService.dynamicQuery();
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

		return _insurancePlanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
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

		return _insurancePlanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
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

		return _insurancePlanLocalService.dynamicQuery(
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

		return _insurancePlanLocalService.dynamicQueryCount(dynamicQuery);
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

		return _insurancePlanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public InsurancePlan fetchInsurancePlan(long insurancePlanId) {
		return _insurancePlanLocalService.fetchInsurancePlan(insurancePlanId);
	}

	@Override
	public InsurancePlan fetchInsurancePlanByExternalReferenceCode(
		String externalReferenceCode, long groupId) {

		return _insurancePlanLocalService.
			fetchInsurancePlanByExternalReferenceCode(
				externalReferenceCode, groupId);
	}

	/**
	 * Returns the insurance plan matching the UUID and group.
	 *
	 * @param uuid the insurance plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching insurance plan, or <code>null</code> if a matching insurance plan could not be found
	 */
	@Override
	public InsurancePlan fetchInsurancePlanByUuidAndGroupId(
		String uuid, long groupId) {

		return _insurancePlanLocalService.fetchInsurancePlanByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _insurancePlanLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _insurancePlanLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _insurancePlanLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the insurance plan with the primary key.
	 *
	 * @param insurancePlanId the primary key of the insurance plan
	 * @return the insurance plan
	 * @throws PortalException if a insurance plan with the primary key could not be found
	 */
	@Override
	public InsurancePlan getInsurancePlan(long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.getInsurancePlan(insurancePlanId);
	}

	@Override
	public InsurancePlan getInsurancePlanByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.
			getInsurancePlanByExternalReferenceCode(
				externalReferenceCode, groupId);
	}

	/**
	 * Returns the insurance plan matching the UUID and group.
	 *
	 * @param uuid the insurance plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching insurance plan
	 * @throws PortalException if a matching insurance plan could not be found
	 */
	@Override
	public InsurancePlan getInsurancePlanByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.getInsurancePlanByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the insurance plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @return the range of insurance plans
	 */
	@Override
	public java.util.List<InsurancePlan> getInsurancePlans(int start, int end) {
		return _insurancePlanLocalService.getInsurancePlans(start, end);
	}

	/**
	 * getInsurancePlans: Returns all of the plans in the given group with the given status, used by the
	 * TrashHandler implementation.
	 *
	 * @param groupId
	 * @param status
	 * @param start
	 * @param end
	 * @return
	 * @throws PortalException
	 */
	@Override
	public java.util.List<InsurancePlan> getInsurancePlans(
			long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.getInsurancePlans(
			groupId, status, start, end);
	}

	@Override
	public java.util.List<InsurancePlan> getInsurancePlansByGroup(
			long groupId, int start, int max)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.getInsurancePlansByGroup(
			groupId, start, max);
	}

	/**
	 * Returns all the insurance plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the insurance plans
	 * @param companyId the primary key of the company
	 * @return the matching insurance plans, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<InsurancePlan> getInsurancePlansByUuidAndCompanyId(
		String uuid, long companyId) {

		return _insurancePlanLocalService.getInsurancePlansByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of insurance plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the insurance plans
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of insurance plans
	 * @param end the upper bound of the range of insurance plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching insurance plans, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<InsurancePlan> getInsurancePlansByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InsurancePlan>
			orderByComparator) {

		return _insurancePlanLocalService.getInsurancePlansByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of insurance plans.
	 *
	 * @return the number of insurance plans
	 */
	@Override
	public int getInsurancePlansCount() {
		return _insurancePlanLocalService.getInsurancePlansCount();
	}

	@Override
	public int getInsurancePlansCount(long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.getInsurancePlansCount(
			groupId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _insurancePlanLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param insurancePlan the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public InsurancePlan moveInsurancePlanToTrash(
			long userId, InsurancePlan insurancePlan)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.moveInsurancePlanToTrash(
			userId, insurancePlan);
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param insurancePlanId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public InsurancePlan moveInsurancePlanToTrash(
			long userId, long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.moveInsurancePlanToTrash(
			userId, insurancePlanId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param insurancePlanId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public InsurancePlan restoreInsurancePlanFromTrash(
			long userId, long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.restoreInsurancePlanFromTrash(
			userId, insurancePlanId);
	}

	@Override
	public void updateAsset(
			long userId, InsurancePlan insurancePlan, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws com.liferay.portal.kernel.exception.PortalException {

		_insurancePlanLocalService.updateAsset(
			userId, insurancePlan, assetCategoryIds, assetTagNames,
			assetLinkEntryIds, assetPriority);
	}

	/**
	 * Updates the insurance plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlan the insurance plan
	 * @return the insurance plan that was updated
	 */
	@Override
	public InsurancePlan updateInsurancePlan(InsurancePlan insurancePlan) {
		return _insurancePlanLocalService.updateInsurancePlan(insurancePlan);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param providerName
	 * @param planName
	 * @param active
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			boolean active, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.updateInsurancePlan(
			insurancePlanId, providerName, planName, active,
			annualExamAllowanceCents, annualFramesAllowanceCents,
			annualLensesAllowanceCents, annualContactsAllowanceCents,
			coveragePeriodMonths, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param coveragePeriodMonths
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.updateInsurancePlan(
			insurancePlanId, providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, coveragePeriodMonths, serviceContext);
	}

	/**
	 * Adds a new insurance plan with the default coverage period of 12 months.
	 *
	 * @param providerName
	 * @param planName
	 * @param annualExamAllowanceCents
	 * @param annualFramesAllowanceCents
	 * @param annualLensesAllowanceCents
	 * @param annualContactsAllowanceCents
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.updateInsurancePlan(
			insurancePlanId, providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, serviceContext);
	}

	@Override
	public InsurancePlan updateStatus(
			long userId, long insurancePlanId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<String, java.io.Serializable> workflowContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanLocalService.updateStatus(
			userId, insurancePlanId, status, serviceContext, workflowContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _insurancePlanLocalService.getBasePersistence();
	}

	@Override
	public CTPersistence<InsurancePlan> getCTPersistence() {
		return _insurancePlanLocalService.getCTPersistence();
	}

	@Override
	public Class<InsurancePlan> getModelClass() {
		return _insurancePlanLocalService.getModelClass();
	}

	@Override
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<InsurancePlan>, R, E>
				updateUnsafeFunction)
		throws E {

		return _insurancePlanLocalService.updateWithUnsafeFunction(
			updateUnsafeFunction);
	}

	@Override
	public InsurancePlanLocalService getWrappedService() {
		return _insurancePlanLocalService;
	}

	@Override
	public void setWrappedService(
		InsurancePlanLocalService insurancePlanLocalService) {

		_insurancePlanLocalService = insurancePlanLocalService;
	}

	private InsurancePlanLocalService _insurancePlanLocalService;

}