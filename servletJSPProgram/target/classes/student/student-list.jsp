<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Students</h2>
    <br>
<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Year enrolled</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.firstname}"/></td>
                <td><c:out value="${student.lastname}"/></td>
                <td><c:out value="${student.yearEnrolled}"/></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
