/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.change.tracking.spi.reference;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlanTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollmentTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.InsurancePlanPersistence;
import com.liferay.change.tracking.spi.reference.TableReferenceDefinition;
import com.liferay.change.tracking.spi.reference.builder.ChildTableReferenceInfoBuilder;
import com.liferay.change.tracking.spi.reference.builder.ParentTableReferenceInfoBuilder;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brooke Dalton
 */
@Component(service = TableReferenceDefinition.class)
public class InsurancePlanTableReferenceDefinition
	implements TableReferenceDefinition<InsurancePlanTable> {

	@Override
	public void defineChildTableReferences(
		ChildTableReferenceInfoBuilder<InsurancePlanTable>
			childTableReferenceInfoBuilder) {

		childTableReferenceInfoBuilder.assetEntryReference(
			InsurancePlanTable.INSTANCE.insurancePlanId, InsurancePlan.class
		).resourcePermissionReference(
			InsurancePlanTable.INSTANCE.insurancePlanId, InsurancePlan.class
		);
	}

	@Override
	public void defineParentTableReferences(
		ParentTableReferenceInfoBuilder<InsurancePlanTable>
			parentTableReferenceInfoBuilder) {
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _insurancePlanPersistence;
	}

	@Override
	public InsurancePlanTable getTable() {
		return InsurancePlanTable.INSTANCE;
	}

	@Reference
	private InsurancePlanPersistence _insurancePlanPersistence;

}