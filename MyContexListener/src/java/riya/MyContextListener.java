/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riya;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riyaj
 */
public class MyContextListener implements ServletContextListener{

    Connection con;
        
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        try 
        {
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MyContextListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        try {
            Class.forName("org.postgresql.Driver");
            
            String url="jdbc:postgresql://localhost:5432/firstjdbc";
            String username="postgres";
            String password="254222";
            
            con = DriverManager.getConnection(url,username,password);
            
            ServletContext ctx=sce.getServletContext();  
            ctx.setAttribute("mycon", con); 
                                
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(MyContextListener.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(MyContextListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
