<%--
  Created by IntelliJ IDEA.
  User: sange
  Date: 09-07-2024
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expense-Tracker</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="username"> Username
            <input type="text" name="username" id="username">
        </label><br>
        <label for="password"> Password
            <input type="password" name="password" id="password">
        </label><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
