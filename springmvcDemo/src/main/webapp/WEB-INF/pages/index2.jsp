<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=gb2312"%>
<meta http-equiv="Content-Type" content="text/html charset=gb2312">
<body>
<h2>Hello World!</h2>


<form action="animal" method="post">
    姓名:<input type="text" name="name" value="22">
    年龄：<input type="text" name="age" value="22">
    生日：<input type="text" name="birthDay" value="1994-03-15">
    <input type="submit" value="提交更改">
</form>
<br/>
<hr/>

<form action="testValidate" method="post">
    姓名:<input type="text" name="name" ><br>
    年龄：<input type="text" name="age" value="22"><br>
    生日：<input type="text" name="birthDay" value="1994-03-15"><br>
    <input type="submit" value="提交更改">
</form>


</body>
</html>
