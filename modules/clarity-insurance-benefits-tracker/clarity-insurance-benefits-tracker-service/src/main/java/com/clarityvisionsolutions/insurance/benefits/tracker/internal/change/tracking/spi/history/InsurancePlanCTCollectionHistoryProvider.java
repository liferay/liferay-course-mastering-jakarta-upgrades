/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR
 * LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.change.tracking.spi.history;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlanTable;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.liferay.change.tracking.model.CTCollection;
import com.liferay.change.tracking.model.CTCollectionTable;
import com.liferay.change.tracking.model.CTEntry;
import com.liferay.change.tracking.model.CTEntryTable;
import com.liferay.change.tracking.service.CTCollectionLocalService;
import com.liferay.change.tracking.service.CTEntryLocalService;
import com.liferay.change.tracking.spi.history.CTCollectionHistoryProvider;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.portal.kernel.change.tracking.CTCollectionThreadLocal;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.vulcan.util.SearchUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

/**
 * @author Cheryl Tang
 */
@Component(service = CTCollectionHistoryProvider.class)
public class InsurancePlanCTCollectionHistoryProvider
	implements CTCollectionHistoryProvider<InsurancePlan> {

	@Override
	public List<CTCollection> getCTCollections(long classNameId, long classPK)
		throws PortalException {

		InsurancePlan insurancePlan = _insurancePlanLocalService.getInsurancePlan(classPK);

		return _ctCollectionLocalService.dslQuery(
			DSLQueryFactoryUtil.select(
				CTCollectionTable.INSTANCE
			).from(
				CTCollectionTable.INSTANCE
			).innerJoinON(
				CTEntryTable.INSTANCE,
				CTEntryTable.INSTANCE.ctCollectionId.eq(
					CTCollectionTable.INSTANCE.ctCollectionId
				).and(
					CTEntryTable.INSTANCE.modelClassNameId.eq(
						classNameId
					).and(
						CTEntryTable.INSTANCE.modelClassPK.in(
							DSLQueryFactoryUtil.select(
								InsurancePlanTable.INSTANCE.insurancePlanId
							).from(
								InsurancePlanTable.INSTANCE
							).where(
								InsurancePlanTable.INSTANCE.insurancePlanId.eq(
									insurancePlan.getInsurancePlanId())
							))
					)
				)
			).where(
				CTCollectionTable.INSTANCE.ctCollectionId.neq(
					CTCollectionThreadLocal.getCTCollectionId()
				).and(
					CTCollectionTable.INSTANCE.status.neq(
						WorkflowConstants.STATUS_EXPIRED)
				)
			).orderBy(
				CTCollectionTable.INSTANCE.status.descending(),
				CTCollectionTable.INSTANCE.statusDate.descending()
			));
	}

	@Override
	public CTEntry getCTEntry(
		long ctCollectionId, long modelClassNameId, long modelClassPK) {

		List<Long> resourcePrimKey = _ctEntryLocalService.dslQuery(
			DSLQueryFactoryUtil.select(
				InsurancePlanTable.INSTANCE.insurancePlanId
			).from(
				InsurancePlanTable.INSTANCE
			).where(
				InsurancePlanTable.INSTANCE.insurancePlanId.eq(modelClassPK)
			));

		if (resourcePrimKey.isEmpty()) {
			return null;
		}

		List<Long> insurancePlanIds = _ctEntryLocalService.dslQuery(
			DSLQueryFactoryUtil.select(
				InsurancePlanTable.INSTANCE.insurancePlanId
			).from(
				InsurancePlanTable.INSTANCE
			).where(
				InsurancePlanTable.INSTANCE.insurancePlanId.eq(
					resourcePrimKey.get(0)
				).and(
					InsurancePlanTable.INSTANCE.ctCollectionId.eq(ctCollectionId)
				)
			).orderBy(
				InsurancePlanTable.INSTANCE.modifiedDate.descending()
			));

		if (insurancePlanIds.isEmpty()) {
			return null;
		}

		return _ctEntryLocalService.fetchCTEntry(
			ctCollectionId, modelClassNameId, insurancePlanIds.get(0));
	}

	@Override
	public Class<InsurancePlan> getModelClass() {
		return InsurancePlan.class;
	}

	@Override
	public UnsafeConsumer<SearchUtil.SearchContext, Exception>
		getSearchContextUnsafeConsumer(long classNameId, long classPK) {

		InsurancePlan insurancePlan = _insurancePlanLocalService.fetchInsurancePlan(classPK);

		return searchContext -> {
			searchContext.setAttribute(
				"modelClassNameId", new Long[] {classNameId});

			if (insurancePlan == null) {
				if (classPK > 0) {
					searchContext.setAttribute(
						"modelClassPK", new Long[] {classPK});
				}

				return;
			}

			List<Long> modelClassPKs = _ctCollectionLocalService.dslQuery(
				DSLQueryFactoryUtil.select(
					CTEntryTable.INSTANCE.modelClassPK
				).from(
					CTEntryTable.INSTANCE
				).where(
					CTEntryTable.INSTANCE.modelClassPK.in(
						DSLQueryFactoryUtil.select(
							InsurancePlanTable.INSTANCE.insurancePlanId
						).from(
							InsurancePlanTable.INSTANCE
						).where(
							InsurancePlanTable.INSTANCE.insurancePlanId.eq(
								insurancePlan.getInsurancePlanId())
						))
				));

			searchContext.setAttribute(
				"modelClassPK", ArrayUtil.toLongArray(modelClassPKs));
		};
	}

	@Reference
	private CTCollectionLocalService _ctCollectionLocalService;

	@Reference
	private CTEntryLocalService _ctEntryLocalService;

	@Reference
	private InsurancePlanLocalService _insurancePlanLocalService;

}