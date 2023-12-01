package riya;
import java.sql.*;

public class ConnectionProvider {

	private static Connection con;
	
	public static Connection getConnection()
	{	
		try 
		{
			if(con==null)
			{
				Class.forName("org.postgresql.Driver");
		
				String url="jdbc:postgresql://localhost:5432/firstjdbc";
				String username="postgres";
				String password="254222";
		
				con = DriverManager.getConnection(url,username,password);
			}
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
}