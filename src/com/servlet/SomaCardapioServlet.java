package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomaCardapioServlet  extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String[] pedidos = request.getParameterValues("order");
		int result=0;
				
		PrintWriter out = response.getWriter();
		
		for(String pedi: pedidos){
			
			result = result + Integer.parseInt(pedi);
			
		}
		
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Conta</h1>");
	    out.println("<hr/>");
	    out.println("O valor de sua conta é : "+result);
	    out.println("</body>");
	    out.println("</html>");
		
		out.close();
	}
	
}
