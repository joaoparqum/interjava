package com.jp.santander.designpatterns.factorymethod;

import com.jp.santander.designpatterns.factorymethod.solucao.ProdutoFactory;

public class Teste {

    public static void main(String[] args) {

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);

    }

}
