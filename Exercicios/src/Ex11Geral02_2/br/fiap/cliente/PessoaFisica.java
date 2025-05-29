package Ex11Geral02_2.br.fiap.cliente;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String contato, String cpf) {
        super(nome, contato);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getIdentificador() {
        return getCpf();
    }

    @Override
    public String toString() {
        String aux = super.toString()+"\nCPF: "+getCpf();
        return aux;
    }
}
