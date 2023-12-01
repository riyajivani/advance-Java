<%-- 
    Document   : exam
    Created on : 13-Sep-2023, 11:13:42 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>exam Page</title>
    </head>
    <body>
        <%
//            PrintWriter out = req.getWriter();
            HttpSession mysession = request.getSession(false);
            if (mysession.isNew())
            {
                out.println("login first to view this page.");
                out.println("<a href='login.html'>login page</a><br>");
            }
            else
            {
                out.println("you are registered user that's why you can view this page.");
                out.println("this is the exam jsp.");   
            }     
        %>

    </body>
</html>
