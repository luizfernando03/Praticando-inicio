package FiguraGeometrica;

public class Retangulo extends FiguraGeometrica {
    private double alturaRetangulo;
    private double baseRetabgulo;

    private double calcularArea;

    public Retangulo(double alturaRetangulo, double baseRetabgulo) {
        this.alturaRetangulo = alturaRetangulo;
        this.baseRetabgulo = baseRetabgulo;
    }


    @Override
    public void calcularArea() {

    }

    @Override
    public void calculoArea() {
        calcularArea = alturaRetangulo * baseRetabgulo;
    }

    public double getValorCalculado() {
        return calcularArea;
    }

    public double getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public void setAlturaRetangulo(double alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }

    public double getBaseRetabgulo() {
        return baseRetabgulo;
    }

    public void setBaseRetabgulo(double baseRetabgulo) {
        this.baseRetabgulo = baseRetabgulo;
    }

}
