<%-- 
    Document   : delete
    Created on : 04-Oct-2023, 11:42:05 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="jakarta.tags.sql"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% int sid = Integer.parseInt(request.getParameter("sid"));%>
        
        <sql:setDataSource driver="org.postgresql.Driver" user="postgres" password="254222" url="jdbc:postgresql://localhost:5432/firstjdbc" var="ds"/>
        <sql:update dataSource="${ds}" var="rs">
            delete from student where sid=?;
            <sql:param value="<%=sid%>"></sql:param>
        </sql:update>
            
        <h3>data deleted</h3><br>
        <a href="view.jsp">view data</a>
    </body>
</html>
