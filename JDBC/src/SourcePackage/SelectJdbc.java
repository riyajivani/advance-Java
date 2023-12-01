package SourcePackage;

import java.sql.*;

public class SelectJdbc {

	public static void main(String[] args) 
	{
		try
		{
			Connection c =ConnectionProvider.getConnection();
			
			String q="select * from table1";
			
			Statement stmt=c.createStatement();
		
			//set the values to query
	
			 ResultSet set = stmt.executeQuery(q);
			 
			 while(set.next())
			 {
				 int id=set.getInt(1);
				 String name=set.getString(2);
				 String city=set.getString(3);
				 
				 System.out.println(name+" : id - "+id+" ,city - "+city);
				 
			 }

			System.out.println("value selected...");

			c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
