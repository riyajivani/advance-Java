package riya;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<h2>Welcome to registered servlet.</h2>");
		
		String name=req.getParameter("username");
		String password=req.getParameter("userpassword");
		String email=req.getParameter("useremail");
		String gender=req.getParameter("usergender");
		String course=req.getParameter("usercourse");
		String cond=req.getParameter("condition");
		
		if(cond!=null )
		{
			out.println("<h3>name: "+name+"</h3>");
			out.println("<h3>password: "+password+"</h3>");
			out.println("<h3>email: "+email+"</h3>");
			out.println("<h3>gender: "+gender+"</h3>");
			out.println("<h3>course: "+course+"</h3>");
			
			//jdbc
			
			//saved sucessfully...
			
			RequestDispatcher rd=req.getRequestDispatcher("success");
			
			//include method 
			
			rd.forward(req,resp);
		}
				
		else
		{
			out.println("<h2>you have not accepted terms and conditions.</h2>");
			
			//want to include output of index.html
			//get the object  of request dispatcher
			
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			
			//include method 
			
			rd.include(req,resp);
		}
	}
	
}
