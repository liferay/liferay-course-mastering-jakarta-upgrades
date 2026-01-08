/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.change.tracking.spi.reference;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsageTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollmentTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.persistence.BenefitUsagePersistence;
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
public class BenefitUsageTableReferenceDefinition
		implements TableReferenceDefinition<BenefitUsageTable> {

	@Override
	public void defineChildTableReferences(
			ChildTableReferenceInfoBuilder<BenefitUsageTable>
					childTableReferenceInfoBuilder) {

		childTableReferenceInfoBuilder.assetEntryReference(
				BenefitUsageTable.INSTANCE.benefitUsageId, BenefitUsage.class
		).resourcePermissionReference(
				BenefitUsageTable.INSTANCE.benefitUsageId, BenefitUsage.class
		);
	}

	@Override
	public void defineParentTableReferences(
			ParentTableReferenceInfoBuilder<BenefitUsageTable>
					parentTableReferenceInfoBuilder) {

		parentTableReferenceInfoBuilder.groupedModel(
				BenefitUsageTable.INSTANCE
		).singleColumnReference(
				BenefitUsageTable.INSTANCE.planEnrollmentId,
				PlanEnrollmentTable.INSTANCE.planEnrollmentId
		);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _benefitUsagePersistence;
	}

	@Override
	public BenefitUsageTable getTable() {
		return BenefitUsageTable.INSTANCE;
	}

	@Reference
	private BenefitUsagePersistence _benefitUsagePersistence;
}