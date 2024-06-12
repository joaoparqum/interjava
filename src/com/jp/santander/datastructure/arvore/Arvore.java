package com.jp.santander.datastructure.arvore;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore {

    public Noh raiz;

    public static class Noh{

        public int valor;
        public Noh esquerdo;
        public Noh direito;

        public Noh(int valor){
            this.valor = valor;
        }

        public boolean ehFolha() {
            return (this.esquerdo == null) && (this.direito == null);
        }
    }

    public void inserir(int valor) {
        if(raiz == null) raiz = new Noh(valor);
        else {
            Noh novoNoh = new Noh(valor);
            Queue<Noh> queue = new LinkedList<>();
            queue.add(raiz);
            while (queue.size()>0){
                Noh no = queue.remove();
                if(no.esquerdo == null){
                    no.esquerdo = novoNoh;
                    break;
                }else {
                    queue.add(no.esquerdo);
                }
                if(no.direito == null){
                    no.direito = novoNoh;
                    break;
                }else {
                    queue.add(no.direito);
                }
            }
        }
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    //imprimir pela pre ordem
    private void preOrdem(final Noh noh) {
        if(noh == null) return;
        System.out.println(noh.valor);
        preOrdem(noh.esquerdo);
        preOrdem(noh.direito);
    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    //imprimir por em ordem
    private void emOrdem(final Noh noh) {
        if(noh == null) return;
        emOrdem(noh.esquerdo);
        System.out.println(noh.valor);
        emOrdem(noh.direito);
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    //imprimir por pos ordem
    private void posOrdem(final Noh noh) {
        if(noh == null) return;
        posOrdem(noh.esquerdo);
        posOrdem(noh.direito);
        System.out.println(noh.valor);
    }

    public void BFS() {
        if (raiz == null) return;
        Queue<Noh> queue = new LinkedList<>();
        queue.add(raiz);
        while(!queue.isEmpty()){
            Noh noh = queue.remove();
            if(noh.esquerdo == null) queue.add(noh.esquerdo);
            if(noh.direito == null) queue.add(noh.direito);
            System.out.println(noh.valor);
        }
    }

    public static void main(String[] args) {
        Arvore ar = new Arvore();

        ar.inserir(1);
        ar.inserir(2);
        ar.inserir(3);

        System.out.println(ar.raiz);
        System.out.println(ar.raiz.esquerdo.ehFolha());
    }


}
