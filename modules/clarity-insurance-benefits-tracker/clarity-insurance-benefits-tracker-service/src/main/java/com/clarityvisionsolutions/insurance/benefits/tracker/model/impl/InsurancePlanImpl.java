/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model.impl;

/**
 * @author Brian Wing Shun Chan
 */
public class InsurancePlanImpl extends InsurancePlanBaseImpl {

    public String getSummary() {
        return getPlanName() + " From " + getProviderName();
    }
}