<html>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=gb2312"%>
<meta http-equiv="Content-Type" content="text/html charset=gb2312">
<body>
<h2>Hello World!</h2>
<a href="test">hello</a><br/>
<a href="testSessionAttribute">testSessionAttribute</a><br/>
你现在访问的是tomcat2服务器<br/>
sessionId: <%=  request.getSession().getId()  %><br/>

<a href="testView">testViewResolver</a>
<hr>
<br>

<form action="account" method="post">
    <input type="hidden" name="_method" value="put" />
    <input type="hidden" name="id" value="1" />
    姓名：<input type="text" name="userName" value="admin" />
    年龄：<input type="text" name="age" value="13" />
    日期：<input type="text" name="birthday" value="1999-12-12" >
    薪资: <input type="text" name="salary" value="1,222,221.2" >
    <input type="submit" value="提交" />
</form>
<br/>

<form action="convert" method="post">
    姓名： <input type="text"  name="user" value="admin-66">
    <input type="submit" value="提交" >
</form>
<form action="animal" method="post">
    姓名:<input type="text" name="name" value="22">
    年龄：<input type="text" name="age" value="22">
    生日：<input type="text" name="birthDay" value="1994-03-15">
    <input type="submit" value="提交更改">
</form>
</body>
</html>
