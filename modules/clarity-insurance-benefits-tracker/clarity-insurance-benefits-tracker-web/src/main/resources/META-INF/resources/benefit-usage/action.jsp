<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.BenefitUsage" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ include file="/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

BenefitUsage benefitUsage = (BenefitUsage)row.getObject();

PlanEnrollment planEnrollment = (PlanEnrollment)request.getAttribute("planEnrollment");
long planEnrollmentId = (planEnrollment != null) ? planEnrollment.getPlanEnrollmentId() : 0;
%>

<liferay-ui:icon-menu
	direction="left-side"
	icon=""
	markupView="lexicon"
	message=""
	showWhenSingleIcon="<%= true %>"
>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcRenderCommandName" value="/benefit-usage/edit" />
		<portlet:param name="benefitUsageId" value="<%= String.valueOf(benefitUsage.getBenefitUsageId()) %>" />
		<portlet:param name="planEnrollmentId" value="<%= String.valueOf(planEnrollmentId) %>" />
	</portlet:renderURL>

	<liferay-ui:icon
		message="edit"
		url="<%= editURL %>"
	/>

	<portlet:actionURL name="/benefit-usage/delete" var="deleteURL">
		<portlet:param name="benefitUsageId" value="<%= String.valueOf(benefitUsage.getBenefitUsageId()) %>" />
		<portlet:param name="planEnrollmentId" value="<%= String.valueOf(planEnrollmentId) %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete
		url="<%= deleteURL %>"
	/>
</liferay-ui:icon-menu>
