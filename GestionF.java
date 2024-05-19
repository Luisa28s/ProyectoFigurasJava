// Importación de librerías necesarias
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Definición de la clase GestionF
public class GestionF {

    // Lista que almacenará las figuras
    private List<Figuras> Tfiguras; 

    // Constructor de la clase
    public GestionF() {
        Tfiguras = new ArrayList<>();
    }

    // Método para obtener todas las figuras almacenadas
    public List<Figuras> getTodasFiguras() {
        return Tfiguras;
    }

    // Método para añadir una figura a la lista
    public void anadirEquipos(Figuras f) {
        Tfiguras.add(f);
    }

    // Método para calcular el área total de todas las figuras usando streams
    public double calcularAreaTotal() {
        return Tfiguras.stream()
                        .mapToDouble(Figuras::getArea)
                        .sum();
    }

    // Método para filtrar figuras cuyo área sea menor que un límite dado
    public List<Figuras> filtradoAreaMenora(int limiteArea) {
        return Tfiguras.stream()
                        .filter(h -> h.getArea() < limiteArea)
                        .toList();
    }

    // Método para filtrar figuras cuyo área sea mayor que un límite dado
    public List<Figuras> filtradoAreaMayora(int limiteArea) {
        return Tfiguras.stream()
                .filter(h -> h.getArea() > limiteArea)
                .toList();
    }

    // Método para calcular el promedio de los perímetros de todas las figuras
    public double calcularPromedioPerimetros() {
        return Tfiguras.stream()
                        .mapToDouble(Figuras::getPerimetro)
                        .average()
                        .orElse(0);
    }

    // Método para obtener la figura con el área máxima
    public Optional<Figuras> obtenerFiguraMaxArea() {
        return Tfiguras.stream()
                        .max(Comparator.comparingDouble(Figuras::getArea));
    }

    // Método para obtener la figura con el área mínima
    public Optional<Figuras> obtenerFiguraMinArea() {
        return Tfiguras.stream()
                        .min(Comparator.comparingDouble(Figuras::getArea));
    }

    // Método para obtener la figura con el perímetro máximo
    public Optional<Figuras> obtenerFiguraMaxPerimetro() {
        return Tfiguras.stream()
                        .max(Comparator.comparingDouble(Figuras::getPerimetro));
    }

    // Método para obtener la figura con el perímetro mínimo
    public Optional<Figuras> obtenerFiguraMinPerimetro() {
        return Tfiguras.stream()
                        .min(Comparator.comparingDouble(Figuras::getPerimetro));
    }

    // Método para calcular el promedio de los perímetros de los hexágonos y pentágonos
    public double calcularPromedioPerimetrosHexagonoYPentagono() {
        return Tfiguras.stream()
                        .filter(f -> f instanceof Hexagono || f instanceof Pentagono)
                        .mapToDouble(Figuras::getPerimetro)
                        .average()
                        .orElse(0);
    }
}
