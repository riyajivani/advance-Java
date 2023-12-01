package riya;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet2 extends HttpServlet {

    public Servlet2() {
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
		
		//getting all the cookies...
		
		Cookie[] Cookies=request.getCookies();
		boolean f=false;
		String name="";
		
		if(Cookies==null)
		{
			out.println("<h1>you are new user..</h1>");
			return;
		}
		else
		{
			for(Cookie c:Cookies)
			{
				String tname=c.getName();
				if(tname.equals("username"))
				{
					f=true;
					name=c.getValue();
				}
			}
		}
		
		if(f) {
			out.println("<h1>Hello, "+name+" ...welcome back to my website...</h1>");  //here name is null because servlet 2 cant remember name from servlet 1
			out.println("THANK YOU");
		}
		else
		{
			out.println("<h1>you are new user..</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
