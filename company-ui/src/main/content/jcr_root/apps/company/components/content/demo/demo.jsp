<%@include file="/apps/company/includes/baseglobal.jsp" %>

${properties.demo}

<input type="button" id="hello-world2" value="Button" onclick="fun()"/>

<script type="text/javascript">
    function fun(){
debugger;
        alert("inside fun");
        $.ajax({
            url:"http://localhost:4502/bin/custom/path",
            type:"GET",
            success: function(data, textStatus, jqXHR){
                alert("success");
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
                alert("error");
            }
        });
    }

</script>