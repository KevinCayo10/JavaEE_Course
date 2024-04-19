/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nif_dni;

import java.util.Scanner;

/**
 *
 * @author KevinCayoHP
 */
public class Nif_to_Dni {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int dni = 0;
        System.out.print("Ingresar el DNI : ");
        dni = scan.nextInt();

        // Obtengo el resto del dni
        int resto = dni % 23;

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("RESTO : "+resto);
        System.out.println("LETRA CORRESPENDIENTE: " +letras[resto]);
    }
}
