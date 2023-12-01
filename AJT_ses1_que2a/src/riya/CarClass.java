package riya;

import java.sql.*;
import org.postgresql.core.TransactionState;

public class CarClass {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        try
        {
            Class.forName("org.postgresql.Driver");

            String url="jdbc:postgresql://localhost:5432/firstjdbc";
            String username="postgres";
            String password="254222";

            Connection con = DriverManager.getConnection(url,username,password);
            Statement s = con.createStatement();
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            try
            { 
                con.setAutoCommit(false);
                s.addBatch("INSERT INTO car VALUES(1,'eco-sport',500000.00"); 
                s.addBatch("INSERT INTO car VALUES(2,'venue',700000.00"); 
                s.addBatch("INSERT INTO car VALUES(3,'nexon',800000.00"); 
                int[ ] count = s.executeBatch( ); 
                con.commit( ); 
                
            }
            catch(SQLException e)
            { 
                con.rollback( ); 
            } 
            finally
            { 
                con.close( );
                s.close( );
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
