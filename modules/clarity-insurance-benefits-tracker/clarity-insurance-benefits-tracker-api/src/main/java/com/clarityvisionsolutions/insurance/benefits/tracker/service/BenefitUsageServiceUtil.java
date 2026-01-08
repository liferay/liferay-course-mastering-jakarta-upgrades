/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for BenefitUsage. This utility wraps
 * <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.BenefitUsageServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsageService
 * @generated
 */
public class BenefitUsageServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.BenefitUsageServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
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

	public static BenefitUsage deleteBenefitUsage(long benefitUsageId)
		throws PortalException {

		return getService().deleteBenefitUsage(benefitUsageId);
	}

	public static BenefitUsage getBenefitUsage(long benefitUsageId)
		throws PortalException {

		return getService().getBenefitUsage(benefitUsageId);
	}

	public static List<BenefitUsage> getGroupPlanEnrollmentBenefitUsages(
			long groupId, long planEnrollmentId, int status)
		throws PortalException {

		return getService().getGroupPlanEnrollmentBenefitUsages(
			groupId, planEnrollmentId, status);
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

	public static BenefitUsageService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BenefitUsageService> _serviceSnapshot =
		new Snapshot<>(
			BenefitUsageServiceUtil.class, BenefitUsageService.class);

}