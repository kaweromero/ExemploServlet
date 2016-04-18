package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Headers extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Headers<hr/>");
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table border='1px'>");
		
		while (headerNames.hasMoreElements()) {
			 out.println("<tr>");
			String headerName = headerNames.nextElement();
			
			out.println("<td>");
			out.print("Nome do Header: <em>" + headerName);
			String headerValue = request.getHeader(headerName);
			out.println("</td>");
			out.println("<td>");
			out.print("</em>   Valor do Header: <em>" + headerValue);
			out.println("</em><br/>");
			out.println("</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
	}
}
