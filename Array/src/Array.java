public class Array {
    public static void main(String[] args) {

        double[] horariosAcordados = new double[60];

        horariosAcordados[0] = 9.45;
        horariosAcordados[1] =  7.10;
        horariosAcordados[2] = 6.20;
        horariosAcordados[3] = 11.30;
        horariosAcordados[4] = 11.46;
        horariosAcordados[5] = 08.50;
        horariosAcordados[6] = 09.30;


        System.out.println("O horario acordado do 3° dia foi :" + horariosAcordados[2]);

        for (int i = 0; i< horariosAcordados.length; i++){
            System.out.println("O horario que voce acordou no dia "+(i + 1)+ " foi : " + horariosAcordados[i]);
        }


    }

}
