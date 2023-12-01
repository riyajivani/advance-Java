<%-- 
    Document   : Try
    Created on : 09-Oct-2023, 9:32:43 pm
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:formatNumber type="number" pattern="###.###E0" value="9500.587"></fmt:formatNumber><br>
        ${fn:containsIgnoreCase("Riya I am","riya")};<br>
        ${fn:escapeXml("<h1>Hii</h1>")}
        
        <%-- hii jspp --%>
        <!--hii html -->
    </body>
</html>
