package Ex11Geral02.br.fiap.cliente;

import Ex11Geral02.br.fiap.desconto.Desconto;

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
        int porcentagem = 1 + rd.nextInt(10);
        return (valorOriginal*porcentagem)/100;
    }

    @Override
    public String getIdentificador() {
        return getCnpj();
    }

    @Override
    public String toString() {
        String aux = "\nCNPJ: "+getCnpj();
        return super.toString()+aux;
    }
}
