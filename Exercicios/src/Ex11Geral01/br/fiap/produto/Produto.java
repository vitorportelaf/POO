package Ex11Geral01.br.fiap.produto;

public class Produto {
    private int id;
    private String nome;
    private double valorUnitario;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, double valorUnitario, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade){
        quantidade++;
    }

    public void debitarEstoque(int quantidade){
        quantidade--;
    }

    @Override
    public String toString() {
        String aux = "\nID Produto: "+getId();
        aux += "\nNome Produto: "+getNome();
        aux+="\nValor Unitário Produto: "+getValorUnitario();
        aux+="\nQuantidade em estoque: "+getQuantidadeEmEstoque();
        return aux;
    }
}
