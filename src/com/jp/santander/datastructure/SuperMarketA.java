package com.jp.santander.datastructure;

public class SuperMarketA implements Supermarket{

    private final String[] itens;
    private int lastIndex;

    public SuperMarketA(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(String item) {
        if(lastIndex == itens.length-1) {
            System.out.println("Lista cheia!");
        }else {
            lastIndex++;
            itens[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("####################");
            if(lastIndex < 0){
                System.out.println("Lista de supermercado vazia");
            }
            for(int i=0; i <= lastIndex; i++){
                System.out.println(i + " - " + itens[i]);
            }
        System.out.println("####################");
    }

    @Override
    public void delete(int index) {
        if(index > 0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        }else {
            System.out.println("Indice inválido!");
        }

    }

    private void shift(int index) {
        for(int i = index; i < lastIndex; i++){
            itens[i] = itens[i+1];
        }
    }
}
