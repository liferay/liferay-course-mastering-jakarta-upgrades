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
 * The extended model interface for the PlanEnrollment service. Represents a row in the &quot;CIBT_PlanEnrollment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PlanEnrollmentModel
 * @generated
 */
@ImplementationClassName(
	"com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.PlanEnrollmentImpl"
)
@ProviderType
public interface PlanEnrollment extends PersistedModel, PlanEnrollmentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.clarityvisionsolutions.insurance.benefits.tracker.model.impl.PlanEnrollmentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PlanEnrollment, Long>
		PLAN_ENROLLMENT_ID_ACCESSOR = new Accessor<PlanEnrollment, Long>() {

			@Override
			public Long get(PlanEnrollment planEnrollment) {
				return planEnrollment.getPlanEnrollmentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<PlanEnrollment> getTypeClass() {
				return PlanEnrollment.class;
			}

		};

	public String getSummary();

}