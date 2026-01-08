/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.service;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BenefitUsageService}.
 *
 * @author Brian Wing Shun Chan
 * @see BenefitUsageService
 * @generated
 */
public class BenefitUsageServiceWrapper
	implements BenefitUsageService, ServiceWrapper<BenefitUsageService> {

	public BenefitUsageServiceWrapper() {
		this(null);
	}

	public BenefitUsageServiceWrapper(BenefitUsageService benefitUsageService) {
		_benefitUsageService = benefitUsageService;
	}

	@Override
	public BenefitUsage addBenefitUsage(
			long planEnrollmentId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.addBenefitUsage(
			planEnrollmentId, benefitType, amountUsedCents, serviceDate,
			reference, notes, sourceType, sourceReference, serviceContext);
	}

	@Override
	public BenefitUsage deleteBenefitUsage(long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.deleteBenefitUsage(benefitUsageId);
	}

	@Override
	public BenefitUsage getBenefitUsage(long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.getBenefitUsage(benefitUsageId);
	}

	@Override
	public java.util.List<BenefitUsage> getGroupPlanEnrollmentBenefitUsages(
			long groupId, long planEnrollmentId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.getGroupPlanEnrollmentBenefitUsages(
			groupId, planEnrollmentId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _benefitUsageService.getOSGiServiceIdentifier();
	}

	/**
	 * Moves the insurance plan with the ID to the recycle bin.
	 *
	 * @param userId the primary key of the user moving the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be moved
	 * @return the moved insurance plan
	 */
	@Override
	public BenefitUsage moveBenefitUsageToTrash(
			long userId, long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.moveBenefitUsageToTrash(
			userId, benefitUsageId);
	}

	/**
	 * Restores the insurance plan with the ID from the recycle bin.
	 *
	 * @param userId the primary key of the user restoring the insurance plan
	 * @param benefitUsageId the primary key of the insurance plan to be restored
	 * @return the restored insurance plan from the recycle bin
	 */
	@Override
	public BenefitUsage restoreBenefitUsageFromTrash(
			long userId, long benefitUsageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.restoreBenefitUsageFromTrash(
			userId, benefitUsageId);
	}

	/**
	 * Adds a new insurance plan with the specified coverage period.
	 *
	 * @param serviceContext
	 * @return the new insurance plan
	 */
	@Override
	public BenefitUsage updateBenefitUsage(
			long benefitUsageId, String benefitType, long amountUsedCents,
			java.util.Date serviceDate, String reference, String notes,
			String sourceType, String sourceReference,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _benefitUsageService.updateBenefitUsage(
			benefitUsageId, benefitType, amountUsedCents, serviceDate,
			reference, notes, sourceType, sourceReference, serviceContext);
	}

	@Override
	public BenefitUsageService getWrappedService() {
		return _benefitUsageService;
	}

	@Override
	public void setWrappedService(BenefitUsageService benefitUsageService) {
		_benefitUsageService = benefitUsageService;
	}

	private BenefitUsageService _benefitUsageService;

}