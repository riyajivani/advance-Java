<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: plum;">
        <h1>This is page 2!</h1>
        
        <%
            //redirection...
            
            response.sendRedirect("Page3.jsp");
        %>
    </body>
</html>
