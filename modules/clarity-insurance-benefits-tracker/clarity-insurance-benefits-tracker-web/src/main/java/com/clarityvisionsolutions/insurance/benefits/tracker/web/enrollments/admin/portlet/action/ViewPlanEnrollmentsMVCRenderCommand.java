package com.clarityvisionsolutions.insurance.benefits.tracker.web.enrollments.admin.portlet.action;

import com.clarityvisionsolutions.insurance.benefits.tracker.constants.InsuranceBenefitsTrackerPortletKeys;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan;
import com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.InsurancePlanLocalService;
import com.clarityvisionsolutions.insurance.benefits.tracker.service.PlanEnrollmentService;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author dnebinger
 */
@Component(
	property = {
		"javax.portlet.name=" + InsuranceBenefitsTrackerPortletKeys.IBT_ENROLLMENT_ADMIN,
		"mvc.command.name=/", "mvc.command.name=/plan-enrollments/view"
	},
	service = MVCRenderCommand.class
)
public class ViewPlanEnrollmentsMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();

		try {
			List<PlanEnrollment> enrollments =
				_planEnrollmentService.getMemberPlanEnrollments(
					groupId, userId, WorkflowConstants.STATUS_ANY);

			renderRequest.setAttribute(
				PlanEnrollment.class.getName() + 's', enrollments);

			// Build a map of insurancePlanId -> InsurancePlan for display

			Map<Long, InsurancePlan> insurancePlanMap = new HashMap<>();

			for (PlanEnrollment enrollment : enrollments) {
				long insurancePlanId = enrollment.getInsurancePlanId();

				if (!insurancePlanMap.containsKey(insurancePlanId)) {
					try {
						InsurancePlan insurancePlan =
							_insurancePlanLocalService.getInsurancePlan(
								insurancePlanId);

						insurancePlanMap.put(insurancePlanId, insurancePlan);
					}
					catch (Exception exception) {
						_log.warn(
							"Unable to find insurance plan: " +
								insurancePlanId,
							exception);
					}
				}
			}

			renderRequest.setAttribute("insurancePlanMap", insurancePlanMap);
		}
		catch (Exception exception) {
			if (exception instanceof PrincipalException) {
				SessionErrors.add(renderRequest, exception.getClass());

				return "/error.jsp";
			}

			throw new PortletException(exception);
		}

		return "/plan-enrollments/view.jsp";
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ViewPlanEnrollmentsMVCRenderCommand.class);

	@Reference
	private InsurancePlanLocalService _insurancePlanLocalService;

	@Reference
	private PlanEnrollmentService _planEnrollmentService;

}
