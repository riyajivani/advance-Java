<%-- 
    Document   : ShowUser
    Created on : 23-May-2023, 3:14:43 pm
    Author     : riyaj
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!-- getting this link from documantation materialize site -->
 <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    
    </head>
    <body>
        <h3>all users are!</h3>
        
        <sql:setDataSource driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/firstjdbc" user="postgres" password="254222" var="ds"></sql:setDataSource>
        <sql:query dataSource="${ds}" var="rs">select * from regform;</sql:query>
        
        
        <table class="highlight centered" style="color: #f8bbd0; background: #880e4f;">
            <thead>
              <tr>
                  <th>User Id</th>
                  <th>User Name</th>
                  <th>User Email</th>
              </tr>
            </thead>

            <tbody>
                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.id}"></c:out></td>
                        <td><c:out value="${row.name}"></c:out></td>
                        <td><c:out value="${row.email}"></c:out></td>
                    </tr>
                </c:forEach> 
            </tbody>
      </table>
    
    </body>
</html>
