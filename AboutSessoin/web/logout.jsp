<%-- 
    Document   : logout
    Created on : 13-Sep-2023, 11:13:50 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout Page</title>
    </head>
    <body>
        
        <%
            HttpSession mysession = request.getSession(false);
            
            if(mysession.isNew()) 
            {
                out.println("You are not logged in.");
                
            } 
            else
            {
                mysession.invalidate();
                out.println("Logout successful.");
            }
        %>
        
        <a href="login.html">login page</a><br>
        
        
    </body>
</html>
