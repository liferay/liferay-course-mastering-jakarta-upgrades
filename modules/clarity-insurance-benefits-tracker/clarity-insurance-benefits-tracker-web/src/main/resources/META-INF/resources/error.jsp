<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchInsurancePlanException" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchPlanEnrollmentException" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.exception.NoSuchBenefitUsageException" %><%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<liferay-ui:error-header />

<liferay-ui:error exception="<%= NoSuchInsurancePlanException.class %>" message="the-insurance-plan-could-not-be-found" />
<liferay-ui:error exception="<%= NoSuchPlanEnrollmentException.class %>" message="the-plan-enrollment-could-not-be-found" />
<liferay-ui:error exception="<%= NoSuchBenefitUsageException.class %>" message="the-benefit-usage-could-not-be-found" />

<liferay-ui:error-principal />