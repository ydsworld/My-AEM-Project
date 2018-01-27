<%@include file="/libs/foundation/global.jsp"%>
<%@page session="false" contentType="text/html; charset=utf-8"%>
<%@page import="com.day.cq.i18n.I18n" %>
<%@page import="com.day.cq.wcm.foundation.forms.FormsHelper"%>
<%@page import="com.day.cq.wcm.foundation.forms.FormsConstants"%>
<%@ page import="com.day.cq.wcm.api.WCMMode" %>
<%@taglib prefix="dpcommon" uri="http://www.nni.com/taglibs/dpcommon/1.0" %>
<%-- <%@taglib prefix="slingn" uri="http://sling.apache.org/taglibs/sling" %> --%>
<%
// Add Page Component specific include code
String suffix = slingRequest.getRequestPathInfo().getSuffix();
String[] selectors= slingRequest.getRequestPathInfo().getSelectors(); 
%>

<%
    WCMMode mode = WCMMode.fromRequest(request);
    pageContext.setAttribute("WCMMode",mode.toString(),PageContext.PAGE_SCOPE);
%>


