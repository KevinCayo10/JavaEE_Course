import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Individuo {
    static class Mundo {
        private String nombre;
        private int edad;
        private String sexo;

        Mundo ponNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        Mundo ponEdad(int edad) {
            this.edad = edad;
            return this;
        }

        Mundo ponSexo() {
            this.sexo = Math.random() < 0.5 ? "Masculino" : "Femenino";
            return this;
        }

        Individuo nacer() {
            return new Individuo(this.nombre, this.edad, this.sexo);
        }
    }

    private String nombre;
    private int edad;
    private String sexo;

    private Individuo(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public static List<Individuo> crearMundo() {
        List<Individuo> individuos = new ArrayList<>();
        Random r = new Random();
        int num = r.nextInt(6) + 5;
        for (int i = 1; i <= num; i++) {
            int edad = r.nextInt(48) + 18;
            individuos.add(new Individuo.Mundo()
                    .ponNombre("Individuo " + i)
                    .ponEdad(edad)
                    .ponSexo()
                    .nacer());
        }
        return individuos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
}
