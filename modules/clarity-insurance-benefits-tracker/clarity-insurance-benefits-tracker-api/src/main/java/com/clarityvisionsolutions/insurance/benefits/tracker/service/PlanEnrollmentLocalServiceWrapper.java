/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

/**
 * Provides a wrapper for {@link PlanEnrollmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentLocalService
 * @generated
 */
public class PlanEnrollmentLocalServiceWrapper
	implements PlanEnrollmentLocalService,
			   ServiceWrapper<PlanEnrollmentLocalService> {

	public PlanEnrollmentLocalServiceWrapper() {
		this(null);
	}

	public PlanEnrollmentLocalServiceWrapper(
		PlanEnrollmentLocalService planEnrollmentLocalService) {

		_planEnrollmentLocalService = planEnrollmentLocalService;
	}

	@Override
	public PlanEnrollment addPlanEnrollment(
			long insurancePlanId, long memberUserId, String memberId,
			String groupNumber, java.util.Date startDate,
			java.util.Date endDate, int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.addPlanEnrollment(
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
	@Override
	public PlanEnrollment addPlanEnrollment(PlanEnrollment planEnrollment) {
		return _planEnrollmentLocalService.addPlanEnrollment(planEnrollment);
	}

	@Override
	public void addResources(
			PlanEnrollment enrollment, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		_planEnrollmentLocalService.addResources(
			enrollment, addGroupPermissions, addGuestPermissions);
	}

	@Override
	public void addResources(
			PlanEnrollment enrollment,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		_planEnrollmentLocalService.addResources(enrollment, modelPermissions);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new Plan Enrollment with the primary key. Does not add the Plan Enrollment to the database.
	 *
	 * @param planEnrollmentId the primary key for the new Plan Enrollment
	 * @return the new Plan Enrollment
	 */
	@Override
	public PlanEnrollment createPlanEnrollment(long planEnrollmentId) {
		return _planEnrollmentLocalService.createPlanEnrollment(
			planEnrollmentId);
	}

	/**
	 * deleteInsurancePlanEnrollments: Called when an insurance plan is getting deleted so we can
	 * prevent orphaned data from getting into the system.
	 *
	 * @param insurancePlanId
	 * @throws PortalException
	 */
	@Override
	public void deleteInsurancePlanEnrollments(long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_planEnrollmentLocalService.deleteInsurancePlanEnrollments(
			insurancePlanId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public PlanEnrollment deletePlanEnrollment(long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.deletePlanEnrollment(
			planEnrollmentId);
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
	@Override
	public PlanEnrollment deletePlanEnrollment(PlanEnrollment planEnrollment)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.deletePlanEnrollment(planEnrollment);
	}

	@Override
	public void deleteUserPlanEnrollments(long memberUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_planEnrollmentLocalService.deleteUserPlanEnrollments(memberUserId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _planEnrollmentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _planEnrollmentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _planEnrollmentLocalService.dynamicQuery();
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

		return _planEnrollmentLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _planEnrollmentLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _planEnrollmentLocalService.dynamicQuery(
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

		return _planEnrollmentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _planEnrollmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public PlanEnrollment fetchPlanEnrollment(long planEnrollmentId) {
		return _planEnrollmentLocalService.fetchPlanEnrollment(
			planEnrollmentId);
	}

	@Override
	public PlanEnrollment fetchPlanEnrollmentByExternalReferenceCode(
		String externalReferenceCode, long groupId) {

		return _planEnrollmentLocalService.
			fetchPlanEnrollmentByExternalReferenceCode(
				externalReferenceCode, groupId);
	}

	/**
	 * Returns the Plan Enrollment matching the UUID and group.
	 *
	 * @param uuid the Plan Enrollment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Plan Enrollment, or <code>null</code> if a matching Plan Enrollment could not be found
	 */
	@Override
	public PlanEnrollment fetchPlanEnrollmentByUuidAndGroupId(
		String uuid, long groupId) {

		return _planEnrollmentLocalService.fetchPlanEnrollmentByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _planEnrollmentLocalService.getActionableDynamicQuery();
	}

	/**
	 * getActiveGroupEnrollments: Returns all of the active enrollments for the given group.
	 *
	 * @param groupId Group to get the enrollments for.
	 * @return The list of enrollments.
	 */
	@Override
	public java.util.List<PlanEnrollment> getActiveGroupEnrollments(
		long groupId) {

		return _planEnrollmentLocalService.getActiveGroupEnrollments(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _planEnrollmentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _planEnrollmentLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<PlanEnrollment> getMemberPlanEnrollments(
		long groupId, long memberUserId, int enrollmentStatus) {

		return _planEnrollmentLocalService.getMemberPlanEnrollments(
			groupId, memberUserId, enrollmentStatus);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _planEnrollmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the Plan Enrollment with the primary key.
	 *
	 * @param planEnrollmentId the primary key of the Plan Enrollment
	 * @return the Plan Enrollment
	 * @throws PortalException if a Plan Enrollment with the primary key could not be found
	 */
	@Override
	public PlanEnrollment getPlanEnrollment(long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.getPlanEnrollment(planEnrollmentId);
	}

	@Override
	public int getPlanEnrollmentAndBenefitUsageCounts(
			long insurancePlanId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.
			getPlanEnrollmentAndBenefitUsageCounts(insurancePlanId, status);
	}

	@Override
	public java.util.List<Object> getPlanEnrollmentAndBenefitUsages(
			long insurancePlanId, int status, int start, int max)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.getPlanEnrollmentAndBenefitUsages(
			insurancePlanId, status, start, max);
	}

	@Override
	public PlanEnrollment getPlanEnrollmentByExternalReferenceCode(
		String externalReferenceCode) {

		return _planEnrollmentLocalService.
			getPlanEnrollmentByExternalReferenceCode(externalReferenceCode);
	}

	@Override
	public PlanEnrollment getPlanEnrollmentByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.
			getPlanEnrollmentByExternalReferenceCode(
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
	@Override
	public PlanEnrollment getPlanEnrollmentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.getPlanEnrollmentByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getPlanEnrollmentCounts(long insurancePlanId, int status) {
		return _planEnrollmentLocalService.getPlanEnrollmentCounts(
			insurancePlanId, status);
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
	@Override
	public java.util.List<PlanEnrollment> getPlanEnrollments(
		int start, int end) {

		return _planEnrollmentLocalService.getPlanEnrollments(start, end);
	}

	@Override
	public java.util.List<PlanEnrollment> getPlanEnrollments(
		long insurancePlanId, int status, int start, int max) {

		return _planEnrollmentLocalService.getPlanEnrollments(
			insurancePlanId, status, start, max);
	}

	/**
	 * Returns all the Plan Enrollments matching the UUID and company.
	 *
	 * @param uuid the UUID of the Plan Enrollments
	 * @param companyId the primary key of the company
	 * @return the matching Plan Enrollments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<PlanEnrollment> getPlanEnrollmentsByUuidAndCompanyId(
		String uuid, long companyId) {

		return _planEnrollmentLocalService.getPlanEnrollmentsByUuidAndCompanyId(
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
	@Override
	public java.util.List<PlanEnrollment> getPlanEnrollmentsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PlanEnrollment>
			orderByComparator) {

		return _planEnrollmentLocalService.getPlanEnrollmentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of Plan Enrollments.
	 *
	 * @return the number of Plan Enrollments
	 */
	@Override
	public int getPlanEnrollmentsCount() {
		return _planEnrollmentLocalService.getPlanEnrollmentsCount();
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public PlanEnrollment movePlanEnrollmentToTrash(
			long userId, long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.movePlanEnrollmentToTrash(
			userId, planEnrollmentId);
	}

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param enrollment the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public PlanEnrollment movePlanEnrollmentToTrash(
			long userId, PlanEnrollment enrollment)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.movePlanEnrollmentToTrash(
			userId, enrollment);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public PlanEnrollment restorePlanEnrollmentFromTrash(
			long userId, long planEnrollmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.restorePlanEnrollmentFromTrash(
			userId, planEnrollmentId);
	}

	@Override
	public void updateAsset(
			long userId, PlanEnrollment enrollment, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws com.liferay.portal.kernel.exception.PortalException {

		_planEnrollmentLocalService.updateAsset(
			userId, enrollment, assetCategoryIds, assetTagNames,
			assetLinkEntryIds, assetPriority);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public PlanEnrollment updatePlanEnrollment(
			long planEnrollmentId, String memberId, String groupNumber,
			java.util.Date startDate, java.util.Date endDate,
			int enrollmentStatus, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.updatePlanEnrollment(
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
	@Override
	public PlanEnrollment updatePlanEnrollment(PlanEnrollment planEnrollment) {
		return _planEnrollmentLocalService.updatePlanEnrollment(planEnrollment);
	}

	@Override
	public PlanEnrollment updateStatus(
			long userId, long planEnrollmentId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			java.util.Map<String, java.io.Serializable> workflowContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planEnrollmentLocalService.updateStatus(
			userId, planEnrollmentId, status, serviceContext, workflowContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _planEnrollmentLocalService.getBasePersistence();
	}

	@Override
	public CTPersistence<PlanEnrollment> getCTPersistence() {
		return _planEnrollmentLocalService.getCTPersistence();
	}

	@Override
	public Class<PlanEnrollment> getModelClass() {
		return _planEnrollmentLocalService.getModelClass();
	}

	@Override
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<PlanEnrollment>, R, E>
				updateUnsafeFunction)
		throws E {

		return _planEnrollmentLocalService.updateWithUnsafeFunction(
			updateUnsafeFunction);
	}

	@Override
	public PlanEnrollmentLocalService getWrappedService() {
		return _planEnrollmentLocalService;
	}

	@Override
	public void setWrappedService(
		PlanEnrollmentLocalService planEnrollmentLocalService) {

		_planEnrollmentLocalService = planEnrollmentLocalService;
	}

	private PlanEnrollmentLocalService _planEnrollmentLocalService;

}