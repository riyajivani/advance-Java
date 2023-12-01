<%-- 
    Document   : login
    Created on : 13-Sep-2023, 11:13:35 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login page</title>
    </head>
    <body>
        
        <% 
            String username = request.getParameter("user");
            String password = request.getParameter("password");
            
            HttpSession mysession = request.getSession(true);
            
            mysession.setAttribute("username", username);
            mysession.setAttribute("password", password);
        
        %>
        
        <h3>hello, <%=username%> </h3><br>
        <a href="exam.jsp">exam page</a><br>
        <a href="logout.jsp">logout page</a><br>
        
    </body>
</html>
