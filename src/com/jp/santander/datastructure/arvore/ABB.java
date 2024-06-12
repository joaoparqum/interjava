package com.jp.santander.datastructure.arvore;

//Arvore Binaria de Busca
public class ABB {

    public Noh raiz;

    public class Noh{
        public int valor;
        public Noh esquerdo;
        public Noh direito;

        public Noh(int valor){
            this.valor = valor;
        }
    }

    public void inserir(int valor) {
        if(raiz == null){
            raiz = new Noh(valor);
        }else {
            inserir(raiz,valor);
        }
    }

    public void inserir(final Noh raiz, final int valor){
        if(raiz == null) return;
        if(valor == raiz.valor) return;
        if(valor > raiz.valor){
            if(raiz.direito == null) raiz.direito = new Noh(valor);
            else inserir(raiz.direito, valor);
        }else{
            if(raiz.esquerdo == null) raiz.esquerdo = new Noh(valor);
            else inserir(raiz.esquerdo, valor);
        }
    }

    public boolean contem(int valor) {
        return contem(raiz,valor);
    }

    private boolean contem(Noh raiz, int valor) {
        if(raiz == null) return false;
        if(valor == raiz.valor) return true;
        if(valor > raiz.valor) return contem(raiz.direito, valor);
        else return contem(raiz.esquerdo, valor);
    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    private void emOrdem(final Noh noh) {
        if(noh == null) return;
        emOrdem(noh.esquerdo);
        System.out.println(noh.valor);
        emOrdem(noh.direito);
    }

    public int minValor(Noh no) {
        while(no.esquerdo != null){
            no = no.esquerdo;
        }
        return no.valor;
    }

    public void apagarNoh(int valor) {
        apagarNoh(raiz, valor);
    }

    private Noh apagarNoh(Noh raiz, int valor) {
        if(raiz == null) return null;

        if(valor < raiz.valor){
            raiz.esquerdo = apagarNoh(raiz.esquerdo, valor);
        } else if (valor > raiz.valor) {
            raiz.direito = apagarNoh(raiz.direito, valor);
        }else {
            if((raiz.esquerdo == null) && (raiz.direito==null)){
                return null;
            } else if (raiz.esquerdo == null){
                return raiz.direito;
            } else if (raiz.direito == null) {
                return raiz.esquerdo;
            } else {
                int minValor = minValor(raiz.direito);
                raiz.valor = minValor;
                raiz.direito = apagarNoh(raiz.direito, valor);
            }
        }
        return raiz;
    }

    public static void main(String[] args) {
        ABB ab = new ABB();
        ab.inserir(2);
        ab.inserir(1);
        ab.inserir(3);
        ab.emOrdem();
    }


}
