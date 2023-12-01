<%-- 
    Document   : Erro_Ex
    Created on : 22-May-2023, 11:17:49 am
    Author     : riyaj
--%>

<%@page import="java.lang.Exception"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry something went wrong</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="containre p-3 text-center" style="color: coral">
            <img src="image/404error.png" class="img-fluid"/>
            <h1 class="display-3">Sorry Page not found!</h1>
            <br>
            <a class="btn btn-outline-danger"  href="index.html">Back to Home</a>
        </div>
        </body>
</html>
