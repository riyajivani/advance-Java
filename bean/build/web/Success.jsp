<%-- 
    Document   : Success
    Created on : 27-Sep-2023, 11:12:48 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <jsp:useBean id="bean" scope="request" class="riya.UserBean">
        <jsp:setProperty name="bean" property="*"/>
        </jsp:useBean>

        
       <h1>User Details</h1>

        <h3>Username: <jsp:getProperty name="bean" property="uname" /></h3>
        <h3>Password: <jsp:getProperty name="bean" property="pass" /></h3>

    </body>
</html>
