package riya;

import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{  
  
        try{
            response.setContentType("text/html");  
            PrintWriter out = response.getWriter();  

            HttpSession session=request.getSession(false);  
            String n=(String)session.getAttribute("uname");  
            out.print("Hello "+n);  

            out.close();  

        } 
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}  