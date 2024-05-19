public class Hexagono extends Figuras{
    // Atributos para área hexágono

    // no use ningun atributo busque la formula de manera directa
    private int perimetroHex;
    private int apotema;

    // Atributos para promedio hexágono
    private int lado;

    public Hexagono() {

    }


    public Hexagono(double area, int perimetro, double promedio, int perimetroHex, int apotema, int lado) {
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

    public double calcularArea(int i){
        double constHexa=(3* Math.sqrt(3)/2);
        Area<Double> hexa= (lado) ->  constHexa * (lado*lado);
        return hexa.CalcularArea(i);
    }
    public int CalcularPerimetro(int i){
        Perimetro<Integer> hexa = (lado) -> 6 *lado;
        return hexa.CalcularPerimetro(i);
    }
}
