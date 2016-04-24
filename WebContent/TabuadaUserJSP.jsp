<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabuada JSP</title>
</head>
<body>

  <%

  	String numeroUser = request.getParameter("tabu");
	
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
  
  %>

</body>
</html>