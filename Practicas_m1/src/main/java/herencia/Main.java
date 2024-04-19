/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author KevinCayoHP
 */
public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Kevin Cayo", 21, 'M', "1724116155", true);
        Empleado emp1 = new Empleado(persona1, "1020304050", (float)550.0);
        Empleado emp2 = new Empleado("2030405060", (float)535.0, "Joel Tipan", 31, 'M', "1709104444", true);
        System.out.println("DATOS PERSONAL ");
        System.out.println(persona1.toString());
        persona1.pintar();
        
        System.out.println("DATOS EMPLEADO 1");
        System.out.println(emp1.toString());
        emp1.pintar();
        
        System.out.println("DATOS EMPLEADO 2");
        System.out.println(emp2.toString());
        emp2.pintar();
        
    }

}
