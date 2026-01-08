/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the InsurancePlan service. Represents a row in the &quot;CIBT_InsurancePlan&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see InsurancePlanModel
 * @generated
 */
@ImplementationClassName(
	"com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanImpl"
)
@ProviderType
public interface InsurancePlan extends InsurancePlanModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.InsurancePlanImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<InsurancePlan, Long>
		INSURANCE_PLAN_ID_ACCESSOR = new Accessor<InsurancePlan, Long>() {

			@Override
			public Long get(InsurancePlan insurancePlan) {
				return insurancePlan.getInsurancePlanId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<InsurancePlan> getTypeClass() {
				return InsurancePlan.class;
			}

		};

	public String getSummary();

}