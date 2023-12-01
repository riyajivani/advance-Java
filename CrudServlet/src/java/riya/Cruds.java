package riya;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cruds {
    
    private static Connection con;
    
    public static Connection provideConnection()
    {
        try 
		{
			if(con==null)
			{
				Class.forName("org.postgresql.Driver");
		
				String url="jdbc:postgresql://localhost:5432/firstjdbc";
				String username="postgres";
				String password="254222";
		
				con = (Connection) DriverManager.getConnection(url,username,password);
			}
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
    }
    
}