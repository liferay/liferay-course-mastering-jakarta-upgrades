/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.security.permission.resource;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerConstants;
import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerPortletKeys;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.*;
import com.liferay.portal.util.PropsValues;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Preston Crary
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment",
	service = ModelResourcePermission.class
)
public class PlanEnrollmentModelResourcePermissionWrapper
	extends BaseModelResourcePermissionWrapper<PlanEnrollment> {

	@Override
	protected ModelResourcePermission<PlanEnrollment>
		doGetModelResourcePermission() {

		return ModelResourcePermissionFactory.create(
			PlanEnrollment.class, PlanEnrollment::getPlanEnrollmentId,
			_planEnrollmentLocalService::getPlanEnrollment, _portletResourcePermission,
			(modelResourcePermission, consumer) -> {
				consumer.accept(
					new StagedModelPermissionLogic<>(
						_stagingPermission, InsuranceBenefitsTrackerPortletKeys.IBT_ENROLLMENT_ADMIN,
						PlanEnrollment::getPlanEnrollmentId));
			});
	}

	@Reference
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

	@Reference(
		target = "(resource.name=" + InsuranceBenefitsTrackerConstants.RESOURCE_NAME + ")"
	)
	private PortletResourcePermission _portletResourcePermission;

	@Reference
	private StagingPermission _stagingPermission;

}