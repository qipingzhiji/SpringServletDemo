<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${empty requestScope.employees}">
        没有任何信息
    </c:if>
    <c:if test="${! empty requestScope.employees}">
        <table>
            <tr>
                <th>
                    employee_id
                </th>
                <th>first_name</th>
                <th>last_name</th>
                <th>email</th>
                <th>phone_number</th>
                <th>job_id</th>
                <th>salarys</th>
                <th>commission_pct</th>
            </tr>
            <c:forEach items="${requestScope.emps}" var="emp">
                <tr>
                    <td>${emp.employee_id}</td>
                    <td>${emp.first_name}</td>
                    <td>${emp.last_name}</td>
                    <td>${emp.email}</td>
                    <td>${emp.phone_number}</td>
                    <td>${emp.job_id}</td>
                    <td>${emp.salarys}</td>
                    <td>${emp.commission_pct}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
