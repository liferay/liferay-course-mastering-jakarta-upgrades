<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment" %>

<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>

<%@ include file="/init.jsp" %>

<%
PlanEnrollment planEnrollment = (PlanEnrollment)request.getAttribute("planEnrollment");
InsurancePlan insurancePlan = (InsurancePlan)request.getAttribute("insurancePlan");

List<BenefitUsage> benefitUsages = (List<BenefitUsage>)request.getAttribute("benefitUsages");

if (benefitUsages == null) {
	benefitUsages = new ArrayList<>();
}

Map<String, Long> usageTotals = (Map<String, Long>)request.getAttribute("usageTotals");

SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
DecimalFormat dollarFormat = new DecimalFormat("#,##0.00");

long planEnrollmentId = (planEnrollment != null) ? planEnrollment.getPlanEnrollmentId() : 0;
%>

<liferay-ui:success key="benefitUsageSaved" message="benefit-usage-saved-successfully" />
<liferay-ui:success key="benefitUsageDeleted" message="benefit-usage-deleted-successfully" />

<liferay-ui:error key="benefitUsageExceedsAllowance" message="benefit-usage-exceeds-allowance" />

<portlet:renderURL var="backToSearchURL">
	<portlet:param name="mvcRenderCommandName" value="/benefit-usage/search" />
</portlet:renderURL>

<aui:button href="<%= backToSearchURL %>" value="back-to-search" />

<c:choose>
	<c:when test="<%= (planEnrollment == null) || (insurancePlan == null) %>">
		<div class="alert alert-warning mt-3">
			<liferay-ui:message key="the-plan-enrollment-or-insurance-plan-could-not-be-found" />
		</div>
	</c:when>
	<c:otherwise>

		<%-- Plan Context Header --%>

		<div class="card mt-3">
			<div class="card-body">
				<h4><%= insurancePlan.getProviderName() %> &mdash; <%= insurancePlan.getPlanName() %></h4>

				<p class="text-secondary">
					<%= (planEnrollment.getStartDate() != null) ? dateFormat.format(planEnrollment.getStartDate()) : "" %>
					&mdash;
					<%= (planEnrollment.getEndDate() != null) ? dateFormat.format(planEnrollment.getEndDate()) : "" %>
				</p>
			</div>
		</div>

		<%-- Usage Summary Bar --%>

		<div class="card mt-3">
			<div class="card-body">
				<h5><liferay-ui:message key="usage-summary" /></h5>

				<div class="row">
					<div class="col-md-3">
						<strong><liferay-ui:message key="benefit-type-exam" /></strong><br />
						$<%= dollarFormat.format((usageTotals != null && usageTotals.get("exam") != null) ? usageTotals.get("exam") / 100.0 : 0) %>
						/ $<%= dollarFormat.format(insurancePlan.getAnnualExamAllowanceCents() / 100.0) %>
					</div>

					<div class="col-md-3">
						<strong><liferay-ui:message key="benefit-type-frames" /></strong><br />
						$<%= dollarFormat.format((usageTotals != null && usageTotals.get("frames") != null) ? usageTotals.get("frames") / 100.0 : 0) %>
						/ $<%= dollarFormat.format(insurancePlan.getAnnualFramesAllowanceCents() / 100.0) %>
					</div>

					<div class="col-md-3">
						<strong><liferay-ui:message key="benefit-type-lenses" /></strong><br />
						$<%= dollarFormat.format((usageTotals != null && usageTotals.get("lenses") != null) ? usageTotals.get("lenses") / 100.0 : 0) %>
						/ $<%= dollarFormat.format(insurancePlan.getAnnualLensesAllowanceCents() / 100.0) %>
					</div>

					<div class="col-md-3">
						<strong><liferay-ui:message key="benefit-type-contacts" /></strong><br />
						$<%= dollarFormat.format((usageTotals != null && usageTotals.get("contacts") != null) ? usageTotals.get("contacts") / 100.0 : 0) %>
						/ $<%= dollarFormat.format(insurancePlan.getAnnualContactsAllowanceCents() / 100.0) %>
					</div>
				</div>
			</div>
		</div>

		<%-- Add Benefit Usage Button --%>

		<div class="sheet-tertiary mt-3">
			<portlet:renderURL var="addBenefitUsageURL">
				<portlet:param name="mvcRenderCommandName" value="/benefit-usage/edit" />
				<portlet:param name="planEnrollmentId" value="<%= String.valueOf(planEnrollmentId) %>" />
			</portlet:renderURL>

			<aui:button href="<%= addBenefitUsageURL %>" value="add-benefit-usage" />
		</div>

		<%-- Benefit Usage Table --%>

		<liferay-ui:search-container
			emptyResultsMessage="no-benefit-usages-found"
			total="<%= benefitUsages.size() %>"
		>
			<liferay-ui:search-container-results
				results="<%= benefitUsages %>"
			/>

			<liferay-ui:search-container-row
				className="com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage"
				keyProperty="benefitUsageId"
				modelVar="benefitUsage"
			>

				<%
				String benefitTypeLabel = "";

				switch (benefitUsage.getBenefitType()) {
					case "exam":
						benefitTypeLabel = "Exam";

						break;
					case "frames":
						benefitTypeLabel = "Frames";

						break;
					case "lenses":
						benefitTypeLabel = "Lenses";

						break;
					case "contacts":
						benefitTypeLabel = "Contacts";

						break;
					default:
						benefitTypeLabel = benefitUsage.getBenefitType();
				}
				%>

				<liferay-ui:search-container-column-text
					name="benefit-type"
					value="<%= benefitTypeLabel %>"
				/>

				<liferay-ui:search-container-column-text
					name="amount-used"
					value="<%= \"$\" + dollarFormat.format(benefitUsage.getAmountUsedCents() / 100.0) %>"
				/>

				<liferay-ui:search-container-column-text
					name="service-date"
					value="<%= (benefitUsage.getServiceDate() != null) ? dateFormat.format(benefitUsage.getServiceDate()) : \"\" %>"
				/>

				<liferay-ui:search-container-column-text
					name="reference"
					value="<%= (benefitUsage.getReference() != null) ? benefitUsage.getReference() : \"\" %>"
				/>

				<liferay-ui:search-container-column-text
					name="notes"
					value="<%= (benefitUsage.getNotes() != null) ? benefitUsage.getNotes() : \"\" %>"
				/>

				<liferay-ui:search-container-column-jsp
					align="right"
					path="/benefit-usage/action.jsp"
				/>
			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator
				markupView="lexicon"
			/>
		</liferay-ui:search-container>
	</c:otherwise>
</c:choose>
