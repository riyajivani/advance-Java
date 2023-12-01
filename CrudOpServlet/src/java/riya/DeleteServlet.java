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
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        
        String id = req.getParameter("id");
        String name = req.getParameter("name");
            
        try{
            Connection c = Cruds.provideConnection();
            
            PreparedStatement pstmt = c.prepareStatement("delete from crudservlet where id=? and name=?");
            System.out.println("Connected with DB server-----------------------------============================");
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.setString(2, name);
            
            pstmt.executeUpdate();
            pstmt.close();
            c.close();
            
            out.println("<h3> deleted id: "+id+"</h3>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
