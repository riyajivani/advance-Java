<%-- 
    Document   : SpringJSTL
    Created on : 23-May-2023, 3:00:52 pm
    Author     : riyaj
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h5>Hello World!</h5>
        
        <c:set var="name" value="Reeaa"></c:set>
        <c:out value="${name}"></c:out>
        <h2>length of name is <c:out value="${fn:length(name)}"></c:out></h2>
        <br>
        <h2><c:out value="${fn:toUpperCase(name)}"></c:out></h2>
        <br>
        <h2><c:out value="${fn:contains(name,ea)}"></c:out></h2>
        
    </body>
</html>
