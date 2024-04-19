/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;

import random.Random;

/**
 *
 * @author KevinCayoHP
 */
public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(2, 3);
        Punto punto3 = new Punto(new Punto(5,6));
        
        punto1.pintar();
        punto2.pintar();
        punto3.pintar();
        
        
        Punto [] listPuntos = new Punto[20];
        for(int i=0;i<20;i++){
            listPuntos[i] = new Punto((int)(Math.random()*100+1),(int)(Math.random()*100+1));
        }
        
        for(Punto punto: listPuntos){
            punto.pintar();
        }
    }
}
