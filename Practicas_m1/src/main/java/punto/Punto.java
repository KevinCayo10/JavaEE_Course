/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto;

/**
 *
 * @author KevinCayoHP
 */
public class Punto {

    private int x;
    private int y;

    //Constructor sin parametros pero inicializa en 0
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    //Constructor con parametros e inicializar los valores
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructor con otro Punto existente
    public Punto(Punto punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    //Metodo para imprimir los datos
    public void pintar() {
        System.out.println("Coordenada : " + this.x + " : " + this.y);
    }

}
