package riya;

import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            ServletContext ctx=getServletContext();
            Connection con=(Connection)ctx.getAttribute("mycon");
            
            String q="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            
            while(set.next())
            {
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);
                
                out.println(name+" : id - "+id+" ,city - "+city);
                out.println("<br>");
            }
            
            System.out.println("value selected...");
        } catch (SQLException ex) {
            Logger.getLogger(Servlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
