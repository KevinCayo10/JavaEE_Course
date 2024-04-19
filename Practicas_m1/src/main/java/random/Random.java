/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package random;

/**
 *
 * @author KevinCayoHP
 */
public class Random {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            int numAleatorio = (int) Math.floor(Math.random() * (65 - 18 - 1) + 18);
            System.out.println("Numero : " + numAleatorio);

        }

    }
}
