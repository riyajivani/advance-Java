package SourcePackage;

import java.sql.*;
import java.io.*;

public class UpdateTableJdbc {

	public static void main(String[] args) 
	{
		try
		{
			//Connection c =ConnectionProvider.getConnection();
			
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/firstjdbc";
			String username="postgres";
			String password="254222";
	
			Connection c=DriverManager.getConnection(url,username,password);
			
			String q="update table1 set tname=? , tcity=? where tid=?";
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter new name: ");
			String name=br.readLine();

			System.out.println("Enter new city: ");
			String city=br.readLine();
			
			System.out.println("Enter id: ");
			int id=Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt=c.prepareStatement(q);
		
			//set the values to query
	
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			
			pstmt.setInt(3,id);
			
			pstmt.executeUpdate();

			System.out.println("value updated...");

			c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
