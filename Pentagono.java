public class Pentagono extends Figuras {
    // Atributos para calcular el área
    private int perimetroPent;
    private int apotemaPent;
    // Atributo para calcular el perimetro
    private int ladoPent;

    public Pentagono() {
    }

    public Pentagono(double area, int perimetro, double promedio, int perimetroPent, int apotemaPent, int ladoPent) {
        super(area, perimetro, promedio);
        this.perimetroPent = perimetroPent;
        this.apotemaPent = apotemaPent;
        this.ladoPent = ladoPent;
    }

    public int getPerimetroPent() {
        return perimetroPent;
    }

    public void setPerimetroPent(int perimetroPent) {
        this.perimetroPent = perimetroPent;
    }

    public int getApotemaPent() {
        return apotemaPent;
    }

    public void setApotemaPent(int apotemaPent) {
        this.apotemaPent = apotemaPent;
    }

    public int getLadoPent() {
        return ladoPent;
    }

    public void setLadoPent(int ladoPent) {
        this.ladoPent = ladoPent;
    }

    public double CalcularArea(int l){
        double constPenta=0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)));
        Area<Double> penta= (lado) ->  constPenta * (lado*lado);
        return penta.CalcularArea(l);
    }
    public int CalcularPerimetro(int i){
        Perimetro<Integer> penta = (lado) -> 5 *lado;
        return penta.CalcularPerimetro(i);
    }
}