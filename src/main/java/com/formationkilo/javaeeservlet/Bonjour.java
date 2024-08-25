package com.formationkilo.javaeeservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/FormBonjour")
public class Bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Bonjour() {
       
    }


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String nom=request.getParameter("nom");
	  request.setAttribute("nom", nom);
	  this.getServletContext().getRequestDispatcher("/bonjour.jsp").forward(request, response);
	}

}
