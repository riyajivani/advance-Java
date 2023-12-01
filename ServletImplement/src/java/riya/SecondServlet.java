package riya;

import java.io.*;
import jakarta.servlet.*;
import java.sql.Date;

public class SecondServlet implements Servlet {
       
    public SecondServlet() 
    {
        super();
    }

    ServletConfig config;
    
	public void init(ServletConfig config) throws ServletException 
	{
		this.config=config;
		System.out.println("creating object..........");
	}

	public void destroy() 
	{
		System.out.println("going to destroy servlet object........");
	}

	public ServletConfig getServletConfig() 
	{
		return this.config;
	}

	public String getServletInfo() 
	{
		return "this servlet is created by reaa jivani..."; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("servicing......");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>this is from first servlet</h1>");
		out.println("<h1>date and time:"+new Date(0).toString()+" </h1>");
	}

}