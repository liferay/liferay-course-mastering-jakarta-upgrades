package com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.resource.v1_0;

import com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.dto.v1_0.converter.BenefitUsageDTOConverter;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.odata.entity.v1_0.BenefitUsageEntityModel;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.resource.v1_0.BenefitUsageResource;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.dto.v1_0.*;

import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.BenefitUsageService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentService;
import com.liferay.headless.common.spi.service.context.ServiceContextBuilder;
import com.liferay.portal.kernel.exception.DuplicateExternalReferenceCodeException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.LocalDateTimeUtil;
import com.liferay.portal.vulcan.util.SearchUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

/**
 * @author dnebinger
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/benefit-usage.properties",
	scope = ServiceScope.PROTOTYPE, service = BenefitUsageResource.class
)
public class BenefitUsageResourceImpl extends BaseBenefitUsageResourceImpl {

	@Override
	public BenefitUsage getBenefitUsage(
			Long benefitUsageId)
			throws Exception {
		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model = _benefitUsageService.getBenefitUsage(benefitUsageId);

		return toBenefitUsage(model);
	}

	@Override
	public void deleteBenefitUsage(
			Long benefitUsageId)
			throws Exception {
		_benefitUsageService.deleteBenefitUsage(benefitUsageId);
	}

	@Override
	public BenefitUsage getSiteBenefitUsageByExternalReferenceCode(
			Long siteId,
			String externalReferenceCode)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model = _benefitUsageLocalService.getBenefitUsageByExternalReferenceCode(externalReferenceCode, siteId);

		return toBenefitUsage(model);
	}

	@Override
	public BenefitUsage putBenefitUsage(
			Long benefitUsageId,
			BenefitUsage benefitUsage)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model = _benefitUsageLocalService.getBenefitUsage(benefitUsageId);

		// convert the service date/time to utc
		LocalDateTime localDateTime = LocalDateTimeUtil.toLocalDateTime(
				benefitUsage.getServiceDate(), null,
				ZoneId.of(contextUser.getTimeZoneId()));

		// So this is to update an existing entity that is persisted.
		model = _benefitUsageService.updateBenefitUsage(benefitUsageId,
				benefitUsage.getBenefitType(), benefitUsage.getAmountUsedCents(), Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()),
				benefitUsage.getReference(), benefitUsage.getNotes(), benefitUsage.getSourceType(), benefitUsage.getSourceReference(),
				_createServiceContext(benefitUsage, model.getGroupId()));

		return toBenefitUsage(model);
	}

	public BenefitUsage toBenefitUsage(final com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model) throws Exception {
		return _benefitUsageDTOConverter.toDTO(_getActions(model), model);
	}

	protected com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage _fromBenefitUsage(final BenefitUsage dto) throws Exception {

		return null;
	}

	private Map<String, Map<String, String>> _getActions(
			com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model) {

		return HashMapBuilder.<String, Map<String, String>>put(
				"delete", addAction(ActionKeys.DELETE, model, "deleteBenefitUsage")
		).put(
				"get", addAction(ActionKeys.VIEW, model, "getBenefitUsage")
		).put(
				"patch", addAction(ActionKeys.UPDATE, model, "patchBenefitUsage")
		).put(
				"update", addAction(ActionKeys.UPDATE, model, "putBenefitUsage")
		).build();
	}

	private ServiceContext _createServiceContext(
			BenefitUsage benefitUsage, long groupId) {

		return ServiceContextBuilder.create(
				groupId, contextHttpServletRequest,
				"nobody" // need some kind of value that will not trigger adding default perms
		).build();
	}

	private static final EntityModel _entityModel = new BenefitUsageEntityModel();

	@Reference
	private BenefitUsageService _benefitUsageService;

	@Reference
	private BenefitUsageLocalService _benefitUsageLocalService;

	@Reference
	private PlanEnrollmentService _planEnrollmentService;

	@Reference
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

	@Reference
	private BenefitUsageDTOConverter _benefitUsageDTOConverter;

	private static final Log _log = LogFactoryUtil.getLog(BenefitUsageResourceImpl.class);
}