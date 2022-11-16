package FiguraGeometrica;
import java.util.Scanner;

public class Quadrado extends FiguraGeometrica {
   private double lado;
   private double CalcularAreaQ;

    public Quadrado(double informaLado) {
        this.lado = informaLado;
    }


    @Override
    public void calcularArea() {

    }

    @Override
    public void calculoArea() {
        CalcularAreaQ = lado * lado;
    }

    public double getValorCalculado() {
        return CalcularAreaQ;
    }

    public double getInformaLado() {
        return lado;
    }

    public void setInformaLado(double informaLado) {
        this.lado = informaLado;
    }
}



