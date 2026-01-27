package com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.resource.v1_0;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerConstants;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.dto.v1_0.BenefitUsage;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.dto.v1_0.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.dto.v1_0.converter.BenefitUsageDTOConverter;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.internal.dto.v1_0.converter.PlanEnrollmentDTOConverter;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.resource.v1_0.BenefitUsageResource;
import com.clarityvisionsolutions.insurance.benefits.tracker.rest.resource.v1_0.PlanEnrollmentResource;

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
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.LocalDateTimeUtil;
import com.liferay.portal.vulcan.util.SearchUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * @author dnebinger
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/plan-enrollment.properties",
	scope = ServiceScope.PROTOTYPE, service = PlanEnrollmentResource.class
)
public class PlanEnrollmentResourceImpl extends BasePlanEnrollmentResourceImpl {

	@Override
	public void deletePlanEnrollment(
			Long planEnrollmentId)
			throws Exception {

		_planEnrollmentService.deletePlanEnrollment(planEnrollmentId);
	}

	@Override
	public PlanEnrollment getPlanEnrollment(
			Long planEnrollmentId)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment model = _planEnrollmentService.getPlanEnrollment(planEnrollmentId);

		return _planEnrollmentDTOConverter.toDTO(_getActions(model), model);
	}

	@Override
	public PlanEnrollment getSitePlanEnrollmentByExternalReferenceCode(
			Long siteId,
			String externalReferenceCode)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment model = _planEnrollmentLocalService.getPlanEnrollmentByExternalReferenceCode(externalReferenceCode, siteId);

		return getPlanEnrollment(model.getPlanEnrollmentId());
	}

	@Override
	public Page<PlanEnrollment> getSitePlanEnrollmentsPage(
			Long siteId,
			String search,
			com.liferay.portal.vulcan.aggregation.Aggregation aggregation,
			com.liferay.portal.kernel.search.filter.Filter filter,
			Pagination pagination,
			com.liferay.portal.kernel.search.Sort[]
					sorts)
			throws Exception {

		return SearchUtil.search(
				HashMapBuilder.put(
						"get",
						addAction(
								ActionKeys.VIEW, "getSitePlanEnrollmentsPage",
								InsuranceBenefitsTrackerConstants.RESOURCE_NAME,
								siteId)
				).build(),
				booleanQuery -> {
				},
				filter,
				com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment.class.getName(),
				search, pagination,
				queryConfig -> queryConfig.setSelectedFieldNames(
						Field.ENTRY_CLASS_PK),
				searchContext -> {
					searchContext.setAttribute(Field.NAME, search);
					searchContext.setCompanyId(contextCompany.getCompanyId());
					searchContext.setGroupIds(new long[] {siteId});
				},
				sorts,
				document -> {
					com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment model = _planEnrollmentService.getPlanEnrollment(
							GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK)));

					return _planEnrollmentDTOConverter.toDTO(_getActions(model), model);
				}
		);
	}

	@Override
	public PlanEnrollment putPlanEnrollment(
			Long planEnrollmentId,
			PlanEnrollment planEnrollment)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment model = _planEnrollmentService.getPlanEnrollment(planEnrollmentId);

		LocalDateTime localDateTime = LocalDateTimeUtil.toLocalDateTime(
				planEnrollment.getStartDate(), null,
				ZoneId.of(contextUser.getTimeZoneId()));

		Date startDate = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		localDateTime = LocalDateTimeUtil.toLocalDateTime(
				planEnrollment.getEndDate(), null,
				ZoneId.of(contextUser.getTimeZoneId()));

		Date endDate = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		model = _planEnrollmentService.updatePlanEnrollment(planEnrollmentId, planEnrollment.getMemberId(), planEnrollment.getGroupNumber(),
				startDate, endDate,
				planEnrollment.getEnrollmentStatus(), planEnrollment.getNotes(), _createServiceContext(planEnrollment, model.getGroupId()));

		return _planEnrollmentDTOConverter.toDTO(_getActions(model), model);
	}

	@Override
	public Page<BenefitUsage> getPlanEnrollmentBenefitUsagesPage(
			Long planEnrollmentId,
			String search,
			com.liferay.portal.vulcan.aggregation.Aggregation aggregation,
			com.liferay.portal.kernel.search.filter.Filter filter,
			Pagination pagination,
			com.liferay.portal.kernel.search.Sort[]
					sorts)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment enrollment = _planEnrollmentLocalService.getPlanEnrollment(planEnrollmentId);
		final long siteId = enrollment.getGroupId();

		return SearchUtil.search(
				HashMapBuilder.put("create", addAction(ActionKeys.UPDATE, "postPlanEnrollment",
								com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment.class.getName(), planEnrollmentId))
						.put("createBatch", addAction(ActionKeys.UPDATE, "postPlanEnrollmentBatch",
								com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment.class.getName(),
								planEnrollmentId))
						.put("get", addAction(ActionKeys.VIEW, "getPlanEnrollmentBenefitUsagesPage",
								com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment.class.getName(), planEnrollmentId))
						.build(),
				booleanQuery -> {},
				filter, com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage.class.getName(),
				search, pagination,
				queryConfig -> queryConfig.setSelectedFieldNames(Field.ENTRY_CLASS_PK),
				searchContext -> {
					searchContext.setAttribute(Field.NAME, search);
					searchContext.setAttribute("key", search);
					searchContext.setAttribute("planEnrollmentId", planEnrollmentId);
					searchContext.setCompanyId(contextCompany.getCompanyId());
					searchContext.setGroupIds(new long[] {siteId});
				}, sorts,
				document -> {
					com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model = _benefitUsageService.getBenefitUsage(
							GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK)));

					return _benefitUsageDTOConverter.toDTO(_getActions(model), model);
				}
		);
	}

	@Override
	public BenefitUsage postPlanEnrollment(
			Long planEnrollmentId,
			BenefitUsage benefitUsage)
			throws Exception {

		return postPlanEnrollmentBenefitUsage(planEnrollmentId, benefitUsage);
	}

	@Override
	public BenefitUsage postPlanEnrollmentBenefitUsage(
			Long planEnrollmentId,
			BenefitUsage benefitUsage)
			throws Exception {

		com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model = null;

		// hmm, so here the idea is the benefit usage is mostly complete and we're about to add a new one.
		if ((Validator.isNotNull(benefitUsage.getExternalReferenceCode())) && (! benefitUsage.getExternalReferenceCode().isEmpty())) {
			// have a valid erc, does it match to an existing record?
			try {
				model = _benefitUsageLocalService.getBenefitUsageByExternalReferenceCode(benefitUsage.getExternalReferenceCode());
			} catch (Exception ignored) {
				// thrown if there was no match, we don't care about it.
			}

			if (Validator.isNotNull(model)) {
				_log.warn("Duplicate external reference code");
				throw new DuplicateExternalReferenceCodeException();
			}
		}

		// the erc must be unique though, and the id shouldn't be set
		// we need to pull the plan enrollment so we can create an appropriate service context object
		com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment enrollment = _planEnrollmentService.getPlanEnrollment(planEnrollmentId);

		if (benefitUsage.getId() != null) {
			model = _benefitUsageLocalService.fetchBenefitUsage(benefitUsage.getId());

			if (model != null) {
				// we found an existing model, but is it in the same plan?
				if (model.getPlanEnrollmentId() != enrollment.getPlanEnrollmentId()) {
					// not the same plan, let's clear the id and plan enrollment id
					benefitUsage.setId((Long) null);
					benefitUsage.setPlanEnrollmentId((Long) null);
				} else {
					// hmm, they're the same. Probably a duplicate request.
					return _benefitUsageDTOConverter.toDTO(model);
				}
			}
		}

		ServiceContext serviceContext = _createServiceContext(null, enrollment.getGroupId());

		// so now we should be able to add the new benefit usage
		// convert the service date/time to utc
		LocalDateTime localDateTime = LocalDateTimeUtil.toLocalDateTime(
				benefitUsage.getServiceDate(), null,
				ZoneId.of(contextUser.getTimeZoneId()));

		// So this is to create a brand new entity that is persisted.
		model = _benefitUsageService.addBenefitUsage(planEnrollmentId,
				benefitUsage.getBenefitType(), benefitUsage.getAmountUsedCents(), Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()),
				benefitUsage.getReference(), benefitUsage.getNotes(), benefitUsage.getSourceType(), benefitUsage.getSourceReference(),
				serviceContext);

		return _benefitUsageDTOConverter.toDTO(_getActions(model), model);
	}

	private Map<String, Map<String, String>> _getActions(
			com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment model) {

		return HashMapBuilder
				.<String, Map<String, String>>put("delete", addAction(ActionKeys.DELETE, model, "deletePlanEnrollment")
		).put("get", addAction(ActionKeys.VIEW, model, "getPlanEnrollment")
		).put("patch", addAction(ActionKeys.UPDATE, model, "patchPlanEnrollment")
		).put("update", addAction(ActionKeys.UPDATE, model, "putPlanEnrollment")
		).build();
	}

	private Map<String, Map<String, String>> _getActions(
			com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage model) {

		return HashMapBuilder
				.<String, Map<String, String>>put("delete", addAction(ActionKeys.DELETE, model, "deleteBenefitUsage")
		).put("get", addAction(ActionKeys.VIEW, model, "getBenefitUsage")
		).put("patch", addAction(ActionKeys.UPDATE, model, "patchBenefitUsage")
		).put("update", addAction(ActionKeys.UPDATE, model, "putBenefitUsage")
		).build();
	}

	private ServiceContext _createServiceContext(
			PlanEnrollment planEnrollment, long groupId) {

		return ServiceContextBuilder.create(
				groupId, contextHttpServletRequest,
				"nobody" // need some kind of value that will not trigger adding default perms
		).build();
	}

	@Reference
	private PlanEnrollmentLocalService _planEnrollmentLocalService;

	@Reference
	private PlanEnrollmentService _planEnrollmentService;

	@Reference
	private PlanEnrollmentDTOConverter _planEnrollmentDTOConverter;

	@Reference
	private BenefitUsageLocalService _benefitUsageLocalService;
	@Reference
	private BenefitUsageService _benefitUsageService;

	@Reference
	private BenefitUsageDTOConverter _benefitUsageDTOConverter;

	private static final Log _log = LogFactoryUtil.getLog(PlanEnrollmentResourceImpl.class);
}