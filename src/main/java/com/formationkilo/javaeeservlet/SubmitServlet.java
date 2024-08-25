package com.formationkilo.javaeeservlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Set form data as request attributes
        request.setAttribute("name", name);
        request.setAttribute("email", email);

        // Forward to output.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("output.jsp");
        dispatcher.forward(request, response);
    }
}
