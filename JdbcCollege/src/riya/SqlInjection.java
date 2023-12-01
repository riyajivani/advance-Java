//in this method sql injection can be performed. 

package riya;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlInjection{

    public static void main(String[] args) throws SQLException {
        try {
                Connection c = ConnectionProvider.getConnection();
                
                Scanner in=new Scanner(System.in);
                System.out.println("enter username:");
                String uname=in.nextLine();
                System.out.println("enter password:");
                String pwd=in.nextLine();
          
                String s = "SELECT * FROM login WHERE username='"+uname+"' AND password ='"+pwd+"'"; // input: ' or ''='
                PreparedStatement stmt=c.prepareStatement(s);

                ResultSet rs=stmt.executeQuery();
                System.err.println(s);
                
                ResultSetMetaData rsmt=rs.getMetaData();
                System.err.println(rsmt.getColumnName(1));

                while(rs.next())
                {
                    String username=rs.getString(1);
                    String password=rs.getString(2);
				 
                    System.out.println(username+": "+username+" ,password : "+password);
                } 
        }catch(SQLException ex) {
                Logger.getLogger(JdbcAwt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}























