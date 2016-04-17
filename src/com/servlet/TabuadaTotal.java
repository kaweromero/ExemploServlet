package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TabuadaTotal extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
					
		  out.println("<html>");
		  out.println("<body>");
		  out.println("<h1>Tabuada TOTAL</h1>");
		  out.println("<hr/>");
		  out.println("<table border='1px' >");
		  
		for(int i = 1;i<=10;i++){
			
			out.println("<tr>");
			
			for(int j = 1;j<=10;j++){
			out.println("<td>");	
			out.println(i+" x "+j+" = "+ i*j);
		    out.println("</td>");
		    
			}
			
			out.println("</tr>");
		}
		
		out.println("</table>");
	    out.println("</body>");
	    out.println("</html>");
		
		out.close();
		}
}
