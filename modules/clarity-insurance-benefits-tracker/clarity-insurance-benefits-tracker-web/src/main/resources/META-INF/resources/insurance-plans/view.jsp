<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>

<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%@ include file="/init.jsp" %>

<%
List<InsurancePlan> plans = (List)request.getAttribute(InsurancePlan.class.getName() + 's');

if (Validator.isNull(plans)) {
	plans = new ArrayList<>();
}
%>

<liferay-ui:success key="insurancePlanSaved" message="insurance-plan-saved-successfully" />
<liferay-ui:success key="insurancePlanDeleted" message="insurance-plan-deleted-successfully" />

<portlet:renderURL var="addInsurancePlanURL">
	<portlet:param name="mvcRenderCommandName" value="/insurance-plans/edit" />
</portlet:renderURL>

<div class="sheet-tertiary">
	<aui:button href="<%= addInsurancePlanURL %>" value="add-insurance-plan" />
</div>

<liferay-ui:search-container
	emptyResultsMessage="no-insurance-plans-found"
	total="<%= plans.size() %>"
>
	<liferay-ui:search-container-results
		results="<%= plans %>"
	/>

	<liferay-ui:search-container-row
		className="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan"
		keyProperty="insurancePlanId"
		modelVar="insurancePlan"
	>
		<liferay-ui:search-container-column-text
			name="provider-name"
			property="providerName"
		/>

		<liferay-ui:search-container-column-text
			name="plan-name"
			property="planName"
		/>

		<liferay-ui:search-container-column-text
			name="active"
			value='<%= insurancePlan.isActive() ? "Yes" : "No" %>'
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/insurance-plans/action.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator
		markupView="lexicon"
	/>
</liferay-ui:search-container>
