<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ola mundo</title>
</head>
<body>

     <h1>
            <%
                       
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
         
            %>
        </h1>
</body>
</html>