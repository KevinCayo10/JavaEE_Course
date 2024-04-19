import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface Operaciones {
    void mostrarIndividuos(List<Individuo> individuos);

    default List<Individuo> filtroIndividuos(List<Individuo> individuos, Predicate<Individuo> filtro) {
        return individuos.stream().filter(filtro).toList();
    }

    default Predicate<Individuo> esMasculino() {
        return individuo -> individuo.getSexo().equals("Masculino");
    }

    default Predicate<Individuo> esFemenino() {
        return individuo -> individuo.getSexo().equals("Femenino");
    }

    default Predicate<Individuo> cumpleCondiciones(int edad, String sexo) {
        return individuo -> individuo.getEdad() == edad && individuo.getSexo().equals(sexo);
    }
}
