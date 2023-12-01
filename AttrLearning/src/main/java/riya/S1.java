package riya;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class S1 extends HttpServlet {

    public S1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		//out.println("<!DOCTYPE html>");
		//out.println("<html>");
		//out.println("<head>");
		//out.println("<title>Servlet S1</title>");
		//out.println("</head>");
		//out.println("<body>");
		
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		
		int sum=num1+num2;

		request.setAttribute("sum",sum);
		
		RequestDispatcher rd=request.getRequestDispatcher("S2");
		rd.forward(request,response);
		
		//out.println("</body>");
		//out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
