
package riya;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AwtCrud {
    private static Connection connection;

    public static void main(String[] args) {
        connection = ConnectionProvider.getConnection();

        Frame frame = new Frame();
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField(20);
        
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField(20);
        
        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField(20);

        Button createButton = new Button("Create");
        Button readButton = new Button("Read");
        Button updateButton = new Button("Update");
        Button deleteButton = new Button("Delete");

        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                createRecord(name, email, phone);

                nameField.setText("");
                emailField.setText("");
                phoneField.setText("");
            }
        });

        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readRecords();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                updateRecord(name, email, phone);

                nameField.setText("");
                emailField.setText("");
                phoneField.setText("");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();

                deleteRecord(name);

                nameField.setText("");
                emailField.setText("");
                phoneField.setText("");
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(createButton);
        frame.add(readButton);
        frame.add(updateButton);
        frame.add(deleteButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                closeDatabaseConnection();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private static void connectToDatabase() {
        try {
            Class.forName("org.sqlite.JDBC"); // Load the SQLite JDBC driver
            connection = DriverManager.getConnection("jdbc:sqlite:contacts.db"); // Change the JDBC URL as needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void closeDatabaseConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createRecord(String name, String email, String phone) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO contacts(name, email, phone) VALUES (?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readRecords() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contacts");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");

                System.out.println("Name: " + name + ", Email: " + email + ", Phone: " + phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateRecord(String name, String email, String phone) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE contacts SET email=?, phone=? WHERE name=?");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, phone);
            preparedStatement.setString(3, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteRecord(String name) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM contacts WHERE name=?");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

