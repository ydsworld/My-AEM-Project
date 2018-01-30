<%@include file="/apps/company/includes/baseglobal.jsp" %>
<slingn:adaptTo adaptable="${slingRequest}" adaptTo="com.adobe.training.core.ui.controllers.HtmlSource" var="model"/>

${model.htmlSource}

<%--<input type="button" id="hello-world2" value="Button" onclick="fun()"/>--%>

<%--<script type="text/javascript">--%>
    <%--function fun(){--%>
<%--debugger;--%>
        <%--alert("inside fun");--%>
        <%--$.ajax({--%>
            <%--url:'/bin/custom/path',--%>
            <%--type:"POST",--%>
            <%--success: function(data, textStatus, jqXHR){--%>
                <%--alert("success");--%>
            <%--},--%>
            <%--error: function(XMLHttpRequest, textStatus, errorThrown) {--%>
                <%--alert("error");--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>

<%--</script>--%>