public class Rombo extends Figuras {
    // Atributos para calcular el área
    private int diagonalMayor;
    private int diagonalMenor;

    // Atributo para calcular el perimetro
    private int lado;

    public Rombo() {
    }

    public Rombo(double area, int perimetro, double promedio, int diagonalMayor, int diagonalMenor, int lado) {
        super(area, perimetro, promedio);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double CalcularArea(int dM, int dm){
        Area<Double> rombo = (diagonalm) -> ((double) dM * diagonalm) / 2;
        return rombo.CalcularArea(dm);
    }
    public int CalcularPerimetro(int i){
        Perimetro<Integer> rombo = (lado) -> 4 *lado;
        return rombo.CalcularPerimetro(i);
    }
}
