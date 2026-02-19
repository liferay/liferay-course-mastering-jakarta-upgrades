<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment" %>

<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.List" %>

<%@ include file="/init.jsp" %>

<%
PlanEnrollment planEnrollment = (PlanEnrollment)request.getAttribute("planEnrollment");
List<InsurancePlan> insurancePlans = (List<InsurancePlan>)request.getAttribute("insurancePlans");
Boolean isAdmin = (Boolean)request.getAttribute("isAdmin");

if (isAdmin == null) {
	isAdmin = false;
}

long planEnrollmentId = 0;
long insurancePlanId = 0;
String memberId = "";
String groupNumber = "";
String startDate = "";
String endDate = "";
int enrollmentStatus = 0;
String notes = "";

SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

if (planEnrollment != null) {
	planEnrollmentId = planEnrollment.getPlanEnrollmentId();
	insurancePlanId = planEnrollment.getInsurancePlanId();
	memberId = planEnrollment.getMemberId();
	groupNumber = planEnrollment.getGroupNumber();

	if (planEnrollment.getStartDate() != null) {
		startDate = dateFormat.format(planEnrollment.getStartDate());
	}

	if (planEnrollment.getEndDate() != null) {
		endDate = dateFormat.format(planEnrollment.getEndDate());
	}

	enrollmentStatus = planEnrollment.getEnrollmentStatus();
	notes = planEnrollment.getNotes();
}
else {
	// Defaults for new enrollment: Jan 1 - Dec 31 of current year

	Calendar calendar = Calendar.getInstance();
	int currentYear = calendar.get(Calendar.YEAR);

	startDate = "01/01/" + currentYear;
	endDate = "12/31/" + currentYear;
}

String title = (planEnrollment != null) ? "edit-plan-enrollment" : "add-plan-enrollment";

// Find the plan name for display in edit mode

String selectedPlanDisplay = "";

if ((planEnrollment != null) && (insurancePlans != null)) {
	for (InsurancePlan plan : insurancePlans) {
		if (plan.getInsurancePlanId() == insurancePlanId) {
			selectedPlanDisplay = plan.getProviderName() + " - " + plan.getPlanName();

			break;
		}
	}
}
%>

<liferay-ui:header
	backURL="<%= renderResponse.createRenderURL().toString() %>"
	title="<%= title %>"
/>

<portlet:actionURL name="/plan-enrollments/save" var="savePlanEnrollmentURL" />

<aui:form action="<%= savePlanEnrollmentURL %>" method="post" name="fm">
	<aui:input name="planEnrollmentId" type="hidden" value="<%= planEnrollmentId %>" />

	<div>
		<aui:fieldset label="plan-details">
			<c:choose>
				<c:when test="<%= planEnrollment == null %>">
					<aui:select label="insurance-plan" name="insurancePlanId">
						<aui:option value="">-- Select a Plan --</aui:option>

						<%
						if (insurancePlans != null) {
							for (InsurancePlan plan : insurancePlans) {
						%>

								<aui:option label="<%= plan.getProviderName() + \" - \" + plan.getPlanName() %>" value="<%= plan.getInsurancePlanId() %>" />

						<%
							}
						}
						%>

					</aui:select>
				</c:when>
				<c:otherwise>
					<aui:input name="insurancePlanId" type="hidden" value="<%= insurancePlanId %>" />

					<aui:input
						disabled="<%= true %>"
						label="insurance-plan"
						name="insurancePlanDisplay"
						type="text"
						value="<%= selectedPlanDisplay %>"
					/>
				</c:otherwise>
			</c:choose>
		</aui:fieldset>

		<aui:fieldset label="enrollment-details">
			<aui:input
				label="member-id"
				name="memberId"
				type="text"
				value="<%= memberId %>"
			>
				<aui:validator name="required" />
			</aui:input>

			<aui:input
				label="group-number"
				name="groupNumber"
				type="text"
				value="<%= groupNumber %>"
			>
				<aui:validator name="required" />
			</aui:input>

			<aui:input
				label="start-date"
				name="startDate"
				type="text"
				value="<%= startDate %>"
			>
				<aui:validator name="required" />
			</aui:input>

			<aui:input
				label="end-date"
				name="endDate"
				type="text"
				value="<%= endDate %>"
			/>

			<aui:select label="enrollment-status" name="enrollmentStatus">
				<aui:option label="enrollment-status-pending" selected="<%= enrollmentStatus == 0 %>" value="0" />
				<aui:option label="enrollment-status-active" selected="<%= enrollmentStatus == 1 %>" value="1" />
				<aui:option label="enrollment-status-inactive" selected="<%= enrollmentStatus == 2 %>" value="2" />
				<aui:option label="enrollment-status-cancelled" selected="<%= enrollmentStatus == 3 %>" value="3" />
			</aui:select>

			<c:if test="<%= isAdmin %>">
				<aui:input
					label="notes"
					name="notes"
					type="textarea"
					value="<%= notes %>"
				/>
			</c:if>
		</aui:fieldset>
	</div>

	<aui:button-row>
		<aui:button type="submit" value="save" />

		<portlet:renderURL var="cancelURL">
			<portlet:param name="mvcRenderCommandName" value="/plan-enrollments/view" />
		</portlet:renderURL>

		<aui:button href="<%= cancelURL %>" type="cancel" />
	</aui:button-row>
</aui:form>
