/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class PlanEnrollmentImpl extends PlanEnrollmentBaseImpl {

    public String getSummary() {
        InsurancePlan insurancePlan = InsurancePlanLocalServiceUtil.fetchInsurancePlan(getInsurancePlanId());

        if (insurancePlan == null) {
            return "Plan for " + getMemberUserName();
        }

        return insurancePlan.getPlanName() + " For " + getMemberUserName();
    }
}