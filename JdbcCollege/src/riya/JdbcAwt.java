package riya;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcAwt extends Frame implements ActionListener {

    Label l1, l2;
    Button b;
    TextField t1, t2, t3;

    JdbcAwt() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setForeground(Color.BLACK);

        t1 = new TextField();
        add(t1);

        b = new Button("get information");
        add(b);

        b.addActionListener(this);

        l1 = new Label("name");
        add(l1);

        t2 = new TextField();
        add(t2);

        l2 = new Label("Department");
        add(l2);

        t3 = new TextField("");
        add(t3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b) {
                Connection c = ConnectionProvider.getConnection();
                int x = Integer.parseInt(t1.getText());

                String s = "select * from student where sid=" +x;
                Statement stmt = c.createStatement();
                ResultSet set = stmt.executeQuery(s);
                set.next();
                String name = set.getString(2);
                String dept = set.getString(3);

                t2.setText(name);
                t3.setText(dept);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JdbcAwt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {

        JdbcAwt jd = new JdbcAwt();
    }
}
