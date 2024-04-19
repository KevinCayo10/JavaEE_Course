/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author KevinCayoHP
 */
public class Persona {

    String nombre;
    int edad;
    char sexo;
    String dni;
    boolean bCasado;

    public Persona(String nombre, int edad, char sexo, String dni, boolean bCasado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.bCasado = bCasado;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isbCasado() {
        return bCasado;
    }

    public void setbCasado(boolean bCasado) {
        this.bCasado = bCasado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado=" + bCasado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.edad;
        hash = 67 * hash + this.sexo;
        hash = 67 * hash + Objects.hashCode(this.dni);
        hash = 67 * hash + (this.bCasado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return true;
    }

    
    public void pintar(){
        System.out.println("Persona : "+ this.toString());
    }
}
