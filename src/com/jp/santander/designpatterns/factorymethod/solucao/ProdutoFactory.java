package com.jp.santander.designpatterns.factorymethod.solucao;

import com.jp.santander.designpatterns.factorymethod.Produto;
import com.jp.santander.designpatterns.factorymethod.ProdutoDigital;
import com.jp.santander.designpatterns.factorymethod.ProdutoFisico;
import com.jp.santander.designpatterns.factorymethod.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setDimensoes(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setDimensoes(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto não disponível!");
        }

    }

}
