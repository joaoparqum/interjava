package com.jp.capgemini;

public class Enquanto {

    public static void main(String[] args){

        int cont = 0;

        while(cont <= 10){
            System.out.println("numero: " + cont);
            cont++;
        }

        System.out.println("-------------------");


        do{
            System.out.println("numero: " + cont);
            cont++;
        }while(cont<=5);

        System.out.println("-------------------");

        for(int i=0; i<=15; i++){
            System.out.println("numero do for: " + i);
        }


    }
}
