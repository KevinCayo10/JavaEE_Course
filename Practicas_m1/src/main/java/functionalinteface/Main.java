import java.util.List;

public class Main {
     public static void main(String[]args) {
        List<Individuo> mundo = Individuo.crearMundo();
        Operaciones operaciones = individuos -> individuos.forEach(individuo ->
                System.out.println("Nombre: " + individuo.getNombre() +
                        ", Edad: " + individuo.getEdad() +
                        ", Sexo: " + individuo.getSexo()));

        operaciones.mostrarIndividuos(mundo);
        System.out.println("Masculinos");
        operaciones.mostrarIndividuos(operaciones.filtroIndividuos(mundo, individuo -> individuo.getSexo().equals("Masculino")));
        System.out.println("Femenino");
        operaciones.mostrarIndividuos(operaciones.filtroIndividuos(mundo, individuo -> individuo.getSexo().equals("Femenino")));
        System.out.println("Masculinos y 25");
        operaciones.mostrarIndividuos(operaciones.filtroIndividuos(mundo, individuo -> individuo.getEdad() == 25 && individuo.getSexo().equals("Masculino")));
    }
}
