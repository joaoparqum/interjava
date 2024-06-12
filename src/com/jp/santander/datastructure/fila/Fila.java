package com.jp.santander.datastructure.fila;

public class Fila {

    private Noh primeiro;
    private Noh ultimo;
    private int tamanho;

    public class Noh{

        int valor;

        Noh proximo;

        Noh(int valor){
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    public Fila(int valor){
        Noh novoNoh = new Noh(valor);
        primeiro = novoNoh;
        ultimo = novoNoh;
        tamanho++;
    }

    public void pegarPrimeiro(){
        if(primeiro != null){
            System.out.println("Primeiro: " + primeiro.valor);
        }else{
            System.out.println("Fila vazia!");
        }
    }

    public void pegarUltimo() {
        if(ultimo != null) {
            System.out.println("Ultimo: " + ultimo.valor);
        }else {
            System.out.println("Fila vazia!");
        }
    }

    public void mostrarTamanho() {
        System.out.println("Tamanho: " + tamanho);
    }

    public void imprimir() {
        System.out.println("#####################");
        Noh temp = primeiro;
        while(temp != null){
            System.out.println(temp.valor);
            temp = temp.proximo;
        }
        tamanho++;
        System.out.println("#####################");
    }

    public void adicionar(int valor) {
        Noh novoNoh = new Noh(valor);
        if(tamanho == 0){
            primeiro = novoNoh;
            ultimo = novoNoh;
        }else{
            ultimo.proximo = novoNoh;
            ultimo = novoNoh;
        }
        tamanho++;
    }

    public Noh remover(){
        if(tamanho == 0) return null;
        Noh temp = primeiro;
        if(tamanho == 1){
            primeiro = null;
            ultimo = null;
        }else {
            primeiro = primeiro.proximo;
            primeiro.proximo = null;
        }
        tamanho--;
        return temp;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(1);

        fila.pegarPrimeiro();
        fila.pegarUltimo();
        fila.mostrarTamanho();
        fila.imprimir();

        fila.adicionar(2);
        fila.adicionar(3);

        fila.pegarPrimeiro();
        fila.pegarUltimo();
        fila.mostrarTamanho();
        fila.imprimir();

    }
}
