package com.greatlearning.designpatter1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //private static Connection con ;
    private static Connection con;

    static
    {
        String url = "jdbc:mysql://localhost:3306/database";
        String user = "root";
        String pass = "root";
        try {
            //Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/database", "root", "root");
        }
        catch ( SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}