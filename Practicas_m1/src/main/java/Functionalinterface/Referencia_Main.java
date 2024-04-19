/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionalinterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KevinCayoHP
 */
public class Referencia_Main {
    
    public static void main(String[] args) {
        
        List<String> personas = List.of("Fatima", "Darwin", "Kevin", "Veronica");
        System.out.println("-----------------------------");
        for (String nombre : personas) {
            System.out.println(nombre);
        }
        
        System.out.println("Funcion Lambda -------");
        personas.forEach(p -> System.out.println(p));
        
        System.out.println("Referencia    --------");
        personas.forEach(System.out::println);
        
        System.out.println("Buscar por lambda ----");
        String buscar = "Veronica";
        personas.stream().filter(p -> buscar.equals(p)).forEach(System.out::println);
        
        System.out.println("Buscar por Referencia-");
        personas.stream().filter(buscar::equals).forEach(System.out::println);
        
    }
}
