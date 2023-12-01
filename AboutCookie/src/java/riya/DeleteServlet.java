package riya;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");  
        PrintWriter out=resp.getWriter();  
        
        Cookie[] ck=req.getCookies();  
        
        
        for(int i=0;i<ck.length; i++)
        {
            ck[i]=null;
            resp.addCookie(ck[i]);
        }
        
        out.println("cokkie deleted");
        out.println("<a href='index.html'>login</a>");
    }

    
   }
