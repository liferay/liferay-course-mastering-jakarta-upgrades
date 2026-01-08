/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InsurancePlanService}.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanService
 * @generated
 */
public class InsurancePlanServiceWrapper
	implements InsurancePlanService, ServiceWrapper<InsurancePlanService> {

	public InsurancePlanServiceWrapper() {
		this(null);
	}

	public InsurancePlanServiceWrapper(
		InsurancePlanService insurancePlanService) {

		_insurancePlanService = insurancePlanService;
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

		return _insurancePlanService.addInsurancePlan(
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

		return _insurancePlanService.addInsurancePlan(
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

		return _insurancePlanService.addInsurancePlan(
			providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, serviceContext);
	}

	@Override
	public InsurancePlan deleteInsurancePlan(long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanService.deleteInsurancePlan(insurancePlanId);
	}

	@Override
	public java.util.List<InsurancePlan> getGroupInsurancePlans(
		long groupId, int status, int start, int end) {

		return _insurancePlanService.getGroupInsurancePlans(
			groupId, status, start, end);
	}

	@Override
	public int getGroupInsurancePlansCount(long groupId, int status) {
		return _insurancePlanService.getGroupInsurancePlansCount(
			groupId, status);
	}

	@Override
	public InsurancePlan getInsurancePlan(long insurancePlanId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanService.getInsurancePlan(insurancePlanId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _insurancePlanService.getOSGiServiceIdentifier();
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

		return _insurancePlanService.moveInsurancePlanToTrash(
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

		return _insurancePlanService.restoreInsurancePlanFromTrash(
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
	@Override
	public InsurancePlan updateInsurancePlan(
			long insurancePlanId, String providerName, String planName,
			boolean active, long annualExamAllowanceCents,
			long annualFramesAllowanceCents, long annualLensesAllowanceCents,
			long annualContactsAllowanceCents, int coveragePeriodMonths,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _insurancePlanService.updateInsurancePlan(
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

		return _insurancePlanService.updateInsurancePlan(
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

		return _insurancePlanService.updateInsurancePlan(
			insurancePlanId, providerName, planName, annualExamAllowanceCents,
			annualFramesAllowanceCents, annualLensesAllowanceCents,
			annualContactsAllowanceCents, serviceContext);
	}

	@Override
	public InsurancePlanService getWrappedService() {
		return _insurancePlanService;
	}

	@Override
	public void setWrappedService(InsurancePlanService insurancePlanService) {
		_insurancePlanService = insurancePlanService;
	}

	private InsurancePlanService _insurancePlanService;

}