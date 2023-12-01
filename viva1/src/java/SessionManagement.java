/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author riyaj
 */
public class SessionManagement extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String uname=req.getParameter("uname");
        String pass=req.getParameter("Pass");
        
        if(uname.equals("riya"))
        {
        HttpSession session =req.getSession(true);
        session.setAttribute("name", uname);
        resp.sendRedirect("UserServlet");
        }
        else{
             RequestDispatcher rd = req.getRequestDispatcher("index.html");
             rd.include(req, resp);
        }
    }

    
    
}