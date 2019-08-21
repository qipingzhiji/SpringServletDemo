<%--
  Created by IntelliJ IDEA.
  User: zhang_htao
  Date: 2019/8/13
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h2>hello world! =====> success</h2>
request--> userInfo: ${requestScope.user} <br/>
session--> userInfo: ${ sessionScope.user}
</body>
</html>
