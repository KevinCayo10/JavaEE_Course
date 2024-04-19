/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author KevinCayoHP
 */
public class Empleado extends Persona{
   private String idPersonal;
   private float sueldo;
   
   public Empleado(String idPersonal, float sueldo){
       super();
       this.idPersonal = idPersonal;
       this.sueldo = sueldo;
   }
  
   public Empleado(Persona persona, String idPersonal, float sueldo){
       super(persona.getNombre(),persona.getEdad(), persona.getSexo(), persona.getDni(), persona.isbCasado());
       this.idPersonal = idPersonal;
       this.sueldo = sueldo;
   }
   

    public Empleado(String idPersonal, float sueldo, String nombre, int edad, char sexo, String dni, boolean bCasado) {
        super(nombre, edad, sexo, dni, bCasado);
        this.idPersonal = idPersonal;
        this.sueldo = sueldo;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona {"+ super.toString() +" - Empleado : "+ "idPersonal=" + idPersonal + ", sueldo=" + sueldo + '}';
    }
           
    @Override
    public void pintar(){
        System.out.println("Persona : "+ super.toString()+" - Empleado : "+ "idPersonal=" + idPersonal + ", sueldo=" + sueldo + '}');
    }
    
    
}
