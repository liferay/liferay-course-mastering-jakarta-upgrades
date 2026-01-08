/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

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
 * Provides the local service interface for BenefitUsage. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsageLocalServiceUtil
 * @generated
 */
@CTAware
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface BenefitUsageLocalService
	extends BaseLocalService, CTService<BenefitUsage>,
			PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.BenefitUsageLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the benefit usage local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link BenefitUsageLocalServiceUtil} if injection and service tracking are not available.
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
	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage addBenefitUsage(BenefitUsage benefitUsage);

	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage addBenefitUsage(
			long planEnrollmentId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			ServiceContext serviceContext)
		throws PortalException;

	public void addResources(
			BenefitUsage usage, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException;

	public void addResources(
			BenefitUsage usage, ModelPermissions modelPermissions)
		throws PortalException;

	/**
	 * Creates a new benefit usage with the primary key. Does not add the benefit usage to the database.
	 *
	 * @param benefitUsageId the primary key for the new benefit usage
	 * @return the new benefit usage
	 */
	@Transactional(enabled = false)
	public BenefitUsage createBenefitUsage(long benefitUsageId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public BenefitUsage deleteBenefitUsage(BenefitUsage benefitUsage)
		throws PortalException;

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
	@Indexable(type = IndexableType.DELETE)
	public BenefitUsage deleteBenefitUsage(long benefitUsageId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * deletePlanEnrollmentBenefitUsages: Deletes all of the benefit usages associated with the
	 * given plan enrollment. Used to clean up data and not leave orphaned records.
	 *
	 * @param planEnrollmentId
	 * @throws PortalException
	 */
	public void deletePlanEnrollmentBenefitUsages(long planEnrollmentId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.BenefitUsageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.BenefitUsageModelImpl</code>.
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
	public BenefitUsage fetchBenefitUsage(long benefitUsageId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BenefitUsage fetchBenefitUsageByExternalReferenceCode(
		String externalReferenceCode, long groupId);

	/**
	 * Returns the benefit usage matching the UUID and group.
	 *
	 * @param uuid the benefit usage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching benefit usage, or <code>null</code> if a matching benefit usage could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BenefitUsage fetchBenefitUsageByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the benefit usage with the primary key.
	 *
	 * @param benefitUsageId the primary key of the benefit usage
	 * @return the benefit usage
	 * @throws PortalException if a benefit usage with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BenefitUsage getBenefitUsage(long benefitUsageId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BenefitUsage getBenefitUsageByExternalReferenceCode(
			String externalReferenceCode, long groupId)
		throws PortalException;

	/**
	 * Returns the benefit usage matching the UUID and group.
	 *
	 * @param uuid the benefit usage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching benefit usage
	 * @throws PortalException if a matching benefit usage could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BenefitUsage getBenefitUsageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BenefitUsage> getBenefitUsages(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BenefitUsage> getBenefitUsagesByPlanEnrollmentsStatus(
			List<Long> planEnrollmentIds, int status, int start, int max)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BenefitUsage> getBenefitUsagesByPlanEnrollmentStatus(
			long planEnrollmentId, int status, int start, int max)
		throws PortalException;

	/**
	 * Returns all the benefit usages matching the UUID and company.
	 *
	 * @param uuid the UUID of the benefit usages
	 * @param companyId the primary key of the company
	 * @return the matching benefit usages, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BenefitUsage> getBenefitUsagesByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BenefitUsage> getBenefitUsagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<BenefitUsage> orderByComparator);

	/**
	 * Returns the number of benefit usages.
	 *
	 * @return the number of benefit usages
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getBenefitUsagesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getBenefitUsagesCountByPlanEnrollmentsStatus(
			List<Long> planEnrollmentIds, int status)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getBenefitUsagesCountByPlanEnrollmentStatus(
			long planEnrollmentId, int status)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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
	 * @param usage the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage moveBenefitUsageToTrash(long userId, BenefitUsage usage)
		throws PortalException;

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	public BenefitUsage moveBenefitUsageToTrash(
			long userId, long benefitUsageId)
		throws PortalException;

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage restoreBenefitUsageFromTrash(
			long userId, long benefitUsageId)
		throws PortalException;

	public void updateAsset(
			long userId, BenefitUsage usage, long[] assetCategoryIds,
			String[] assetTagNames, long[] assetLinkEntryIds,
			double assetPriority)
		throws PortalException;

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
	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage updateBenefitUsage(BenefitUsage benefitUsage);

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage updateBenefitUsage(
			long benefitUsageId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			ServiceContext serviceContext)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public BenefitUsage updateStatus(
			long userId, long benefitUsageId, int status,
			ServiceContext serviceContext,
			java.util.Map<String, Serializable> workflowContext)
		throws PortalException;

	@Override
	@Transactional(enabled = false)
	public CTPersistence<BenefitUsage> getCTPersistence();

	@Override
	@Transactional(enabled = false)
	public Class<BenefitUsage> getModelClass();

	@Override
	@Transactional(rollbackFor = Throwable.class)
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<BenefitUsage>, R, E>
				updateUnsafeFunction)
		throws E;

}