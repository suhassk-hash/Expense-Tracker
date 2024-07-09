package com.src.expensetracker.servlets;

import com.src.expensetracker.controllers.LoginController;
import com.src.expensetracker.exceptions.UserNotFoundException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("login".equals(action)) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Login logic here
        LoginController lc = new LoginController();
        try {
            boolean isAuthenticated = lc.login(username, password);
            if (isAuthenticated) {
                response.sendRedirect("dashboard.jsp");
            } else {
                response.sendRedirect("/login?action=login");
            }
        } catch (UserNotFoundException e) {
            response.sendRedirect("/login?action=login");
        }
    }
}
