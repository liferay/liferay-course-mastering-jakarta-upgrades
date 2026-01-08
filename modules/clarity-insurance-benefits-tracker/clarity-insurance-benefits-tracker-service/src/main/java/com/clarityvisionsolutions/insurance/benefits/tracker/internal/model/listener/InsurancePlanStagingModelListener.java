/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.model.listener;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.staging.model.listener.StagingModelListener;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Akos Thurzo
 */
@Component(service = ModelListener.class)
public class InsurancePlanStagingModelListener
	extends BaseModelListener<InsurancePlan> {

	@Override
	public void onAfterCreate(InsurancePlan insurancePlan)
		throws ModelListenerException {

		_stagingModelListener.onAfterCreate(insurancePlan);
	}

	@Override
	public void onAfterRemove(InsurancePlan insurancePlan)
		throws ModelListenerException {

		_stagingModelListener.onAfterRemove(insurancePlan);
	}

	@Override
	public void onAfterUpdate(
			InsurancePlan originalInsurancePlan,
			InsurancePlan insurancePlan)
		throws ModelListenerException {

		_stagingModelListener.onAfterUpdate(insurancePlan);
	}

	@Reference
	private StagingModelListener<InsurancePlan> _stagingModelListener;

}