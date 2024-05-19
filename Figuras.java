public abstract class Figuras {
    private double area;
    private int perimetro;
    private double promedio;



    public Figuras() {
    }



    public Figuras(double area, int perimetro, double promedio) {
        this.area = area;
        this.perimetro = perimetro;
        this.promedio = promedio;
    }



    public double getArea() {
        return area;
    }

    public void setArea(double area) {
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
