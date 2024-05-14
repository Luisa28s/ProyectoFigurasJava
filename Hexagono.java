public class Hexagono extends Figuras {
    // Atributos para área hexágono
    private int perimetroHex;
    private int apotema;

    // Atributos para promedio hexágono
    private int lado;

    public Hexagono() {

    }

    public Hexagono(int area, int perimetro, double promedio, int perimetroHex, int apotema, int lado) {
        super(area, perimetro, promedio);
        this.perimetroHex = perimetroHex;
        this.apotema = apotema;
        this.lado = lado;
    }

    public int getPerimetroHex() {
        return perimetroHex;
    }

    public void setPerimetroHex(int perimetroHex) {
        this.perimetroHex = perimetroHex;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
