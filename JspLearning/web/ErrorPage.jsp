<%@page errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }
    </style>
    
    <body>
            <%!
                int a=100;
                int b=0;
            %>
            
            <%
                int division=a/b;
            %>
            
            <h1>Division = <%= division%></h1>
    </body>      
</html>