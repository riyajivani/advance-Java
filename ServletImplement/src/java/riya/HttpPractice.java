package riya;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HttpPractice extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		System.out.println("We are in GET method......");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>this is get method from servlet</h1>");
	}
	
}