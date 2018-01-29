<%@include file="/apps/company/includes/baseglobal.jsp" %>
<slingn:adaptTo adaptable="${slingRequest}" adaptTo="com.adobe.training.core.ui.controllers.HtmlSource" var="model"/>
<%--<%@ page import="com.adobe.training.core.ui.controllers.HtmlSource" %>--%>


<%--<%--%>
    <%--HtmlSource htmlSource = new HtmlSource();--%>
    <%--htmlSource.getSource();--%>
<%--%>--%>

<%--soure <%=htmlSource.getSource()%>--%>

${model.source}
