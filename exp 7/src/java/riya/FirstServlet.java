package riya;

import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
  
  
public class FirstServlet extends HttpServlet {  
  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
            try (PrintWriter out = response.getWriter()) {
                String n=request.getParameter("userName");
                out.print("Welcome "+n);
                
                HttpSession session=request.getSession();
                session.setAttribute("uname",n);
                
                out.print("<a href='servlet2'>visit</a>");
            }  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
} 