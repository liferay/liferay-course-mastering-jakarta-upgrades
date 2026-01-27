/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

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
 * Provides the local service utility for PlanEnrollment. This utility wraps
 * <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.PlanEnrollmentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentLocalService
 * @generated
 */
public class PlanEnrollmentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.PlanEnrollmentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static PlanEnrollment addPlanEnrollment(
			long insurancePlanId, long memberUserId, String memberId,
			String groupNumber, java.util.Date startDate,
			java.util.Date endDate, int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addPlanEnrollment(
			insurancePlanId, memberUserId, memberId, groupNumber, startDate,
			endDate, enrollmentStatus, notes, serviceContext);
	}

	/**
	 * Adds the Plan Enrollment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanEnrollmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param planEnrollment the Plan Enrollment
	 * @return the Plan Enrollment that was added
	 */
	public static PlanEnrollment addPlanEnrollment(
		PlanEnrollment planEnrollment) {

		return getService().addPlanEnrollment(planEnrollment);
	}

	public static void addResources(
			PlanEnrollment enrollment, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		getService().addResources(
			enrollment, addGroupPermissions, addGuestPermissions);
	}

	public static void addResources(
			PlanEnrollment enrollment,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws PortalException {

		getService().addResources(enrollment, modelPermissions);
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
	 * Creates a new Plan Enrollment with the primary key. Does not add the Plan Enrollment to the database.
	 *
	 * @param planEnrollmentId the primary key for the new Plan Enrollment
	 * @return the new Plan Enrollment
	 */
	public static PlanEnrollment createPlanEnrollment(long planEnrollmentId) {
		return getService().createPlanEnrollment(planEnrollmentId);
	}

	/**
	 * deleteInsurancePlanEnrollments: Called when an insurance plan is getting deleted so we can
	 * prevent orphaned data from getting into the system.
	 *
	 * @param insurancePlanId
	 * @throws PortalException
	 */
	public static void deleteInsurancePlanEnrollments(long insurancePlanId)
		throws PortalException {

		getService().deleteInsurancePlanEnrollments(insurancePlanId);
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
	 * Deletes the Plan Enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanEnrollmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param planEnrollmentId the primary key of the Plan Enrollment
	 * @return the Plan Enrollment that was removed
	 * @throws PortalException if a Plan Enrollment with the primary key could not be found
	 */
	public static PlanEnrollment deletePlanEnrollment(long planEnrollmentId)
		throws PortalException {

		return getService().deletePlanEnrollment(planEnrollmentId);
	}

	/**
	 * Deletes the Plan Enrollment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanEnrollmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param planEnrollment the Plan Enrollment
	 * @return the Plan Enrollment that was removed
	 * @throws PortalException
	 */
	public static PlanEnrollment deletePlanEnrollment(
			PlanEnrollment planEnrollment)
		throws PortalException {

		return getService().deletePlanEnrollment(planEnrollment);
	}

	public static void deleteUserPlanEnrollments(long memberUserId)
		throws PortalException {

		getService().deleteUserPlanEnrollments(memberUserId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.PlanEnrollmentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.PlanEnrollmentModelImpl</code>.
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

	public static PlanEnrollment fetchPlanEnrollment(long planEnrollmentId) {
		return getService().fetchPlanEnrollment(planEnrollmentId);
	}

	public static PlanEnrollment fetchPlanEnrollmentByExternalReferenceCode(
		String externalReferenceCode, long groupId) {

		return getService().fetchPlanEnrollmentByExternalReferenceCode(
			externalReferenceCode, groupId);
	}

	/**
	 * Returns the Plan Enrollment matching the UUID and group.
	 *
	 * @param uuid the Plan Enrollment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Plan Enrollment, or <code>null</code> if a matching Plan Enrollment could not be found
	 */
	public static PlanEnrollment fetchPlanEnrollmentByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchPlanEnrollmentByUuidAndGroupId(uuid, groupId);
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
	 * Returns the Plan Enrollment with the primary key.
	 *
	 * @param planEnrollmentId the primary key of the Plan Enrollment
	 * @return the Plan Enrollment
	 * @throws PortalException if a Plan Enrollment with the primary key could not be found
	 */
	public static PlanEnrollment getPlanEnrollment(long planEnrollmentId)
		throws PortalException {

		return getService().getPlanEnrollment(planEnrollmentId);
	}

	public static int getPlanEnrollmentAndBenefitUsageCounts(
			long insurancePlanId, int status)
		throws PortalException {

		return getService().getPlanEnrollmentAndBenefitUsageCounts(
			insurancePlanId, status);
	}

	public static List<Object> getPlanEnrollmentAndBenefitUsages(
			long insurancePlanId, int status, int start, int max)
		throws PortalException {

		return getService().getPlanEnrollmentAndBenefitUsages(
			insurancePlanId, status, start, max);
	}

	public static PlanEnrollment getPlanEnrollmentByExternalReferenceCode(
		String externalReferenceCode) {

		return getService().getPlanEnrollmentByExternalReferenceCode(
			externalReferenceCode);
	}

	public static PlanEnrollment getPlanEnrollmentByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws PortalException {

		return getService().getPlanEnrollmentByExternalReferenceCode(
			externalReferenceCode, groupId);
	}

	/**
	 * Returns the Plan Enrollment matching the UUID and group.
	 *
	 * @param uuid the Plan Enrollment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Plan Enrollment
	 * @throws PortalException if a matching Plan Enrollment could not be found
	 */
	public static PlanEnrollment getPlanEnrollmentByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getPlanEnrollmentByUuidAndGroupId(uuid, groupId);
	}

	public static int getPlanEnrollmentCounts(
		long insurancePlanId, int status) {

		return getService().getPlanEnrollmentCounts(insurancePlanId, status);
	}

	/**
	 * Returns a range of all the Plan Enrollments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.PlanEnrollmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of Plan Enrollments
	 * @param end the upper bound of the range of Plan Enrollments (not inclusive)
	 * @return the range of Plan Enrollments
	 */
	public static List<PlanEnrollment> getPlanEnrollments(int start, int end) {
		return getService().getPlanEnrollments(start, end);
	}

	public static List<PlanEnrollment> getPlanEnrollments(
		long insurancePlanId, int status, int start, int max) {

		return getService().getPlanEnrollments(
			insurancePlanId, status, start, max);
	}

	/**
	 * Returns all the Plan Enrollments matching the UUID and company.
	 *
	 * @param uuid the UUID of the Plan Enrollments
	 * @param companyId the primary key of the company
	 * @return the matching Plan Enrollments, or an empty list if no matches were found
	 */
	public static List<PlanEnrollment> getPlanEnrollmentsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getPlanEnrollmentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of Plan Enrollments matching the UUID and company.
	 *
	 * @param uuid the UUID of the Plan Enrollments
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of Plan Enrollments
	 * @param end the upper bound of the range of Plan Enrollments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching Plan Enrollments, or an empty list if no matches were found
	 */
	public static List<PlanEnrollment> getPlanEnrollmentsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator) {

		return getService().getPlanEnrollmentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of Plan Enrollments.
	 *
	 * @return the number of Plan Enrollments
	 */
	public static int getPlanEnrollmentsCount() {
		return getService().getPlanEnrollmentsCount();
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static PlanEnrollment movePlanEnrollmentToTrash(
			long userId, long planEnrollmentId)
		throws PortalException {

		return getService().movePlanEnrollmentToTrash(userId, planEnrollmentId);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param enrollment the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public static PlanEnrollment movePlanEnrollmentToTrash(
			long userId, PlanEnrollment enrollment)
		throws PortalException {

		return getService().movePlanEnrollmentToTrash(userId, enrollment);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	public static PlanEnrollment restorePlanEnrollmentFromTrash(
			long userId, long planEnrollmentId)
		throws PortalException {

		return getService().restorePlanEnrollmentFromTrash(
			userId, planEnrollmentId);
	}

	public static void updateAsset(
			long userId, PlanEnrollment enrollment, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws PortalException {

		getService().updateAsset(
			userId, enrollment, assetCategoryIds, assetTagNames,
			assetLinkEntryIds, assetPriority);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	public static PlanEnrollment updatePlanEnrollment(
			long planEnrollmentId, String memberId, String groupNumber,
			java.util.Date startDate, java.util.Date endDate,
			int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updatePlanEnrollment(
			planEnrollmentId, memberId, groupNumber, startDate, endDate,
			enrollmentStatus, notes, serviceContext);
	}

	/**
	 * Updates the Plan Enrollment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanEnrollmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param planEnrollment the Plan Enrollment
	 * @return the Plan Enrollment that was updated
	 */
	public static PlanEnrollment updatePlanEnrollment(
		PlanEnrollment planEnrollment) {

		return getService().updatePlanEnrollment(planEnrollment);
	}

	public static PlanEnrollment updateStatus(
			long userId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			Map<String, Serializable> workflowContext)
		throws PortalException {

		return getService().updateStatus(
			userId, planEnrollmentId, status, serviceContext, workflowContext);
	}

	public static PlanEnrollmentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PlanEnrollmentLocalService> _serviceSnapshot =
		new Snapshot<>(
			PlanEnrollmentLocalServiceUtil.class,
			PlanEnrollmentLocalService.class);

}