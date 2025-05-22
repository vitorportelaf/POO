package ExRevisaoCP3.br.fiap.cliente;

public abstract class Cliente extends Object{
    private String nome;
    private String contato;

    public Cliente(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public abstract String getIdentificador();

    @Override
    public String toString() {
        String aux = "Nome: "+nome+"\nContato: "+contato;
        return aux;
    }
}
