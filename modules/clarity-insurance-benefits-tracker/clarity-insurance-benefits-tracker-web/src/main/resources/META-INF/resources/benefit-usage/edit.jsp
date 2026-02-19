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

<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Map" %>

<%@ include file="/init.jsp" %>

<%
BenefitUsage benefitUsage = (BenefitUsage)request.getAttribute("benefitUsage");
PlanEnrollment planEnrollment = (PlanEnrollment)request.getAttribute("planEnrollment");
InsurancePlan insurancePlan = (InsurancePlan)request.getAttribute("insurancePlan");
Map<String, Long> usageTotals = (Map<String, Long>)request.getAttribute("usageTotals");

long benefitUsageId = 0;
long planEnrollmentId = planEnrollment.getPlanEnrollmentId();
String benefitType = "";
String amountUsedDollars = "";
String reference = "";
String notes = "";

Calendar serviceDateCal = Calendar.getInstance();

boolean serviceDateDisabled = false;

SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
DecimalFormat dollarFormat = new DecimalFormat("#,##0.00");

if (benefitUsage != null) {
	benefitUsageId = benefitUsage.getBenefitUsageId();
	benefitType = benefitUsage.getBenefitType();
	amountUsedDollars = dollarFormat.format(benefitUsage.getAmountUsedCents() / 100.0);

	if (benefitUsage.getServiceDate() != null) {
		serviceDateCal.setTime(benefitUsage.getServiceDate());
	}

	if (benefitUsage.getReference() != null) {
		reference = benefitUsage.getReference();
	}

	if (benefitUsage.getNotes() != null) {
		notes = benefitUsage.getNotes();
	}
}

int serviceDateMonth = serviceDateCal.get(Calendar.MONTH);
int serviceDateDay = serviceDateCal.get(Calendar.DAY_OF_MONTH);
int serviceDateYear = serviceDateCal.get(Calendar.YEAR);

String title = (benefitUsage != null) ? "edit-benefit-usage" : "add-benefit-usage";

// Compute allowance caps for display

long examAllowanceCents = insurancePlan.getAnnualExamAllowanceCents();
long framesAllowanceCents = insurancePlan.getAnnualFramesAllowanceCents();
long lensesAllowanceCents = insurancePlan.getAnnualLensesAllowanceCents();
long contactsAllowanceCents = insurancePlan.getAnnualContactsAllowanceCents();

long examUsedCents = (usageTotals != null && usageTotals.get("exam") != null) ? usageTotals.get("exam") : 0;
long framesUsedCents = (usageTotals != null && usageTotals.get("frames") != null) ? usageTotals.get("frames") : 0;
long lensesUsedCents = (usageTotals != null && usageTotals.get("lenses") != null) ? usageTotals.get("lenses") : 0;
long contactsUsedCents = (usageTotals != null && usageTotals.get("contacts") != null) ? usageTotals.get("contacts") : 0;
%>

<portlet:renderURL var="backURL">
	<portlet:param name="mvcRenderCommandName" value="/benefit-usage/view" />
	<portlet:param name="planEnrollmentId" value="<%= String.valueOf(planEnrollmentId) %>" />
</portlet:renderURL>

<liferay-ui:header
	backURL="<%= backURL %>"
	title="<%= title %>"
/>

<%-- Error message for allowance exceeded (red alert) --%>

<c:if test='<%= com.liferay.portal.kernel.servlet.SessionErrors.contains(renderRequest, "benefitUsageExceedsAllowance") %>'>
	<div class="alert alert-danger">
		<liferay-ui:message key="benefit-usage-exceeds-allowance" />
	</div>
</c:if>

<%-- Plan Context --%>

<div class="card">
	<div class="card-body">
		<h5><%= insurancePlan.getProviderName() %> &mdash; <%= insurancePlan.getPlanName() %></h5>

		<p class="text-secondary">
			<%= (planEnrollment.getStartDate() != null) ? dateFormat.format(planEnrollment.getStartDate()) : "" %>
			&mdash;
			<%= (planEnrollment.getEndDate() != null) ? dateFormat.format(planEnrollment.getEndDate()) : "" %>
		</p>
	</div>
</div>

<%-- Usage Summary (current totals, excluding record being edited) --%>

<div class="card mt-3">
	<div class="card-body">
		<h5><liferay-ui:message key="usage-summary" /></h5>

		<div class="row">
			<div class="col-md-3">
				<strong><liferay-ui:message key="benefit-type-exam" /></strong><br />
				$<%= dollarFormat.format(examUsedCents / 100.0) %>
				/ $<%= dollarFormat.format(examAllowanceCents / 100.0) %>
				<br /><small class="text-secondary">$<%= dollarFormat.format((examAllowanceCents - examUsedCents) / 100.0) %> available</small>
			</div>

			<div class="col-md-3">
				<strong><liferay-ui:message key="benefit-type-frames" /></strong><br />
				$<%= dollarFormat.format(framesUsedCents / 100.0) %>
				/ $<%= dollarFormat.format(framesAllowanceCents / 100.0) %>
				<br /><small class="text-secondary">$<%= dollarFormat.format((framesAllowanceCents - framesUsedCents) / 100.0) %> available</small>
			</div>

			<div class="col-md-3">
				<strong><liferay-ui:message key="benefit-type-lenses" /></strong><br />
				$<%= dollarFormat.format(lensesUsedCents / 100.0) %>
				/ $<%= dollarFormat.format(lensesAllowanceCents / 100.0) %>
				<br /><small class="text-secondary">$<%= dollarFormat.format((lensesAllowanceCents - lensesUsedCents) / 100.0) %> available</small>
			</div>

			<div class="col-md-3">
				<strong><liferay-ui:message key="benefit-type-contacts" /></strong><br />
				$<%= dollarFormat.format(contactsUsedCents / 100.0) %>
				/ $<%= dollarFormat.format(contactsAllowanceCents / 100.0) %>
				<br /><small class="text-secondary">$<%= dollarFormat.format((contactsAllowanceCents - contactsUsedCents) / 100.0) %> available</small>
			</div>
		</div>
	</div>
</div>

<%-- Benefit Usage Form --%>

<portlet:actionURL name="/benefit-usage/save" var="saveBenefitUsageURL" />

<aui:form action="<%= saveBenefitUsageURL %>" method="post" name="fm">
	<aui:input name="benefitUsageId" type="hidden" value="<%= benefitUsageId %>" />
	<aui:input name="planEnrollmentId" type="hidden" value="<%= planEnrollmentId %>" />

		<aui:fieldset>
			<aui:select label="benefit-type" name="benefitType">
				<aui:option label="-- Select --" value="" />
				<aui:option label="benefit-type-exam" selected='<%= "exam".equals(benefitType) %>' value="exam" />
				<aui:option label="benefit-type-frames" selected='<%= "frames".equals(benefitType) %>' value="frames" />
				<aui:option label="benefit-type-lenses" selected='<%= "lenses".equals(benefitType) %>' value="lenses" />
				<aui:option label="benefit-type-contacts" selected='<%= "contacts".equals(benefitType) %>' value="contacts" />
			</aui:select>

			<aui:input
				label="amount-used"
				name="amountUsedDollars"
				type="text"
				value="<%= amountUsedDollars %>"
			>
				<aui:validator name="required" />
			</aui:input>

			<label class="control-label" for="<portlet:namespace />serviceDate">
				<liferay-ui:message key="service-date" />
			</label>

			<liferay-ui:input-date
				dayParam="serviceDateDay"
				dayValue="<%= serviceDateDay %>"
				disabled="<%= serviceDateDisabled %>"
				monthParam="serviceDateMonth"
				monthValue="<%= serviceDateMonth %>"
				name="serviceDate"
				yearParam="serviceDateYear"
				yearValue="<%= serviceDateYear %>"
			/>

			<aui:input
				label="reference"
				name="reference"
				type="text"
				value="<%= reference %>"
			/>

			<aui:input
				label="notes"
				name="notes"
				type="textarea"
				value="<%= notes %>"
			/>
		</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="save" />
		<aui:button href="<%= backURL %>" type="cancel" />
	</aui:button-row>
</aui:form>
