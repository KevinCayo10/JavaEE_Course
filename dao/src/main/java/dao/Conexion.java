/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KevinCayoHP
 */
public class Conexion {
    
    private Conexion(){
        
    }
    
    private static Connection conexion;
    private static Conexion instancia;
    
    private static final String URL = "jdbc:mysql://localhost:3306/productos";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            return conexion;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return conexion;
    }
    
    public void cerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static Conexion getInstance(){
        if(instancia==null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
}
