<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry...something went wrong!!</title>
        
        
         <style>
        *{
            padding: 0px;
            margin: 0px;
        }
        </style>
    
    </head>
    
   
    <body>
        <div style="padding: 20px; color: blue; background: #ccccff;">
            <h1>Sorry...something went wrong!!</h1><br>
            <p><%= exception %></p>
        </div>
    </body>
</html>
