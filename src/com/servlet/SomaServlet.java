package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomaServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String operador1 = request.getParameter("operador1");
		String operador2 = request.getParameter("operador2");
		String operador3 = request.getParameter("operador3");
		int int1 = Integer.parseInt(operador1);
		int int2 = Integer.parseInt(operador2);
		int int3 = Integer.parseInt(operador3);
		
		int result = int1 + int2 + int3;
		
		PrintWriter out = response.getWriter();
		
		
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Resultado da soma</h1>");
	    out.println("<hr/>");
	    out.println("O resultado é : "+result);
	    out.println("</body>");
	    out.println("</html>");
		
		out.close();
	}

}
