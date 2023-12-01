//in ths sql injection can not be performed.
package riya;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riyaj
 */
public class SqlInjectionTry{


    public static void main(String[] args) throws SQLException {

       try {
                Connection c = ConnectionProvider.getConnection();
                
                Scanner in=new Scanner(System.in);
                System.out.println("enter username:");
                String uname=in.nextLine();
                System.out.println("enter password:");
                String pwd=in.nextLine();
                                
                String s = "select * from login where username=? and password=?";
                
                PreparedStatement stmt = c.prepareCall(s);
                
                stmt.setString(1,uname);
                stmt.setString(2,pwd);
                ResultSet set = stmt.executeQuery();

                while(set.next())
                {
                    System.out.println("\n username: "+uname+" ,password: "+pwd);
                }
        }catch(SQLException ex) {
            Logger.getLogger(JdbcAwt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
