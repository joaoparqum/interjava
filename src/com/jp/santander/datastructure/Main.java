package com.jp.santander.datastructure;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int op;
        do{
            System.out.println("Lista de compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");
            op = scanner.nextInt();

            switch(op){
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Digite a opção do item a ser removido: ");
                    int index = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break:
                default:
                    System.out.println("Opção inválida!");
            }

        }while (op != 4);

        scanner.close();

}
