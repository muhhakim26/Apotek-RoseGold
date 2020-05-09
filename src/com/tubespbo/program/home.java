/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubespbo.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Muhammad Abdul Hakim
 */
public class home {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/apotek_rosegold";
            String user = "root";
            String pas = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String pass = null;
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.out.println("Gagal Koneksi ke Database" + e.getMessage());
        }
        return MySQLConfig;
            
    }
    
}
