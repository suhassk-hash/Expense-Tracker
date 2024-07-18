package com.src.expensetracker.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "test", value = "/test")
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page=request.getParameter("page").toLowerCase();
        switch(page){
            case "home":
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "listusers":
                request.getRequestDispatcher("listusers.jsp").forward(request, response);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + page);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}