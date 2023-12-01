//package riya;
//
//import java.beans.Statement;
//import java.sql.*;
//
//public class TransactionTutorial {
//
//    public static void main(String[] args) throws SQLException {
//
//        try {
//            Connection c = ConnectionProvider.getConnection();
//            DatabaseMetaData mt = c.getMetaData();
//            System.err.println(mt.getDatabaseProductName());
//            
//            
//
//            PreparedStatement pstmt = c.prepareStatement(string)
//            try {
//                    c.setAutoCommit(false);
//
//                    stmt.addBatch("update student set sname='riya' where sid=4");
//                    stmt.addBatch("delete from student where sid=3");
//
//                    int[] count = stmt.executeBatch();
//
//                    int length = count.length;
//                    int i = 0;
//                    
//                    while (i < length) 
//                    {
//                        System.out.println(count[i]);
//                        i++;
//                    }
//                    c.commit();
//            } 
//            catch (Exception e)
//            {
//                c.rollback();
//            }
//        } 
//        catch (Exception e) 
//        {
//            e.printStackTrace();
//        }
//    }
//}


package riya;

import java.sql.*;

public class TransactionTutorial {

    public static void main(String[] args) throws SQLException {

        Connection c = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;

        try {
            c = ConnectionProvider.getConnection();
            DatabaseMetaData mt = c.getMetaData();
            System.err.println("Database Product Name: " + mt.getDatabaseProductName());

            c.setAutoCommit(false);

            
            String updateQuery = "UPDATE student SET sname = ? WHERE sid = ?";
            pstmt = c.prepareStatement(updateQuery);
            pstmt.setString(1, "Riya");
            pstmt.setInt(2, 4);
            pstmt.addBatch();

            String deleteQuery = "DELETE FROM student WHERE sid = ?";
            pstmt = c.prepareStatement(deleteQuery);
            pstmt.setInt(1, 3);
            pstmt.addBatch();

            int[] count = pstmt.executeBatch();

            int length = count.length;
            int i = 0;
                    
                    while (i < length) 
                    {
                        System.out.println(count[i]);
                        i++;
                    }
            c.commit();
        } 
        catch (Exception e)
            {
                c.rollback();
                e.printStackTrace();
            }
    }
}
