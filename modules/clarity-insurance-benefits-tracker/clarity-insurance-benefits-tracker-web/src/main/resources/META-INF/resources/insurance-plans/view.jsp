<%@ page import="java.util.List" %>
<%@ page import="com.clarityvisionsolutions.insurance.benefits.tracker.model.InsurancePlan" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="java.util.ArrayList" %>
<%@ include file="/init.jsp" %>

<%
	List<InsurancePlan> plans = (List) request.getAttribute(InsurancePlan.class.getName() + 's');

	if (Validator.isNull(plans)) {
		plans = new ArrayList<>();
	}
%>