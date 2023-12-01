<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>First jsp page..</h1>
        
        <%!
            int a=5;
            int b=10;
            
            String name="Riya";
            
            public int doSum()
            {
                return a+b;            
            }

               public String Reverse()
               {
                    StringBuffer br=new StringBuffer(name);
                       return br.reverse().toString();
               }

        %>
        
        <%
            out.println(a);
            out.println("<br>");
            out.println(b);
            out.println("<br>");
            out.println("sum is : "+doSum());
            out.println("<br>");
            out.println("String is : "+name);
            out.println("<br>");
            out.println("Reverse of string is : "+Reverse());
            out.println("<br>"); 
        %>
        
        <h1> sum is: <%= doSum()%></h1>
    </body>
</html>
