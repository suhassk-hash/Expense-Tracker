<%@ page import="com.src.expensetracker.controllers.ExpensesController" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<header>
    <h1>Expense Tracker Dashboard</h1>
    <nav>
        <ul>
            <li><a href="addExpense.jsp">Add Expense</a></li>
            <li><a href="viewExpenses.jsp">View Expenses</a></li>
            <li><a href="logout">Logout</a></li>
        </ul>
    </nav>
</header>

<section class="Expenses">
    <h3>Your Previous Expenses can be found here</h3>
    <%
        ExpensesController ec=new ExpensesController();
        String[] expenses=ec.getExpenses();
        for(int i=0;i<expenses.length;i++){%>
    <li>   <%=expenses[i] %>    </li>
    <%
        }
    %>
</section>
<section id="summary">
    <h2>Summary</h2>
</section>


<footer>
    <p>&copy; 2024 Expense Tracker</p>
</footer>
</body>
</html>
