package GerenciarListaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        int op;
        do {
            showMenu();
            op = sc.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("#######################################################");
                    sc.nextLine();
                    System.out.print("qual o nome do Produto: ");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Qual o preço do produto: ");
                    double preco = sc.nextDouble();
                    Produto produto = new Produto(nome, preco);
                    list.add(produto);
                    System.out.println("#######################################################");
                    break;
                }
                case 2: {
                    System.out.println("#######################################################");
                    System.out.println("Listar produtos");
                    System.out.println("#######################################################");
                    for (Produto produto : list) {
                        System.out.println(produto.getNome());
                    }
                    System.out.println("#######################################################");
                    break;
                }
                case 3: {
                    System.out.println("#######################################################");
                    System.out.println("Excluir produtos");
                    System.out.print("qual o nome do Produto para excluir: ");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    list.removeIf(produto -> produto.getNome().equals(nome));
                    break;
                }
                case 4: {
                    System.out.println("sair");
                    break;
                }
                default:
                    System.out.println("Opçăo inválida!");
            }


        } while (op != 4);

        sc.close();
    }
    public static void showMenu() {
        System.out.println("1 – Cadastrar produto");
        System.out.println("2 – Mostrar produtos");
        System.out.println("3 - Excluir produtos");
        System.out.println("4 - Sair");
    }

}

