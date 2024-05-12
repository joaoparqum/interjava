package com.jp.interjava.aula56;

public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumero() {
            return GeraCpf.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumero() {
            return GeraCpf.cnpj();
        }
    };

    public abstract String geraNumero();
}
