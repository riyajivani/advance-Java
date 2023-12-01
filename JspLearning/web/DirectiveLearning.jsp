<%-- 
    Document   : DirectiveLearning
    Created on : 16-May-2023, 11:38:37 am
    Author     : riyaj
--%>

<%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>
<%@page isErrorPage="true" %>
<%@include file="Header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        *{
            margin: 0px;
            padding: 0px;
        }
    </style>
    </head>
    
    
    <body>
        <h1>Random number: </h1>
        <%
            Random r = new Random();
            int n=r.nextInt(10);
            out.print(n);
        %>
        
        <br>
        <c:set var="name" value="Riya"></c:set>
        
        <c:out value="${name}"></c:out>
        
        <c:if test="${2<3}"> <!-- if condition is false then nothing will print -->
            <h2>this is true block... </h2>
        </c:if>
    </body>
</html>
