/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionalinterface;

/**
 *
 * @author KevinCayoHP
 */
public class Main {
    public static void main(String[] args) {
       Ejecutor claseAnonima =  new Ejecutor() {
            @Override
            public void ejecutar(String parametro) {
                System.out.println("Hola desde una "+parametro);
            }
        };
        
        Ejecutor lambdaEjecutor = (parametro)->{
            System.out.println("Hola desde nuestra "+parametro);
        };
        claseAnonima.ejecutar("Anonima");
        lambdaEjecutor.ejecutar("Lambda"); 
        
    }
}
