package com.miu.rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

        public static Connection initializeDatabase()
                throws SQLException, ClassNotFoundException {
            String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/carrental";
            String USER = "root";
            String PASS = "brocklife";
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        }
}
