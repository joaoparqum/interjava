package com.jp.interjava.exercicioenum;

public class Calculadora {

    public static void main(String[] args){

        double x = 24;
        double y = 17;

        for(Operacao op: Operacao.values()){
            System.out.println(x + " ");
            System.out.println(op.toString() + " ");
            System.out.println(y + " = ");
            System.out.println(op.executarOperacao(x,y));
        }

    }

}
