/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lucy
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/user_registration";
    private static final String USER ="lucy";
    private static final String PASSWORD = "Password123#@!";
    
    public static Connection getConnection() throws Exception {
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              System.out.println("JDBC Driver loaded.");
              Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
              System.out.println("Connected to the database!");
              return conn;
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }   
}
