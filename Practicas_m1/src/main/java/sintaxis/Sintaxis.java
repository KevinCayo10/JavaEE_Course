/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintaxis;

import java.util.Scanner;

/**
 *
 * @author KevinCayoHP
 */
public class Sintaxis {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] miArray = {1, 2, 3};
    }

    public static void ejercicio1() {
        System.out.print("Introducir 1 entero: ");
        int num1 = scan.nextInt();
        System.out.print("Introducir 2 entero: ");
        int num2 = scan.nextInt();
        System.out.print("Introducir 1 float: ");
        float f1 = scan.nextFloat();
        System.out.print("Ingresar su nombre: ");
        String nombre = scan.next();
        System.out.print("Ingresar su apellido: ");
        String apellido = scan.next();

        System.out.println("Suma: " + suma(num1, num2));
    }

    public static int suma(int n1, int n2) {
        int total = n1 + n2;
        return total;
    }

    public static int enteroMayor(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public static float division(int n1, int n2, float n3) {
        return (n3 / (n1 / n2));
    }

    private static String concatenacion(String nombre, String apellido) {
        return nombre + " " + apellido;
    }
}
