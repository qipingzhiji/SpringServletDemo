<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=gb2312"%>
<meta http-equiv="Content-Type" content="text/html charset=gb2312">
<body>
<h2>Hello World!</h2>


<form action="animal" method="post">
    ����:<input type="text" name="name" value="22">
    ���䣺<input type="text" name="age" value="22">
    ���գ�<input type="text" name="birthDay" value="1994-03-15">
    <input type="submit" value="�ύ����">
</form>
<br/>
<hr/>

<form action="testValidate" method="post">
    ����:<input type="text" name="name" ><br>
    ���䣺<input type="text" name="age" value="22"><br>
    ���գ�<input type="text" name="birthDay" value="1994-03-15"><br>
    <input type="submit" value="�ύ����">
</form>


</body>
</html>
