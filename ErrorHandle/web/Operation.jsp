<%-- 
    Document   : Operation
    Created on : 22-May-2023, 11:06:19 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="Error_ex.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //fetch two number
            
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            
            //converting in integer

            int a=Integer.parseInt(n1);
            int b=Integer.parseInt(n2);
            
            int c=a/b;
            
            %>
            
            <h1>division is: <%= c%></h1>
                
    </body>
</html>
