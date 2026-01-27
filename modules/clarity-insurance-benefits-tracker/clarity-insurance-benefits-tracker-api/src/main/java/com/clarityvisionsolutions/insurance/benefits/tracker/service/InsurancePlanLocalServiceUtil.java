/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

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
 * Provides the local service utility for InsurancePlan. This utility wraps
 * <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.InsurancePlanLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanLocalService
 * @generated
 */
public class InsurancePlanLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.InsurancePlanLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the Insurance Plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlan the Insurance Plan
	 * @return the Insurance Plan that was added
	 */
	public static InsurancePlan addInsurancePlan(InsurancePlan insurancePlan) {
		return getService().addInsurancePlan(insurancePlan);
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
	public static InsurancePlan addInsurancePlan(
			String providerName, String planName, boolean active,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addInsurancePlan(
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
	public static InsurancePlan addInsurancePlan(
			String providerName, String planName, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addInsurancePlan(
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
	public static InsurancePlan addInsurancePlan(
			String providerName, String planName, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addInsurancePlan(
			providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, serviceContext);
	}

	public static void addResources(
			InsurancePlan insurancePlan, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		getService().addResources(
			insurancePlan, addGroupPermissions, addGuestPermissions);
	}

	public static void addResources(
			InsurancePlan insurancePlan,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws PortalException {

		getService().addResources(insurancePlan, modelPermissions);
	}

	/**
	 * Creates a new Insurance Plan with the primary key. Does not add the Insurance Plan to the database.
	 *
	 * @param insurancePlanId the primary key for the new Insurance Plan
	 * @return the new Insurance Plan
	 */
	public static InsurancePlan createInsurancePlan(long insurancePlanId) {
		return getService().createInsurancePlan(insurancePlanId);
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
	 * deleteGroupInsurancePlans: Deletes all insurance plans in the group, called by the group
	 * model listener to clean up any data when the group is being deleted.
	 *
	 * @param groupId
	 * @throws PortalException
	 */
	public static void deleteGroupInsurancePlans(long groupId)
		throws PortalException {

		getService().deleteGroupInsurancePlans(groupId);
	}

	/**
	 * Deletes the Insurance Plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlan the Insurance Plan
	 * @return the Insurance Plan that was removed
	 * @throws PortalException
	 */
	public static InsurancePlan deleteInsurancePlan(InsurancePlan insurancePlan)
		throws PortalException {

		return getService().deleteInsurancePlan(insurancePlan);
	}

	/**
	 * Deletes the Insurance Plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlanId the primary key of the Insurance Plan
	 * @return the Insurance Plan that was removed
	 * @throws PortalException if a Insurance Plan with the primary key could not be found
	 */
	public static InsurancePlan deleteInsurancePlan(long insurancePlanId)
		throws PortalException {

		return getService().deleteInsurancePlan(insurancePlanId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
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

	public static InsurancePlan fetchInsurancePlan(long insurancePlanId) {
		return getService().fetchInsurancePlan(insurancePlanId);
	}

	public static InsurancePlan fetchInsurancePlanByExternalReferenceCode(
		String externalReferenceCode, long groupId) {

		return getService().fetchInsurancePlanByExternalReferenceCode(
			externalReferenceCode, groupId);
	}

	/**
	 * Returns the Insurance Plan matching the UUID and group.
	 *
	 * @param uuid the Insurance Plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Insurance Plan, or <code>null</code> if a matching Insurance Plan could not be found
	 */
	public static InsurancePlan fetchInsurancePlanByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchInsurancePlanByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the Insurance Plan with the primary key.
	 *
	 * @param insurancePlanId the primary key of the Insurance Plan
	 * @return the Insurance Plan
	 * @throws PortalException if a Insurance Plan with the primary key could not be found
	 */
	public static InsurancePlan getInsurancePlan(long insurancePlanId)
		throws PortalException {

		return getService().getInsurancePlan(insurancePlanId);
	}

	public static InsurancePlan getInsurancePlanByExternalReferenceCode(
		String externalReferenceCode) {

		return getService().getInsurancePlanByExternalReferenceCode(
			externalReferenceCode);
	}

	public static InsurancePlan getInsurancePlanByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws PortalException {

		return getService().getInsurancePlanByExternalReferenceCode(
			externalReferenceCode, groupId);
	}

	/**
	 * Returns the Insurance Plan matching the UUID and group.
	 *
	 * @param uuid the Insurance Plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Insurance Plan
	 * @throws PortalException if a matching Insurance Plan could not be found
	 */
	public static InsurancePlan getInsurancePlanByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getInsurancePlanByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the Insurance Plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Insurance Plans
	 * @param end the upper bound of the range of Insurance Plans (not inclusive)
	 * @return the range of Insurance Plans
	 */
	public static List<InsurancePlan> getInsurancePlans(int start, int end) {
		return getService().getInsurancePlans(start, end);
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
	public static List<InsurancePlan> getInsurancePlans(
			long groupId, int status, int start, int end)
		throws PortalException {

		return getService().getInsurancePlans(groupId, status, start, end);
	}

	public static List<InsurancePlan> getInsurancePlansByGroup(
			long groupId, int start, int max)
		throws PortalException {

		return getService().getInsurancePlansByGroup(groupId, start, max);
	}

	/**
	 * Returns all the Insurance Plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the Insurance Plans
	 * @param companyId the primary key of the company
	 * @return the matching Insurance Plans, or an empty list if no matches were found
	 */
	public static List<InsurancePlan> getInsurancePlansByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getInsurancePlansByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of Insurance Plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the Insurance Plans
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of Insurance Plans
	 * @param end the upper bound of the range of Insurance Plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching Insurance Plans, or an empty list if no matches were found
	 */
	public static List<InsurancePlan> getInsurancePlansByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator) {

		return getService().getInsurancePlansByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of Insurance Plans.
	 *
	 * @return the number of Insurance Plans
	 */
	public static int getInsurancePlansCount() {
		return getService().getInsurancePlansCount();
	}

	public static int getInsurancePlansCount(long groupId, int status)
		throws PortalException {

		return getService().getInsurancePlansCount(groupId, status);
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
	 * @param insurancePlan the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static InsurancePlan moveInsurancePlanToTrash(
			long userId, InsurancePlan insurancePlan)
		throws PortalException {

		return getService().moveInsurancePlanToTrash(userId, insurancePlan);
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param insurancePlanId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static InsurancePlan moveInsurancePlanToTrash(
			long userId, long insurancePlanId)
		throws PortalException {

		return getService().moveInsurancePlanToTrash(userId, insurancePlanId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param insurancePlanId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	public static InsurancePlan restoreInsurancePlanFromTrash(
			long userId, long insurancePlanId)
		throws PortalException {

		return getService().restoreInsurancePlanFromTrash(
			userId, insurancePlanId);
	}

	public static void updateAsset(
			long userId, InsurancePlan insurancePlan, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws PortalException {

		getService().updateAsset(
			userId, insurancePlan, assetCategoryIds, assetTagNames,
			assetLinkEntryIds, assetPriority);
	}

	/**
	 * Updates the Insurance Plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InsurancePlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param insurancePlan the Insurance Plan
	 * @return the Insurance Plan that was updated
	 */
	public static InsurancePlan updateInsurancePlan(
		InsurancePlan insurancePlan) {

		return getService().updateInsurancePlan(insurancePlan);
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
	public static InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			boolean active, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateInsurancePlan(
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
	public static InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateInsurancePlan(
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
	public static InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateInsurancePlan(
			insurancePlanId, providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, serviceContext);
	}

	public static InsurancePlan updateStatus(
			long userId, long insurancePlanId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			Map<String, Serializable> workflowContext)
		throws PortalException {

		return getService().updateStatus(
			userId, insurancePlanId, status, serviceContext, workflowContext);
	}

	public static InsurancePlanLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<InsurancePlanLocalService> _serviceSnapshot =
		new Snapshot<>(
			InsurancePlanLocalServiceUtil.class,
			InsurancePlanLocalService.class);

}