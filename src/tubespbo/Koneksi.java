/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;

/**
 *
 * @author irsya
 */

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    public Connection koneksi() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kereta", "root","");
        
        return conn;
    }
}
