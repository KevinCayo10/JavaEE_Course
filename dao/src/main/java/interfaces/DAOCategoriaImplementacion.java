/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import dao.Conexion;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import personas.Categoria;

/**
 *
 * @author KevinCayoHP
 */
public class DAOCategoriaImplementacion implements DAOMethods {

    Conexion conn = Conexion.getInstance();

    @Override
    public void registrar(Categoria categoria) {
        try {
            Connection conectar = conn.conectar();
            PreparedStatement insertar = conectar.prepareCall("insert into category(id,name) values(?,?)");
            insertar.setInt(1, categoria.getId());
            insertar.setString(2, categoria.getCategoria());
            insertar.executeUpdate();
            conn.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void modificar(Categoria categoria) {
        try {
            Connection conectar = conn.conectar();
            PreparedStatement modificar = conectar.prepareCall("update category set name=? where id=?");
            modificar.setString(1, categoria.getCategoria());
            modificar.setInt(2, categoria.getId());
            modificar.executeUpdate();

            modificar.executeUpdate();
            conn.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(Categoria categoria) {
        try {
            Connection conectar = conn.conectar();
            PreparedStatement eliminar = conectar.prepareCall("delete from category where id=?");
            eliminar.setInt(1, categoria.getId());
            eliminar.executeUpdate();
            conn.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void buscar(Categoria categoria) {
        try {
            Connection conectar = conn.conectar();
            PreparedStatement buscar = conectar.prepareCall("select * from category where id=?");
            buscar.setInt(1, categoria.getId());
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                categoria.setId(Integer.parseInt(rs.getString("id")));
                categoria.setCategoria(rs.getString("String"));

            }
            conn.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public ArrayList<Categoria> listar() {
        try {
            ArrayList <Categoria> categorias = new ArrayList<>();
            Connection conectar = conn.conectar();
            PreparedStatement listar = conectar.prepareCall("select * from category");
            ResultSet rs = listar.executeQuery();
            while (rs.next()) {
                Categoria cate = new Categoria();
                cate.setId(Integer.parseInt(rs.getString("id")));
                cate.setCategoria(rs.getString("name"));
                categorias.add(cate);
            }
            conn.cerrarConexion();
            return categorias;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
