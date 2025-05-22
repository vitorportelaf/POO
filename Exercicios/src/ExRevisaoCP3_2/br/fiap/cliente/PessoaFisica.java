package ExRevisaoCP3_2.br.fiap.cliente;

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
        return cpf;
    }
}
