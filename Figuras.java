public class Figuras {
    private int area;
    private int perimetro;
    private double promedio;

    public Figuras() {
    }

    public Figuras(int area, int perimetro, double promedio) {
        this.area = area;
        this.perimetro = perimetro;
        this.promedio = promedio;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Figuras [area=" + area + ", perimetro=" + perimetro + ", promedio=" + promedio + "]";
    }

}
