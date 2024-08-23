package com.formationkilo.javaeeservlet;


import java.io.IOException;



import com.formationkilo.javaeeservlet.beans.Auteur;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Home() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		
		request.setAttribute("name", name);
		
		String [] noms= {"Elysa","Robert","Marion"};
		request.setAttribute("noms", noms);
		
		Auteur auteur=new Auteur("BEBY","Bonevy",true);
		request.setAttribute("auteur", auteur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
