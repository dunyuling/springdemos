<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <script type="text/javascript"
            src="<%=request.getContextPath()%>/resources/js/jquery-1.11.3.min.js"></script>
    <script>
        $(function () {
            // postJsonForm();
            // postJsonRaw();
            // postXml();

            /*restMethod('get');
            restMethod('post');
            restMethod('put');
            restMethod('delete');
            restMethod('head');
            restMethod('options');
            restMethod('patch');*/
            restMethod('head');
        });
        
        function postJsonForm() {
            var url = "<%=request.getContextPath()%>/json_form.do";
            var user = {name:'a',age:2};
            $.post(url, user, function (data) {
                alert("postForm data: " + data)
            });
        }

        function postJsonRaw() {
            var url = "<%=request.getContextPath()%>/json_raw.do";
            var user = {name:'b',age:3};
            $.ajax({
                type: 'POST',
                url: url,
                data: JSON.stringify(user),
                contentType: "application/json",
                success: function(data) {
                    alert("postRaw data: " +　data)
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                    alert(errorThrown);
                }
            });
        }

        function postXml() {
            var url = "<%=request.getContextPath()%>/xml.do";

            var data = '<?xml version="1.0" encoding="UTF-8"?>\n' +
                '<Admin>\n' +
                '\t<name>aa</name>\n' +
                '\t<age>22</age>\n' +
                '</Admin>';

            $.ajax({
                type: 'POST',
                url: url,
                data: data,
                contentType: "application/xml",
                success: function(data) {
                    alert("postRaw data: " +　data)
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                    alert(errorThrown);
                }
            });
        }

        function restMethod(method) {
            var url = "<%=request.getContextPath()%>/subject/12345";
            $.ajax({
                type: method,
                url: url,
                success: function(data) {
                    alert("restMethod data: " +　data)
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                }
            });
        }
    </script>
</head>
<body>
hello index


<form method="post" action="<%=request.getContextPath() %>/json_form.do">
    <input type="text" name="name" value="lhg"/>
    <input type="text" name="age" value="2"/>
    <input type="submit" value="提交"/>
</form>


</body>
</html>