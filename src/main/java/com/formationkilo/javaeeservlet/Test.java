package com.formationkilo.javaeeservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Test() {
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out=response.getWriter();
		//out.println("Bonjour");
		/*out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello from Servlet!</h1>");
		out.println("</body>");
		out.println("</html>");*/
		String message="Au revoir!";
		request.setAttribute("variable", message);
		
	    request.setAttribute("heure", "jour");
		this.getServletContext().getRequestDispatcher("/WEB-INF/page.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
