/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for InsurancePlan. This utility wraps
 * <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.InsurancePlanServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanService
 * @generated
 */
public class InsurancePlanServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.service.impl.InsurancePlanServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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

	public static InsurancePlan deleteInsurancePlan(long insurancePlanId)
		throws PortalException {

		return getService().deleteInsurancePlan(insurancePlanId);
	}

	public static List<InsurancePlan> getGroupInsurancePlans(
		long groupId, int status, int start, int end) {

		return getService().getGroupInsurancePlans(groupId, status, start, end);
	}

	public static int getGroupInsurancePlansCount(long groupId, int status) {
		return getService().getGroupInsurancePlansCount(groupId, status);
	}

	public static InsurancePlan getInsurancePlan(long insurancePlanId)
		throws PortalException {

		return getService().getInsurancePlan(insurancePlanId);
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

	public static InsurancePlanService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<InsurancePlanService> _serviceSnapshot =
		new Snapshot<>(
			InsurancePlanServiceUtil.class, InsurancePlanService.class);

}