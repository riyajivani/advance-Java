package riya;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FilterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
    {
            PrintWriter out = resp.getWriter();
            
            String name = (String) req.getParameter("name");
            String pass = (String) req.getParameter("password");
            
            out.println("servlet called.............");
            out.println("name: "+ name);
            out.println("password: "+ pass);
    }
}