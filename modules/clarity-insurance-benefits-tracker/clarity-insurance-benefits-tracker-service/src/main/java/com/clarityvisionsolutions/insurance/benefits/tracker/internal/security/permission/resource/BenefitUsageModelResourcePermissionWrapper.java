/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.security.permission.resource;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerConstants;
import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerPortletKeys;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Preston Crary
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage",
	service = ModelResourcePermission.class
)
public class BenefitUsageModelResourcePermissionWrapper
	extends BaseModelResourcePermissionWrapper<BenefitUsage> {

	@Override
	protected ModelResourcePermission<BenefitUsage>
		doGetModelResourcePermission() {

		return ModelResourcePermissionFactory.create(
			BenefitUsage.class, BenefitUsage::getBenefitUsageId,
			_benefitUsageLocalService::getBenefitUsage, _portletResourcePermission,
			(modelResourcePermission, consumer) -> {
				consumer.accept(
					new StagedModelPermissionLogic<>(
						_stagingPermission, InsuranceBenefitsTrackerPortletKeys.IBT_ENROLLMENT_ADMIN,
						BenefitUsage::getBenefitUsageId));
			});
	}

	@Reference
	private BenefitUsageLocalService _benefitUsageLocalService;

	@Reference(
		target = "(resource.name=" + InsuranceBenefitsTrackerConstants.RESOURCE_NAME + ")"
	)
	private PortletResourcePermission _portletResourcePermission;

	@Reference
	private StagingPermission _stagingPermission;

}