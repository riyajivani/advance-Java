<%-- 
    Document   : crud
    Created on : 04-Oct-2023, 11:04:08 am
    Author     : riyaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="jakarta.tags.sql"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crud</title>
    </head>
    <body>
        
        <a href="insert.html">insert data</a><br>
        <a href="delete.html">delete data</a><br>
        
        <sql:setDataSource driver="org.postgresql.Driver" user="postgres" password="254222" url="jdbc:postgresql://localhost:5432/firstjdbc" var="ds"/>
        <sql:query dataSource="${ds}" var="rs">select * from student;</sql:query>
        
        <table border="2" width="100%">  
            <tr>  
                <th>Student ID</th>  
                <th>Student Name</th>
                <th>Student Dept</th>
            </tr>  
            
            <c:forEach items="${rs.rows}" var="row">
                <tr style="text-align: center">
                <td><c:out value="${row.sid}"></c:out></td>
                <td><c:out value="${row.sname}"></c:out></td>
                <td><c:out value="${row.sdept}"></c:out></td>
                </tr>
            </c:forEach>
        </table>  
    
    </body>
</html>
