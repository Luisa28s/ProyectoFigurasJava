import java.util.List;

public class FILTROS {
    public static void main(String[] args) {
        // prueba de filtros

        GestionF todo = new GestionF();
        // variable de ejemplo
        int lado = 5;

        Hexagono h1 = new Hexagono();
        double aux = h1.calcularArea(lado);
        h1.setArea(aux);
        h1.setPerimetro(h1.CalcularPerimetro(lado));
        Hexagono h2 = new Hexagono();
        double aux2 = h2.calcularArea(10);
        h2.setArea(aux2);
        h2.setPerimetro(h2.CalcularPerimetro(10));
        Hexagono h3 = new Hexagono();
        double aux3 = h3.calcularArea(4);
        h3.setArea(aux3);
        h3.setPerimetro(h3.CalcularPerimetro(4));

        todo.anadirEquipos(h1);
        todo.anadirEquipos(h2);
        todo.anadirEquipos(h3);

        double p = todo.calcularAreaTotal();
        System.out.println(p);

        // como filtrar por area
        List<Figuras> prueba = todo.filtradoAreaMenora(90);
        System.out.println("figuras con area menor a: " + 90 + ":");
        prueba.forEach(h -> System.out.println("area: " + h.getArea()));

        // promedio perimetro:
        double promedioPerimetros = todo.calcularPromedioPerimetros();
        System.out.println("El promedio de los perimetros de las figuras es: " + promedioPerimetros);

        // Obtener figura con el área máxima
        todo.obtenerFiguraMaxArea().ifPresent(f -> System.out.println("Figura con area maxima: " + f.getArea()));

        // Obtener figura con el área mínima
        todo.obtenerFiguraMinArea().ifPresent(f -> System.out.println("Figura con area minima: " + f.getArea()));

        // Obtener figura con el perímetro máximo
        todo.obtenerFiguraMaxPerimetro()
                .ifPresent(f -> System.out.println("Figura con perimetro maximo: " + f.getPerimetro()));

        // Obtener figura con el perímetro mínimo
        todo.obtenerFiguraMinPerimetro()
                .ifPresent(f -> System.out.println("Figura con perimetro minimo: " + f.getPerimetro()));

        Pentagono p1 = new Pentagono();
        double h = p1.CalcularArea(lado);
        p1.setArea(h);
        p1.setPerimetro(p1.CalcularPerimetro(lado));
        todo.anadirEquipos(p1);

        Rombo r = new Rombo();
        double romb = r.CalcularArea(5, 7);
        r.setArea(romb);
        r.setPerimetro(r.CalcularPerimetro(lado));
        todo.anadirEquipos(r);

        double promedioPerimetrosPYH = todo.calcularPromedioPerimetrosHexagonoYPentagono();
        System.out.println("El promedio de los perimetros de los hexagonos y pentagonos es: " + promedioPerimetrosPYH);
    }
}
