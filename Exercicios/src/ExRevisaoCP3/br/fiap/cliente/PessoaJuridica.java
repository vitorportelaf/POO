package ExRevisaoCP3.br.fiap.cliente;

import ExRevisaoCP3.br.fiap.desconto.Desconto;

import java.util.Random;

public class PessoaJuridica extends Cliente implements Desconto {
    private String cnpj;

    public PessoaJuridica(String nome, String contato, String cnpj) {
        super(nome, contato);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double aplicarDesconto(double valorOriginal){
        Random rd = new Random();
        int percentual = 1 + rd.nextInt(10);
        return valorOriginal + (valorOriginal * percentual/100);
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
