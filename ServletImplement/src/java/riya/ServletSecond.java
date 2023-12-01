package riya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.*;

public class ServletSecond extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("servicing......");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>this is from second servlet</h1>");
		out.println("<h1>date and time:"+new Date(0).toString()+" </h1>");
	}

}