<%--
  Created by IntelliJ IDEA.
  User: sange
  Date: 09-07-2024
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expense-Tracker</title>
</head>
<body>
    <form action="addExpense" method="post">
        <label for="amount">Amount</label>
        <input type="text" id="amount" name="amount"><br>
        <label for="category">Category</label>
        <input type="text" id="category" name="category"><br>
        <label for="date">Date</label>
        <input type="date" id="date" name="date"><br>
        <label for="description">Description</label>
        <input type="text" id="description" name="description"><br>
        <input type="submit" value="Add Expense">
    </form>
</body>
</html>
