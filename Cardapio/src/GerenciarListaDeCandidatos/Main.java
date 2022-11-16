package GerenciarListaDeCandidatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean c = true;
        Scanner scan = new Scanner(System.in);
        Candidatos candidatos = new Candidatos();

        while (c==true){
            System.out.println("O que deseja fazer hoje? Segue as opções:");
            System.out.println("Digite 1 - adicionar candidato");
            System.out.println("Digite 2 - exibir candidato");
            System.out.println("Digite 3 - excluir candidato");
            System.out.println("Digite 4 - para Sair");

            int escolhaDoUser= scan.nextInt();

            switch (escolhaDoUser){

            case 1:
                candidatos.adicionar();
                break;

            case 2 :
                candidatos.exibir();
                break;

            case 3 :
                candidatos.excluir();
                break;

            case 4 :
                c = false;
                break;

            default:
                System.out.println("Escolha inválida");
        }

    }
 }
}