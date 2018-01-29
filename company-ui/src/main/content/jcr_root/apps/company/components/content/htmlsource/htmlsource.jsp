<%@include file="/apps/company/includes/baseglobal.jsp" %>
<slingn:adaptTo adaptable="${slingRequest}" adaptTo="com.adobe.training.core.ui.controllers.HtmlSource" var="model"/>

${properties.source}

${model.htmlSource}