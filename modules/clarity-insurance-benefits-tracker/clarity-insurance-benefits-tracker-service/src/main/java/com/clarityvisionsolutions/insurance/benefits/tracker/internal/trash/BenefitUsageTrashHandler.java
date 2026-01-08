/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.clarityvisionsolutions.insurance.benefits.tracker.internal.trash;

import com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ContainerModel;
import com.liferay.portal.kernel.model.TrashedModel;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.trash.BaseTrashHandler;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Implements trash handling for benefit usages.
 *
 * @author Zsolt Berentey
 */
@Component(
	property = "model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage",
	service = TrashHandler.class
)
public class BenefitUsageTrashHandler extends BaseTrashHandler {

	@Override
	public void deleteTrashEntry(long classPK) {
	}

	@Override
	public String getClassName() {
		return BenefitUsage.class.getName();
	}

	@Override
	public ContainerModel getContainerModel(long containerModelId)
		throws PortalException {

		return _planEnrollmentLocalService.getPlanEnrollment(containerModelId);
	}

	@Override
	public String getContainerModelClassName(long classPK) {
		return PlanEnrollment.class.getName();
	}

	@Override
	public ContainerModel getParentContainerModel(TrashedModel trashedModel)
		throws PortalException {

		BenefitUsage usage = (BenefitUsage)trashedModel;

		return getContainerModel(usage.getPlanEnrollmentId());
	}

	@Override
	public TrashedModel getTrashedModel(long classPK) {
		return _benefitUsageLocalService.fetchBenefitUsage(classPK);
	}

	@Override
	public boolean isDeletable(long classPK) throws PortalException {
		return true;
	}

	@Override
	public void restoreTrashEntry(long userId, long classPK) {
        try {
            _benefitUsageLocalService.restoreBenefitUsageFromTrash(userId, classPK);
        } catch (PortalException e) {
            _log.error("Error restoring benefit usage id " + classPK, e);
        }
    }

	@Override
	protected boolean hasPermission(
			PermissionChecker permissionChecker, long classPK, String actionId)
		throws PortalException {

		return _benefitUsageModelResourcePermission.contains(
			permissionChecker, classPK, actionId);
	}

	@Reference
	private BenefitUsageLocalService _benefitUsageLocalService;

	@Reference
	private BenefitUsageService _benefitUsageService;

	@Reference
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

	@Reference(
		target = "(model.class.name=com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage)"
	)
	private ModelResourcePermission<BenefitUsage> _benefitUsageModelResourcePermission;

	private static final Log _log = LogFactoryUtil.getLog(BenefitUsageTrashHandler.class);
}