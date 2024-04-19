/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionalinterface;

/**
 *
 * @author KevinCayoHP
 */
@FunctionalInterface
public interface Ejecutor {
    
    void ejecutar(String parametro);
    
    default void metodoDefecto(){
        
    }
    
    static void metodoStatico(){
        
    }
    
    
    
}
