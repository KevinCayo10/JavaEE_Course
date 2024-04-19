package multitareas;


public class Ratones extends Thread {
    private static int plato = 100; // Variable estática para el plato compartido
    private String nombre;
    private int cantidadComida;

    public Ratones(String nombre, int cantidadComida) {
        this.nombre = nombre;
        this.cantidadComida = cantidadComida;
    }

    public void run() {
        while (true) {
            synchronized (Ratones.class) {
                if (plato >= cantidadComida) {
                    comer();
                } else {
                    llenar();
                }
            }
        }
    }

    private void comer() {
        plato -= cantidadComida;
        System.out.println(nombre + " ha comido " + cantidadComida + " del plato. Quedan " + plato + " en el plato.");
    }

    private void llenar() {
        plato = 100;
        System.out.println("¡El plato se ha llenado de nuevo!");
    }

    public static void main(String[] args) {
        Ratones raton1 = new Ratones("Ratón 1", 10);
        Ratones raton2 = new Ratones("Ratón 2", 20);

        raton1.start();
        raton2.start();
    }
}
