/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riya;
import java.sql.*;
/**
 *
 * @author riyaj
 */
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