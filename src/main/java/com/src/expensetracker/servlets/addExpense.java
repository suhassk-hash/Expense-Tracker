package com.src.expensetracker.servlets;

import com.src.expensetracker.controllers.ExpensesController;
import com.src.expensetracker.model.Expense;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "addExpense", value = "/addExpense")
public class addExpense extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amount = request.getParameter("amount");
        String category = request.getParameter("category");
        String date = request.getParameter("date");
        String description = request.getParameter("description");

        ExpensesController ec = new ExpensesController();
        ec.addExpense(Float.parseFloat(amount), category, date, description);

        // Add the expense to the database

        response.sendRedirect("expenses.jsp");
    }
}