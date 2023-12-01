package riya;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet1 extends HttpServlet {

    public Servlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet S1</title>");
		out.println("</head>");
		out.println("<body>");
		
		String name=request.getParameter("name");
		out.println("<h1>Hello, "+name+" ...welcome to my website...</h1>");
		out.println("<h1><a href='Servlet2'>GO TO SERVLET 2</a></h1>");
		
		
		//adding cookie to avoid null value of name in servlet 2
		
		Cookie c = new Cookie("username",name);  //only store riya from riya jivani ...cant store space character can store underscore
		response.addCookie(c);
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
