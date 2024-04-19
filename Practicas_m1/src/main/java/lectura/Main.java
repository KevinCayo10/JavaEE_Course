/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author KevinCayoHP
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        String carpeta ="C:\\EXCEL\\";
        String archivo = "leer.txt";
        
        File fichero = new File(carpeta+archivo);
        Scanner leerfichero = new Scanner(fichero);
        
        while(leerfichero.hasNext()){
            String cadena = leerfichero.next();
            System.out.println(cadena+" ");
        }
        leerfichero.close();
    }
}
