<%-- 
    Document   : myJsp
    Created on : 13-Sep-2023, 11:02:04 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>my JSP Page</title>
    </head>
    <body>
        
        <%! int number; %>
        
        <% number++; %>
        
        <h3>this jsp page is visited for the <%= number%> of time.</h3>
    </body>
</html>
