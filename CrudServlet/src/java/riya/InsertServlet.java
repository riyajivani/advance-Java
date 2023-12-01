package riya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
            
        try{
            Connection c = Cruds.provideConnection();
            
            PreparedStatement pstmt = c.prepareStatement("insert into crudservlet values(?, ?, ?)");
            System.out.println("Connected with DB server-----------------------------============================");
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.setString(2, name);
            pstmt.setString(3, password);
            
            pstmt.executeUpdate();
            pstmt.close();
            c.close();
            
            out.println("<h3>id: "+id+"</h3>");
            out.println("<h3>name: "+name+"</h3>");
            out.println("<h3>password: "+password+"</h3>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}




















