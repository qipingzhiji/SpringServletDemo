<%--
  Created by IntelliJ IDEA.
  User: zhang_htao
  Date: 2019/8/20
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="fileUpload" method="post" enctype="multipart/form-data" >
        选择文件<input type="file" name="filename">
        <input type="submit" value="提交">
    </form>
</body>
</html>
