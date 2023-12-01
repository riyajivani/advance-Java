package riya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDatabase {

    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");

            String url="jdbc:postgresql://localhost:5432/firstjdbc";
            String username="postgres";
            String password="254222";

            connection = DriverManager.getConnection(url,username,password);

            // Task 1: Retrieve all records from the Student table
            retrieveAllRecords(connection);

            // Task 2: Insert a record (11, 83) into the Student table
            insertRecord(connection, 11, 83);

            // Task 3: Retrieve sid values where marks > 80
            retrieveRecordsWithMarksGreaterThan80(connection);

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            try 
            {
                if (connection != null) 
                {
                    connection.close();
                }
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
    // Task 1: Retrieve all records from the Student table
    private static void retrieveAllRecords(Connection connection) throws SQLException 
    {
        String query = "SELECT * FROM student_2c";
        PreparedStatement pstmt = connection.prepareStatement(query);

        ResultSet rs = pstmt.executeQuery();
        System.out.println("All records from student_2c table:");
        
        while (rs.next()) 
        {
            int sid = rs.getInt("sid");
            int smarks = rs.getInt("smarks");
            System.out.println("sid: " + sid + ", smarks: " + smarks);
        }
        rs.close();
        pstmt.close();
    }

    // Task 2: Insert a record (11, 83) into the Student table
    private static void insertRecord(Connection connection, int sid, int marks) throws SQLException 
    {
        String query = "INSERT INTO student_2c (sid, smarks) VALUES (?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, sid);
        pstmt.setInt(2, marks);

        int rowsAffected = pstmt.executeUpdate();
        System.out.println("Inserted " + rowsAffected + " record(s) into student_2c table.");
        pstmt.close();
    }

    // Task 3: Retrieve sid values where marks > 80
    private static void retrieveRecordsWithMarksGreaterThan80(Connection connection) throws SQLException 
    {
        String query = "SELECT sid FROM student_2c WHERE smarks > 80";
        PreparedStatement pstmt = connection.prepareStatement(query);

        ResultSet rs = pstmt.executeQuery();
        System.out.println("sid values where marks > 80:");
        while (rs.next()) {
            int sid = rs.getInt("sid");
            System.out.println("sid: " + sid);
        }
        rs.close();
        rs.close();
    }
}

