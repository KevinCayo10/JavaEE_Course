/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KevinCayoHP
 */
public class Main {
     public static Statement st = null;
    public static ResultSet rs = null;
    public static void main(String[] args)throws SQLException {
        Connection conexion = null;
        try {
            Conexion conn = new Conexion();
            conexion = conn.getConnection();
            
            st = conexion.createStatement();
            
            rs = st.executeQuery("SELECT * FROM product");
            System.out.println("Resultado: " + rs.getMetaData().getColumnCount());
            int i = 0;
            while(rs.next()){
                System.out.println(rs.getString("name"));
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
