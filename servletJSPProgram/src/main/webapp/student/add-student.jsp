
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Add Student</h2><br>
    <form action="insert" method="post">
        <div>
            <label>Firstname</label>
            <input type="text" name="firstname"/>
        </div><br>
        <div>
            <label>Lastname</label>
            <input type="text" name="lastname"/>
        </div><br>
        <div>
            <label>Year Enrolled</label>
            <input type="text" name="yearEnrolled"/>
        </div><br>
        <button type="submit">Add</button>
    </form>
</body>
</html>
