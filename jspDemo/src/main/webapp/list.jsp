<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>List Student</h2>
    <% String str[] = (String[]) request.getAttribute("studentsList"); %>

    <ul>
        <% for (String attr : str) { %>
        <li><%=attr%></li>
        <%}%>
    </ul>

</body>
</html>
