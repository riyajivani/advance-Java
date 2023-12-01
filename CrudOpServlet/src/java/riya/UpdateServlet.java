/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package riya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author riyaj
 */
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        String id = req.getParameter("id");
        String new_name = req.getParameter("name");
        String new_password = req.getParameter("password");
            
        try{
            Connection c = Cruds.provideConnection();
            
            PreparedStatement pstmt = c.prepareStatement("update crudservlet set name=?, password=? where id=?");
            System.out.println("Connected with DB server-----------------------------============================");
            pstmt.setString(1, new_name);
            pstmt.setString(2, new_password);
            pstmt.setInt(3, Integer.parseInt(id));
            
            
            pstmt.executeUpdate();
            pstmt.close();
            c.close();
            
            out.println("<h3>id: "+id+"</h3>");
            out.println("<h3>name: "+new_name+"</h3>");
            out.println("<h3>password: "+new_password+"</h3>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
