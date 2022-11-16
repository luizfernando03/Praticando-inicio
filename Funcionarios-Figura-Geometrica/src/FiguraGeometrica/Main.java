package FiguraGeometrica;

public class Main {
    public static void main(String[] args) {

        FiguraGeometrica areaDoQuadrado = new Quadrado(5);
        areaDoQuadrado.calculoArea();
        System.out.println();
        System.out.println("O calculo da área do Quadrado é: "+areaDoQuadrado.getValorCalculado()+" área ");


        FiguraGeometrica areaDoRetangulo = new Retangulo(2,3);
        areaDoRetangulo.calculoArea();
        System.out.println();
        System.out.println("O calculo da área do Retangulo é: "+areaDoRetangulo.getValorCalculado()+" área ");

        FiguraGeometrica areaDoTriangulo = new Triangulo(3,3);
        areaDoTriangulo.calculoArea();
        System.out.println();
        System.out.println("O calculo da área do Triângulo é: "+areaDoTriangulo.getValorCalculado()+" área ");

        FiguraGeometrica areaDoCirculo = new Circulo(1);
        areaDoCirculo.calculoArea();
        System.out.println();
        System.out.println("O calculo da área do Círculo é: "+areaDoCirculo.getValorCalculado()+" área ");

    }
}
