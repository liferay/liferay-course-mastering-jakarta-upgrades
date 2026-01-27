/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.change.tracking.CTAware;
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
 * Provides the local service interface for InsurancePlan. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanLocalServiceUtil
 * @generated
 */
@CTAware
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface InsurancePlanLocalService
	extends BaseLocalService, CTService<InsurancePlan>,
			PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.InsurancePlanLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the Insurance Plan local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link InsurancePlanLocalServiceUtil} if injection and service tracking are not available.
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
	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan addInsurancePlan(InsurancePlan insurancePlan);

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
	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan addInsurancePlan(
			String providerName, String planName, boolean active,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			int coveragePeriodMonths, ServiceContext serviceContext)
		throws PortalException;

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
	public InsurancePlan addInsurancePlan(
			String providerName, String planName, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			ServiceContext serviceContext)
		throws PortalException;

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
	public InsurancePlan addInsurancePlan(
			String providerName, String planName, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, ServiceContext serviceContext)
		throws PortalException;

	public void addResources(
			InsurancePlan insurancePlan, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException;

	public void addResources(
			InsurancePlan insurancePlan, ModelPermissions modelPermissions)
		throws PortalException;

	/**
	 * Creates a new Insurance Plan with the primary key. Does not add the Insurance Plan to the database.
	 *
	 * @param insurancePlanId the primary key for the new Insurance Plan
	 * @return the new Insurance Plan
	 */
	@Transactional(enabled = false)
	public InsurancePlan createInsurancePlan(long insurancePlanId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * deleteGroupInsurancePlans: Deletes all insurance plans in the group, called by the group
	 * model listener to clean up any data when the group is being deleted.
	 *
	 * @param groupId
	 * @throws PortalException
	 */
	public void deleteGroupInsurancePlans(long groupId) throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public InsurancePlan deleteInsurancePlan(InsurancePlan insurancePlan)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public InsurancePlan deleteInsurancePlan(long insurancePlanId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanModelImpl</code>.
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
	public InsurancePlan fetchInsurancePlan(long insurancePlanId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public InsurancePlan fetchInsurancePlanByExternalReferenceCode(
		String externalReferenceCode, long groupId);

	/**
	 * Returns the Insurance Plan matching the UUID and group.
	 *
	 * @param uuid the Insurance Plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Insurance Plan, or <code>null</code> if a matching Insurance Plan could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public InsurancePlan fetchInsurancePlanByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the Insurance Plan with the primary key.
	 *
	 * @param insurancePlanId the primary key of the Insurance Plan
	 * @return the Insurance Plan
	 * @throws PortalException if a Insurance Plan with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public InsurancePlan getInsurancePlan(long insurancePlanId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public InsurancePlan getInsurancePlanByExternalReferenceCode(
		String externalReferenceCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public InsurancePlan getInsurancePlanByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws PortalException;

	/**
	 * Returns the Insurance Plan matching the UUID and group.
	 *
	 * @param uuid the Insurance Plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching Insurance Plan
	 * @throws PortalException if a matching Insurance Plan could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public InsurancePlan getInsurancePlanByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<InsurancePlan> getInsurancePlans(int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<InsurancePlan> getInsurancePlans(
			long groupId, int status, int start, int end)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<InsurancePlan> getInsurancePlansByGroup(
			long groupId, int start, int max)
		throws PortalException;

	/**
	 * Returns all the Insurance Plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the Insurance Plans
	 * @param companyId the primary key of the company
	 * @return the matching Insurance Plans, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<InsurancePlan> getInsurancePlansByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<InsurancePlan> getInsurancePlansByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<InsurancePlan> orderByComparator);

	/**
	 * Returns the number of Insurance Plans.
	 *
	 * @return the number of Insurance Plans
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getInsurancePlansCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getInsurancePlansCount(long groupId, int status)
		throws PortalException;

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
	 * Moves the insurance plan to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param insurancePlan the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan moveInsurancePlanToTrash(
			long userId, InsurancePlan insurancePlan)
		throws PortalException;

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param insurancePlanId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public InsurancePlan moveInsurancePlanToTrash(
			long userId, long insurancePlanId)
		throws PortalException;

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param insurancePlanId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan restoreInsurancePlanFromTrash(
			long userId, long insurancePlanId)
		throws PortalException;

	public void updateAsset(
			long userId, InsurancePlan insurancePlan, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws PortalException;

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
	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan updateInsurancePlan(InsurancePlan insurancePlan);

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
	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			boolean active, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			ServiceContext serviceContext)
		throws PortalException;

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
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			int coveragePeriodMonths, ServiceContext serviceContext)
		throws PortalException;

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
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			long annualExamAllowanceCents, long annualFramesAllowanceCents,
			long annualLensesAllowanceCents, long annualContactsAllowanceCents,
			ServiceContext serviceContext)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public InsurancePlan updateStatus(
			long userId, long insurancePlanId, int status,
			ServiceContext serviceContext,
			java.util.Map<String, Serializable> workflowContext)
		throws PortalException;

	@Override
	@Transactional(enabled = false)
	public CTPersistence<InsurancePlan> getCTPersistence();

	@Override
	@Transactional(enabled = false)
	public Class<InsurancePlan> getModelClass();

	@Override
	@Transactional(rollbackFor = Throwable.class)
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<InsurancePlan>, R, E>
				updateUnsafeFunction)
		throws E;

}