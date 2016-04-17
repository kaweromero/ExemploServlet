package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TabuadaUser  extends HttpServlet{

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String numeroUser = request.getParameter("tabu");
	PrintWriter out = response.getWriter();
	int numeUser = Integer.parseInt(numeroUser);
		
	  out.println("<html>");
	  out.println("<body>");
	  out.println("<h1>Resultado da Tabuada</h1>");
	  
	for(int i = 1;i<=10;i++){
		
		out.println(i+" x "+numeUser+" = "+ i*numeUser);
	    out.println("<hr/>");
		
	}
	
    out.println("</body>");
    out.println("</html>");
	
	out.close();
	}
}
