/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.expando;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.liferay.expando.kernel.util.ExpandoValueDeleteHandler;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

/**
 * @author Máté Thurzó
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment",
	service = ExpandoValueDeleteHandler.class
)
public class PlanEnrollmentExpandoValueDeleteHandler
	implements ExpandoValueDeleteHandler {

	@Override
	public void deletedExpandoValue(long classPK) {
		PlanEnrollment entry = _planEnrollmentLocalService.fetchPlanEnrollment(
			classPK);

		if (entry == null) {
			return;
		}

		entry.setModifiedDate(new Date());

		_planEnrollmentLocalService.updatePlanEnrollment(entry);
	}

	@Reference
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

}