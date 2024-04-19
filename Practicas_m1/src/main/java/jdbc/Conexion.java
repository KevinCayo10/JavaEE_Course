/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author KevinCayoHP
 */
public class Conexion {

    public Connection getConnection() {
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos?user=root&password=12345");
            if (conexion != null) {
                System.out.println("Conexion exitosa");
                return conexion;

            }
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
    
    
}
