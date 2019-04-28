<%--
  Created by IntelliJ IDEA.
  User: liux
  Date: 19-4-28
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/viewAll" method="post">
    用户名: <input type="text" name="name" value="用户名111" /><br/>
    密码:<input type="password" name="password" value="222"/><br/>
    <input type="submit" value="登录" />
</form>
</body>
</html>
