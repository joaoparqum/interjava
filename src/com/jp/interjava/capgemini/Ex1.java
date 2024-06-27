package com.jp.interjava.capgemini;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int ano = 0;
        float valor = 0.0f;
        char op = 's';
        float desconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemi = 0;
        int totalCarros = 0;

        while (op == 's' || op == 'S'){
            System.out.println("Digite o ano de fabricação do carro:");
            ano = leitor.nextInt();
            System.out.println("Digite o valor do carro:");
            valor = leitor.nextFloat();

            if (ano<=2000) {
                valor = 0.12f;
            }else{
                valor = 0.07f;
                totalCarrosSemi++;
            }
            totalCarros++;

            valorDesconto = desconto * valor;
            valorPagar = valor - valorDesconto;

            System.out.println("O valor de desconto foi de: " + valorDesconto);
            System.out.println("O valor a pagar é: " + valorPagar);

            System.out.println("Deseja fazer o processo novamento? [s] sim - [n] não");
            op = leitor.next().charAt(0);
        }

        System.out.println("Total de carros seminovos: " + totalCarrosSemi);
        System.out.println("Total de carros: " + totalCarros);


    }

}
