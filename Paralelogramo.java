public class Paralelogramo extends Figuras {
    // Atributos promedio y área paralelogramo
    private int baseP;
    private int alturaP;

    public Paralelogramo() {

    }

    public Paralelogramo(int area, int perimetro, double promedio, int baseP, int alturaP) {
        super(area, perimetro, promedio);
        this.baseP = baseP;
        this.alturaP = alturaP;
    }

    public int getBaseP() {
        return baseP;
    }

    public void setBaseP(int baseP) {
        this.baseP = baseP;
    }

    public int getAlturaP() {
        return alturaP;
    }

    public void setAlturaP(int alturaP) {
        this.alturaP = alturaP;
    }

}
