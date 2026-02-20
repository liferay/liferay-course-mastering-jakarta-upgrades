/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.change.tracking.CTAware;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.change.tracking.CTService;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.*;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for PlanEnrollment. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentLocalServiceUtil
 * @generated
 */
@CTAware
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PlanEnrollmentLocalService
	extends BaseLocalService, CTService<PlanEnrollment>,
			PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.PlanEnrollmentLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the Plan Enrollment local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link PlanEnrollmentLocalServiceUtil} if injection and service tracking are not available.
	 */
	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment addPlanEnrollment(
			long insurancePlanId, long memberUserId, String memberId,
			String groupNumber, java.util.Date startDate,
			java.util.Date endDate, int enrollmentStatus, String notes,
			ServiceContext serviceContext)
		throws PortalException;

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
	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment addPlanEnrollment(PlanEnrollment planEnrollment);

	public void addResources(
			PlanEnrollment enrollment, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException;

	public void addResources(
			PlanEnrollment enrollment, ModelPermissions modelPermissions)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new Plan Enrollment with the primary key. Does not add the Plan Enrollment to the database.
	 *
	 * @param planEnrollmentId the primary key for the new Plan Enrollment
	 * @return the new Plan Enrollment
	 */
	@Transactional(enabled = false)
	public PlanEnrollment createPlanEnrollment(long planEnrollmentId);

	/**
	 * deleteInsurancePlanEnrollments: Called when an insurance plan is getting deleted so we can
	 * prevent orphaned data from getting into the system.
	 *
	 * @param insurancePlanId
	 * @throws PortalException
	 */
	public void deleteInsurancePlanEnrollments(long insurancePlanId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public PlanEnrollment deletePlanEnrollment(long planEnrollmentId)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public PlanEnrollment deletePlanEnrollment(PlanEnrollment planEnrollment)
		throws PortalException;

	public void deleteUserPlanEnrollments(long memberUserId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment fetchPlanEnrollment(long planEnrollmentId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment fetchPlanEnrollmentByExternalReferenceCode(
		String externalReferenceCode, long groupId);

	/**
	 * Returns the Plan Enrollment matching the UUID and group.
	 *
	 * @param uuid the Plan Enrollment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Plan Enrollment, or <code>null</code> if a matching Plan Enrollment could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment fetchPlanEnrollmentByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * getActiveGroupEnrollments: Returns all of the active enrollments for the given group.
	 *
	 * @param groupId Group to get the enrollments for.
	 * @return The list of enrollments.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getActiveGroupEnrollments(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getMemberPlanEnrollments(
		long groupId, long memberUserId, int enrollmentStatus);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the Plan Enrollment with the primary key.
	 *
	 * @param planEnrollmentId the primary key of the Plan Enrollment
	 * @return the Plan Enrollment
	 * @throws PortalException if a Plan Enrollment with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment getPlanEnrollment(long planEnrollmentId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPlanEnrollmentAndBenefitUsageCounts(
			long insurancePlanId, int status)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Object> getPlanEnrollmentAndBenefitUsages(
			long insurancePlanId, int status, int start, int max)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment getPlanEnrollmentByExternalReferenceCode(
		String externalReferenceCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment getPlanEnrollmentByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws PortalException;

	/**
	 * Returns the Plan Enrollment matching the UUID and group.
	 *
	 * @param uuid the Plan Enrollment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Plan Enrollment
	 * @throws PortalException if a matching Plan Enrollment could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PlanEnrollment getPlanEnrollmentByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPlanEnrollmentCounts(long insurancePlanId, int status);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getPlanEnrollments(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getPlanEnrollments(
		long insurancePlanId, int status, int start, int max);

	/**
	 * Returns all the Plan Enrollments matching the UUID and company.
	 *
	 * @param uuid the UUID of the Plan Enrollments
	 * @param companyId the primary key of the company
	 * @return the matching Plan Enrollments, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getPlanEnrollmentsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PlanEnrollment> getPlanEnrollmentsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PlanEnrollment> orderByComparator);

	/**
	 * Returns the number of Plan Enrollments.
	 *
	 * @return the number of Plan Enrollments
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPlanEnrollmentsCount();

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public PlanEnrollment movePlanEnrollmentToTrash(
			long userId, long planEnrollmentId)
		throws PortalException;

	/**
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param enrollment the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment movePlanEnrollmentToTrash(
			long userId, PlanEnrollment enrollment)
		throws PortalException;

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param planEnrollmentId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment restorePlanEnrollmentFromTrash(
			long userId, long planEnrollmentId)
		throws PortalException;

	public void updateAsset(
			long userId, PlanEnrollment enrollment, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws PortalException;

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment updatePlanEnrollment(
			long planEnrollmentId, String memberId, String groupNumber,
			java.util.Date startDate, java.util.Date endDate,
			int enrollmentStatus, String notes, ServiceContext serviceContext)
		throws PortalException;

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
	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment updatePlanEnrollment(PlanEnrollment planEnrollment);

	@Indexable(type = IndexableType.REINDEX)
	public PlanEnrollment updateStatus(
			long userId, long planEnrollmentId, int status,
			ServiceContext serviceContext,
			java.util.Map<String, Serializable> workflowContext)
		throws PortalException;

	@Override
	@Transactional(enabled = false)
	public CTPersistence<PlanEnrollment> getCTPersistence();

	@Override
	@Transactional(enabled = false)
	public Class<PlanEnrollment> getModelClass();

	@Override
	@Transactional(rollbackFor = Throwable.class)
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<PlanEnrollment>, R, E>
				updateUnsafeFunction)
		throws E;

}