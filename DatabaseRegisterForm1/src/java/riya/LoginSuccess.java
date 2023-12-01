package riya;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class LoginSuccess extends HttpServlet{
    
    Connection c;
    PreparedStatement pstmt;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
            String name = req.getParameter("user");
            String password = req.getParameter("password");
            String rpassword = req.getParameter("Rpassword");
            
        try{
             c = ConnectionProvider.getConnection();
            System.out.println("Connected with DB server-----------------------------============================");
            pstmt = c.prepareStatement("insert into servletlogin values(?, ?, ?)");
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            pstmt.setString(3, rpassword);
            
            pstmt.executeUpdate();
            pstmt.close();
            c.close();
            
            out.println("<h3>name: "+name+"</h3>");
            out.println("<h3>password: "+password+"</h3>");
            out.println("<h3>rpasswore: "+rpassword+"</h3>");
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
            out.println("<h3>Error: " + ex.getMessage() + "</h3>");
        }
    }
    
    
}
