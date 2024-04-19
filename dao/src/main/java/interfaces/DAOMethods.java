/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.awt.List;
import java.util.ArrayList;
import personas.Categoria;

/**
 *
 * @author KevinCayoHP
 */
public interface DAOMethods {
    public ArrayList listar();
    public void registrar(Categoria categoria);
    public void modificar(Categoria categoria);
    public void eliminar (Categoria categoria);
    public void buscar(Categoria categoria);
    
}
