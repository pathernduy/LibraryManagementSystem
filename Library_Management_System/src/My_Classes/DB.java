/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HOME
 */
public class DB {
   
    
    public static Connection getConnection(){
        Connection conn = null;
        
        Statement st = null;
        //ResultSet rs = null;
        try {
        String dbURL = "jdbc:mysql://localhost:3307/library";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
             System.out.println("Kết nối thành công");
            }
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
