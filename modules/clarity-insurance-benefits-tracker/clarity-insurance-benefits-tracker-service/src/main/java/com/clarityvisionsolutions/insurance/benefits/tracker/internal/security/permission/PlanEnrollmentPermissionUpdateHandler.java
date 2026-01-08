/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.security.permission;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.liferay.portal.kernel.security.permission.PermissionUpdateHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

/**
 * @author Gergely Mathe
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment",
	service = PermissionUpdateHandler.class
)
public class PlanEnrollmentPermissionUpdateHandler
	implements PermissionUpdateHandler {

	@Override
	public void updatedPermission(String primKey) {
		PlanEnrollment planEnrollment =
			_planEnrollmentLocalService.fetchPlanEnrollment(
				GetterUtil.getLong(primKey));

		if (planEnrollment == null) {
			return;
		}

		planEnrollment.setModifiedDate(new Date());

		_planEnrollmentLocalService.updatePlanEnrollment(planEnrollment);
	}

	@Reference
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

}