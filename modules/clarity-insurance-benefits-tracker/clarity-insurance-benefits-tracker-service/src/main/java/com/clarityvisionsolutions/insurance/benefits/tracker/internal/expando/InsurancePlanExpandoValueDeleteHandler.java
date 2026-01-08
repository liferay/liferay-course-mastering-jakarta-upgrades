/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.expando;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.liferay.expando.kernel.util.ExpandoValueDeleteHandler;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

/**
 * @author Máté Thurzó
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan",
	service = ExpandoValueDeleteHandler.class
)
public class InsurancePlanExpandoValueDeleteHandler
	implements ExpandoValueDeleteHandler {

	@Override
	public void deletedExpandoValue(long classPK) {
		InsurancePlan entry = _insurancePlanLocalService.fetchInsurancePlan(
			classPK);

		if (entry == null) {
			return;
		}

		entry.setModifiedDate(new Date());

		_insurancePlanLocalService.updateInsurancePlan(entry);
	}

	@Reference
	private InsurancePlanLocalService _insurancePlanLocalService;

}