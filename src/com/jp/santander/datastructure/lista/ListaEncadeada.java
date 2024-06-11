package com.jp.santander.datastructure.lista;

public class ListaEncadeada {

    private Noh cabeca;
    private Noh cauda;
    private int tamanho;

    class Noh{

        String dado;
        Noh proximo;

        Noh(String dado){
            this.dado = dado;
        }

    }

    public ListaEncadeada(String dado){
        tamanho = 1;
        Noh novoNoh = new Noh(dado);
        cabeca = novoNoh;
        cauda = novoNoh;
    }

    public void pegarCabeca() {
        if(this.cabeca == null){
            System.out.println("Lista vazia!");
        }else {
            System.out.println("Cabeça: " + cabeca.dado);
        }
    }


    public void pegarCauda() {
        if(this.cauda == null){
            System.out.println("Lista vazia!");
        }else {
            System.out.println("Cauda: " + cauda.dado);
        }
    }

    public void pegarTamanho() {
        System.out.println("Tamanho: " + this.tamanho);
    }

    public void esvaziarLista() {
        cabeca = null;
        cauda = null;
        tamanho = 0;
    }

    public void imprimir() {
        Noh temp = this.cabeca; //nó começa na cabeça
        while(temp != null){ //enquanto o noh estiver dados ele imprime o dado
            System.out.println(temp.dado);
            temp = temp.proximo;// e aponta para o próximo
        }
    }

    public void adicionaFinal(String dado) {
        Noh novoNoh = new Noh(dado);
        if(tamanho == 0){// se o tamanho da lista for 0, a cabeça e a cauda aponta para o novo nó
            cabeca = novoNoh;
            cauda = novoNoh;
        }else{//se nao
            cauda.proximo = novoNoh;// o proximo elemento final vai ser o novo elemento
            cauda = novoNoh;//ultimo elemento recebe o novo nó
        }
        tamanho++; // aumenta tamanho da lista
    }

    public Noh removerFinal() {
        if(tamanho == 0) return null;

        Noh pre = cauda;
        Noh temp = null;

        while(pre.proximo != cauda){
            pre = pre.proximo;//navega na lista
        }

        temp = cauda;
        cauda = pre;
        cauda.proximo = null;

        tamanho--;

        if(tamanho == 0){
            cabeca = null;
            cauda = null;
        }

        return temp;
    }

    public void adicionarInicio(String dado) {
        Noh novoNoh = new Noh(dado);
        if(tamanho == 0){
            cabeca = null;
            cauda = null;
        }else{
            novoNoh.proximo = cabeca;
            cabeca = novoNoh;
        }
        tamanho++;
    }

    public Noh removerInicio() {
        if (tamanho == 0) return null;
        Noh temp = cabeca;
        cabeca = cabeca.proximo;
        temp.proximo = null;
        tamanho++;
        if(tamanho == 0){
            cabeca = null;
            cauda = null;
        }
        return temp;
    }

    public Noh pegar(int index){
        if(index<0 || index>=tamanho) return null;
        Noh temp = cabeca;
        for(int i=0; i<index; i++){
            temp = temp.proximo;
        }
        return temp;
    }

    public boolean inserirPosicao(int index, String dado) {
        if(index<0 || index>tamanho) return false;
        if(index > 0){
            adicionarInicio(dado);
            return true;
        }
        if(index == tamanho){
            adicionaFinal(dado);
            return true;
        }

        Noh novoNoh = new Noh(dado);
        Noh temp = pegar(index - 1);
        novoNoh.proximo = temp.proximo;
        temp.proximo = novoNoh;
        tamanho++;
        return true;
    }

    public Noh remover(int index){
        if(index<0 || index>=tamanho) return null;
        if(index > 0) return removerInicio();
        if(index == tamanho-1) return removerFinal();

        Noh prev = pegar(index-1);
        Noh temp = prev.proximo;

        prev.proximo = temp.proximo;
        temp.proximo = null;
        tamanho--;
        return temp;
    }

}
