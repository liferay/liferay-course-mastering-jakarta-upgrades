/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.change.tracking.spi.reference;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlanTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollmentTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.PlanEnrollmentPersistence;
import com.liferay.change.tracking.spi.reference.TableReferenceDefinition;
import com.liferay.change.tracking.spi.reference.builder.ChildTableReferenceInfoBuilder;
import com.liferay.change.tracking.spi.reference.builder.ParentTableReferenceInfoBuilder;
import com.liferay.portal.kernel.model.UserTable;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brooke Dalton
 */
@Component(service = TableReferenceDefinition.class)
public class PlanEnrollmentTableReferenceDefinition
	implements TableReferenceDefinition<PlanEnrollmentTable> {

	@Override
	public void defineChildTableReferences(
		ChildTableReferenceInfoBuilder<PlanEnrollmentTable>
			childTableReferenceInfoBuilder) {

		childTableReferenceInfoBuilder.assetEntryReference(
			PlanEnrollmentTable.INSTANCE.planEnrollmentId, PlanEnrollment.class
		).resourcePermissionReference(
			PlanEnrollmentTable.INSTANCE.planEnrollmentId, PlanEnrollment.class
		);
	}

	@Override
	public void defineParentTableReferences(
		ParentTableReferenceInfoBuilder<PlanEnrollmentTable>
			parentTableReferenceInfoBuilder) {

		parentTableReferenceInfoBuilder.groupedModel(
			PlanEnrollmentTable.INSTANCE
		).singleColumnReference(
			PlanEnrollmentTable.INSTANCE.insurancePlanId, InsurancePlanTable.INSTANCE.insurancePlanId
		).singleColumnReference(PlanEnrollmentTable.INSTANCE.memberUserId, UserTable.INSTANCE.userId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _planEnrollmentPersistence;
	}

	@Override
	public PlanEnrollmentTable getTable() {
		return PlanEnrollmentTable.INSTANCE;
	}

	@Reference
	private PlanEnrollmentPersistence _planEnrollmentPersistence;

}