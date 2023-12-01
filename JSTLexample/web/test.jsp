<%-- 
    Document   : test
    Created on : 23-May-2023, 2:27:13 pm
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>this is testing..!</h1>
        
        <h1><c:out value="${i}"></c:out></h1>  <!--the value of i can be fetched here with the help of scope-->
        
    </body>
</html>
