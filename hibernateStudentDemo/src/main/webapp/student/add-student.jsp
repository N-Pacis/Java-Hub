
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${student != null}">
    <h2>Edit Student</h2><br>
    <form action="update" method="post">
    </c:if>
    <c:if test="${student == null}">
        <h2>Add Student</h2><br>
        <form action="insert" method="post">
    </c:if>
            <c:if test="${student !=null}">
                <input hidden type="text" name="id" value="<c:out value='${student.id}'/>"/>
            </c:if>
        <div>
            <label>Firstname</label>
            <input type="text" name="firstname" value="<c:out value='${student.firstname}'/>"/>
        </div><br>
        <div>
            <label>Lastname</label>
            <input type="text" name="lastname" value="<c:out value='${student.lastname}'/>"/>
        </div><br>
        <div>
            <label>Year Enrolled</label>
            <input type="text" name="yearEnrolled" value="<c:out value='${student.yearEnrolled}'/>"/>
        </div><br>
        <div>
            <label>Gender</label>
            <input type="radio" name="gender" value="MALE" checked="<c:out value='${student.gender == "MALE"}'/>"/> &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" value="FEMALE" checked="<c:out value='${student.gender == "FEMALE"}'/>"/>
        </div><br>
        <button type="submit">Add</button>
    </form>
</body>
</html>
