package riya;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {

    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet S1</title>");
		out.println("</head>");
		out.println("<body>");
		
		//getting all the incoming values.....
		
		String name=request.getParameter("username");
		String password=request.getParameter("userpassword");
		String email=request.getParameter("useremail");
		
		out.println(name);
		out.println(password);
		out.println(email);
		
		//connection.........
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/postgres","postgres","254222");
			
			//query........
			
			String q="insert into regform(name,password,email) values(?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1,name);
			pstmt.setString(2,password);
			pstmt.setString(3,email);
			
			pstmt.executeUpdate();
			
			out.println("<h1>done........</h1>");
			
		}catch(Exception e) 
		{
			e.printStackTrace();
			out.println("<h1>error........</h1>");
		}
		
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
