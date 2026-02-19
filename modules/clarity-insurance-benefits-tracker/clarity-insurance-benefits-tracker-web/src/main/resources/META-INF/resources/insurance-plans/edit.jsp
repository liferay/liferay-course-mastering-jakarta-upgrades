<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>

<%@ include file="/init.jsp" %>

<%
InsurancePlan insurancePlan = (InsurancePlan)request.getAttribute("insurancePlan");

long insurancePlanId = 0;
String providerName = "";
String planName = "";
boolean active = false;
String annualExamAllowance = "";
String annualFramesAllowance = "";
String annualLensesAllowance = "";
String annualContactsAllowance = "";
int coveragePeriodMonths = 12;

if (insurancePlan != null) {
	insurancePlanId = insurancePlan.getInsurancePlanId();
	providerName = insurancePlan.getProviderName();
	planName = insurancePlan.getPlanName();
	active = insurancePlan.isActive();
	annualExamAllowance = String.format("%.2f", insurancePlan.getAnnualExamAllowanceCents() / 100.0);
	annualFramesAllowance = String.format("%.2f", insurancePlan.getAnnualFramesAllowanceCents() / 100.0);
	annualLensesAllowance = String.format("%.2f", insurancePlan.getAnnualLensesAllowanceCents() / 100.0);
	annualContactsAllowance = String.format("%.2f", insurancePlan.getAnnualContactsAllowanceCents() / 100.0);
	coveragePeriodMonths = insurancePlan.getCoveragePeriodMonths();
}

String title = (insurancePlan != null) ? "edit-insurance-plan" : "add-insurance-plan";
%>

<liferay-ui:header
	backURL="<%= renderResponse.createRenderURL().toString() %>"
	title="<%= title %>"
/>

<portlet:actionURL name="/insurance-plans/save" var="saveInsurancePlanURL" />

<aui:form action="<%= saveInsurancePlanURL %>" method="post" name="fm">
	<aui:input name="insurancePlanId" type="hidden" value="<%= insurancePlanId %>" />

		<div>
		<aui:fieldset label="plan-details">
			<aui:input
				label="provider-name"
				name="providerName"
				type="text"
				value="<%= providerName %>"
			>
				<aui:validator name="required" />
			</aui:input>

			<aui:input
				label="plan-name"
				name="planName"
				type="text"
				value="<%= planName %>"
			>
				<aui:validator name="required" />
			</aui:input>

			<aui:input
				checked="<%= active %>"
				label="active"
				name="active"
				type="checkbox"
			/>

			<aui:input
				label="coverage-period-months"
				name="coveragePeriodMonths"
				type="text"
				value="<%= String.valueOf(coveragePeriodMonths) %>"
			>
				<aui:validator name="required" />
				<aui:validator name="digits" />
			</aui:input>
		</aui:fieldset>

		<aui:fieldset label="allowances">
			<aui:input
				label="annual-exam-allowance"
				name="annualExamAllowance"
				type="text"
				value="<%= annualExamAllowance %>"
			>
				<aui:validator name="required" />
				<aui:validator name="number" />
			</aui:input>

			<aui:input
				label="annual-frames-allowance"
				name="annualFramesAllowance"
				type="text"
				value="<%= annualFramesAllowance %>"
			>
				<aui:validator name="required" />
				<aui:validator name="number" />
			</aui:input>

			<aui:input
				label="annual-lenses-allowance"
				name="annualLensesAllowance"
				type="text"
				value="<%= annualLensesAllowance %>"
			>
				<aui:validator name="required" />
				<aui:validator name="number" />
			</aui:input>

			<aui:input
				label="annual-contacts-allowance"
				name="annualContactsAllowance"
				type="text"
				value="<%= annualContactsAllowance %>"
			>
				<aui:validator name="required" />
				<aui:validator name="number" />
			</aui:input>
		</aui:fieldset>
		</div>

	<aui:button-row>
		<aui:button type="submit" value="save" />

		<portlet:renderURL var="cancelURL">
			<portlet:param name="mvcRenderCommandName" value="/insurance-plans/view" />
		</portlet:renderURL>

		<aui:button href="<%= cancelURL %>" type="cancel" />
	</aui:button-row>
</aui:form>
