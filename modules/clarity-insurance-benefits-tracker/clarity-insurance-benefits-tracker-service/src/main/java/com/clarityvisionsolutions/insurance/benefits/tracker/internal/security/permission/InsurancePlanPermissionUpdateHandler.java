/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.security.permission;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.liferay.portal.kernel.security.permission.PermissionUpdateHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

/**
 * @author Gergely Mathe
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan",
	service = PermissionUpdateHandler.class
)
public class InsurancePlanPermissionUpdateHandler
	implements PermissionUpdateHandler {

	@Override
	public void updatedPermission(String primKey) {
		InsurancePlan insurancePlan =
			_insurancePlanLocalService.fetchInsurancePlan(
				GetterUtil.getLong(primKey));

		if (insurancePlan == null) {
			return;
		}

		insurancePlan.setModifiedDate(new Date());

		_insurancePlanLocalService.updateInsurancePlan(insurancePlan);
	}

	@Reference
	private InsurancePlanLocalService _insurancePlanLocalService;

}