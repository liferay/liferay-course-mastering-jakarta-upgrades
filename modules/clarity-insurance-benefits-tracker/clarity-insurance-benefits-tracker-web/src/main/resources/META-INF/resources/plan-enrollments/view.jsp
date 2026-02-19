<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment" %>

<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>

<%@ include file="/init.jsp" %>

<%
List<PlanEnrollment> enrollments = (List)request.getAttribute(PlanEnrollment.class.getName() + 's');

if (Validator.isNull(enrollments)) {
	enrollments = new ArrayList<>();
}

Map<Long, InsurancePlan> insurancePlanMap = (Map<Long, InsurancePlan>)request.getAttribute("insurancePlanMap");

SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
%>

<liferay-ui:success key="planEnrollmentSaved" message="plan-enrollment-saved-successfully" />

<portlet:renderURL var="addPlanEnrollmentURL">
	<portlet:param name="mvcRenderCommandName" value="/plan-enrollments/edit" />
</portlet:renderURL>

<div class="sheet-tertiary">
	<aui:button href="<%= addPlanEnrollmentURL %>" value="add-plan-enrollment" />
</div>

<liferay-ui:search-container
	emptyResultsMessage="no-plan-enrollments-found"
	total="<%= enrollments.size() %>"
>
	<liferay-ui:search-container-results
		results="<%= enrollments %>"
	/>

	<liferay-ui:search-container-row
		className="com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment"
		keyProperty="planEnrollmentId"
		modelVar="planEnrollment"
	>

		<%
		InsurancePlan insurancePlan = (insurancePlanMap != null) ? insurancePlanMap.get(planEnrollment.getInsurancePlanId()) : null;
		String providerName = (insurancePlan != null) ? insurancePlan.getProviderName() : "";
		String planName = (insurancePlan != null) ? insurancePlan.getPlanName() : "";
		%>

		<liferay-ui:search-container-column-text
			name="provider-name"
			value="<%= providerName %>"
		/>

		<liferay-ui:search-container-column-text
			name="plan-name"
			value="<%= planName %>"
		/>

		<liferay-ui:search-container-column-text
			name="start-date"
			value="<%= (planEnrollment.getStartDate() != null) ? dateFormat.format(planEnrollment.getStartDate()) : \"\" %>"
		/>

		<liferay-ui:search-container-column-text
			name="end-date"
			value="<%= (planEnrollment.getEndDate() != null) ? dateFormat.format(planEnrollment.getEndDate()) : \"\" %>"
		/>

		<%
		String enrollmentStatusLabel = "";

		switch (planEnrollment.getEnrollmentStatus()) {
			case 0:
				enrollmentStatusLabel = "Pending";

				break;
			case 1:
				enrollmentStatusLabel = "Active";

				break;
			case 2:
				enrollmentStatusLabel = "Inactive";

				break;
			case 3:
				enrollmentStatusLabel = "Cancelled";

				break;
			default:
				enrollmentStatusLabel = String.valueOf(planEnrollment.getEnrollmentStatus());
		}
		%>

		<liferay-ui:search-container-column-text
			name="enrollment-status"
			value="<%= enrollmentStatusLabel %>"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/plan-enrollments/action.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator
		markupView="lexicon"
	/>
</liferay-ui:search-container>
