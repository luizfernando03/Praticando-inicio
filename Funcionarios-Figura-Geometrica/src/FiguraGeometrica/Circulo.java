package FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    private double raio;

    private double calculoAreaC;

    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public void calcularArea() {
        calculoAreaC = (raio*raio)*3.14159;
    }

    @Override
    public void calculoArea() {

    }

    public double getValorCalculado() {
        return calculoAreaC;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}



