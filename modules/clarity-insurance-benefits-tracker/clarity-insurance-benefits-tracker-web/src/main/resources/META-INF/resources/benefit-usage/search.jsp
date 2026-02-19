<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.PlanEnrollment" %>

<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>

<%@ include file="/init.jsp" %>

<%
String keywords = (String)request.getAttribute("keywords");

if (keywords == null) {
	keywords = "";
}

Long memberUserId = (Long)request.getAttribute("memberUserId");

if (memberUserId == null) {
	memberUserId = 0L;
}

List<User> matchedUsers = (List<User>)request.getAttribute("matchedUsers");
User selectedUser = (User)request.getAttribute("selectedUser");
List<PlanEnrollment> enrollments = (List<PlanEnrollment>)request.getAttribute("enrollments");
Map<Long, InsurancePlan> insurancePlanMap = (Map<Long, InsurancePlan>)request.getAttribute("insurancePlanMap");

SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
%>

<h3><liferay-ui:message key="search-enrollments" /></h3>

<%-- User Search Form --%>

<portlet:actionURL name="/benefit-usage/search" var="searchURL" />

<aui:form action="<%= searchURL %>" method="post" name="searchFm">
	<aui:input
		label="search-by-name"
		name="keywords"
		placeholder="enter-user-name"
		type="text"
		value="<%= keywords %>"
	>
		<aui:validator name="required" />
	</aui:input>

	<aui:button-row>
		<aui:button type="submit" value="search" />
	</aui:button-row>
</aui:form>

<%-- User Search Results --%>

<c:if test="<%= Validator.isNotNull(keywords) && (matchedUsers != null) %>">
	<hr />

	<h4><liferay-ui:message key="matching-users" /></h4>

	<liferay-ui:search-container
		emptyResultsMessage="no-users-found"
		total="<%= matchedUsers.size() %>"
	>
		<liferay-ui:search-container-results
			results="<%= matchedUsers %>"
		/>

		<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.model.User"
			keyProperty="userId"
			modelVar="matchedUser"
		>
			<liferay-ui:search-container-column-text
				name="screen-name"
				value="<%= matchedUser.getScreenName() %>"
			/>

			<liferay-ui:search-container-column-text
				name="first-name"
				value="<%= matchedUser.getFirstName() %>"
			/>

			<liferay-ui:search-container-column-text
				name="last-name"
				value="<%= matchedUser.getLastName() %>"
			/>

			<liferay-ui:search-container-column-text
				name="email-address"
				value="<%= matchedUser.getEmailAddress() %>"
			/>

			<liferay-ui:search-container-column-text name="actions">

				<portlet:actionURL name="/benefit-usage/search" var="selectUserURL">
					<portlet:param name="memberUserId" value="<%= String.valueOf(matchedUser.getUserId()) %>" />
				</portlet:actionURL>

				<aui:button href="<%= selectUserURL %>" value="select" />
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator
			markupView="lexicon"
		/>
	</liferay-ui:search-container>
</c:if>

<%-- Active Enrollments for Selected User --%>

<c:if test="<%= (memberUserId > 0) && (selectedUser != null) %>">
	<hr />

	<h4>
		<liferay-ui:message key="active-enrollments-for" />
		<%= selectedUser.getFullName() %> (<%= selectedUser.getScreenName() %>)
	</h4>

	<c:choose>
		<c:when test="<%= (enrollments != null) && !enrollments.isEmpty() %>">
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

					<liferay-ui:search-container-column-text name="actions">

						<portlet:renderURL var="viewUsagesURL">
							<portlet:param name="mvcRenderCommandName" value="/benefit-usage/view" />
							<portlet:param name="planEnrollmentId" value="<%= String.valueOf(planEnrollment.getPlanEnrollmentId()) %>" />
						</portlet:renderURL>

						<aui:button href="<%= viewUsagesURL %>" value="view-usages" />
					</liferay-ui:search-container-column-text>
				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator
					markupView="lexicon"
				/>
			</liferay-ui:search-container>
		</c:when>
		<c:otherwise>
			<div class="alert alert-info">
				<liferay-ui:message key="no-active-enrollments-for-user" />
			</div>
		</c:otherwise>
	</c:choose>
</c:if>
