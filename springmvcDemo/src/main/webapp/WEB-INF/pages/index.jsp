<html>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=gb2312"%>
<meta http-equiv="Content-Type" content="text/html charset=gb2312">
<body>
<h2>Hello World!</h2>
<a href="test">hello</a><br/>
<a href="testSessionAttribute">testSessionAttribute</a><br/>
�����ڷ��ʵ���tomcat2������<br/>
sessionId: <%=  request.getSession().getId()  %><br/>

<a href="testView">testViewResolver</a>
<hr>
<br>

<form action="account" method="post">
    <input type="hidden" name="_method" value="put" />
    <input type="hidden" name="id" value="1" />
    ������<input type="text" name="userName" value="admin" />
    ���䣺<input type="text" name="age" value="13" />
    ���ڣ�<input type="text" name="birthday" value="1999-12-12" >
    н��: <input type="text" name="salary" value="1,222,221.2" >
    <input type="submit" value="�ύ" />
</form>
<br/>

<form action="convert" method="post">
    ������ <input type="text"  name="user" value="admin-66">
    <input type="submit" value="�ύ" >
</form>
<form action="animal" method="post">
    ����:<input type="text" name="name" value="22">
    ���䣺<input type="text" name="age" value="22">
    ���գ�<input type="text" name="birthDay" value="1994-03-15">
    <input type="submit" value="�ύ����">
</form>
</body>
</html>
