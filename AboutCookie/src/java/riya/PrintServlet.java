package riya;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
      
        Cookie ck[]=req.getCookies();  
        String name=null;
        
        if(ck == null)
        {
            out.println("you are not logged in.");
            out.println("<a href='index.html'>login</a>");
        }
        else
        {
            for (Cookie c : ck) 
            {
                name = c.getValue();
                out.println("hello "+name);
                out.println("<a href='DeleteServlet'>delete cookie</a>");
            }
        }
    }
}
