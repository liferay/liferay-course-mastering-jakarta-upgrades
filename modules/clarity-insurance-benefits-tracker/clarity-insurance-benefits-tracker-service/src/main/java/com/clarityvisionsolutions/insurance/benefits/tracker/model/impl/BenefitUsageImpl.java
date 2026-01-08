/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model.impl;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalServiceUtil;

import java.text.SimpleDateFormat;

/**
 * @author Brian Wing Shun Chan
 */
public class BenefitUsageImpl extends BenefitUsageBaseImpl {

    public String getSummary() {
        PlanEnrollment enrollment = PlanEnrollmentLocalServiceUtil.fetchPlanEnrollment(getPlanEnrollmentId());

        if (enrollment == null) {
            return "Benefit Usage: $" + (getAmountUsedCents() / 100.0)
                    + " on " + SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT).format(getServiceDate());
        }

        return enrollment.getMemberUserName() + " Usage: $" + (getAmountUsedCents() / 100.0)
                + " on " + SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT).format(getServiceDate());
    }
}