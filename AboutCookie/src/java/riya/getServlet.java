package riya;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class getServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
    
        String username =req.getParameter("user");

        Cookie ck=new Cookie("uname",username);  
        resp.addCookie(ck);
        
        RequestDispatcher rd = req.getRequestDispatcher("PrintServlet");
        rd.forward(req, resp);    
    }

    
}
