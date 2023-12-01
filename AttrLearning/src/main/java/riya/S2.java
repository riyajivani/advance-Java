package riya;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class S2 extends HttpServlet {

    public S2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		PrintWriter out=response.getWriter();
		//out.println("<!DOCTYPE html>");
		//out.println("<html>");
		//out.println("<head>");
		//out.println("<title>Servlet S2</title>");
		//out.println("</head>");
		//out.println("<body>");
	
		int num1=Integer.parseInt(request.getParameter("n1"));
		int num2=Integer.parseInt(request.getParameter("n2"));
		
		int p=num1*num2;
		
		int sum=(int)request.getAttribute("sum");
		
		out.println("Sum is: "+sum);
		out.println("Product is: "+p);
		
		//out.println("</body>");
		//out.println("</html>");

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
