package com.jp.interjava.aula71;

public class Teste {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5};
        ThreadSoma t1 = new ThreadSoma("#1", nums);
        ThreadSoma t2 = new ThreadSoma("#2", nums);

    }

}
