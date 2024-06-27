package com.jp.interjava.capgemini;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner leitor  = new Scanner(System.in);
        Pessoa pe = new Pessoa();

        System.out.println("Digite o peso da pessoa:");
        pe.peso = leitor.nextFloat();
        System.out.println("Digite a altura da pessoa:");
        pe.altura = leitor.nextFloat();

        pe.calcularIMC();



    }

}
