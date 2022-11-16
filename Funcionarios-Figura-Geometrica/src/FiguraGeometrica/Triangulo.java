package FiguraGeometrica;

import java.util.Scanner;
public class Triangulo extends FiguraGeometrica {

    private double alturaTriangulo;
    private double baseTriangulo;


    private double calcularArea;

    public Triangulo(double alturaTriangulo, double baseTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
    }


    public void calcularArea() {

    }

    @Override
    public void calculoArea() {
        calcularArea = alturaTriangulo * baseTriangulo;
    }

    public double getValorCalculado() {
        return calcularArea;
    }

    public double getAlturaRetangulo() {
        return alturaTriangulo;
    }

    public void setAlturaRetangulo(double alturaRetangulo) {
        this.alturaTriangulo = alturaRetangulo;
    }

    public double getBaseRetabgulo() {
        return baseTriangulo;
    }

    public void setBaseRetabgulo(double baseRetabgulo) {
        this.baseTriangulo = baseRetabgulo;

    }
}
