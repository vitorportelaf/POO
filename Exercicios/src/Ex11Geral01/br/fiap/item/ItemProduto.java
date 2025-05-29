package Ex11Geral01.br.fiap.item;

import Ex11Geral01.br.fiap.produto.Produto;

public class ItemProduto {
    private Produto produto;
    private int quantidadeComprada;

    public double calcularTotal(){
        return produto.getValorUnitario()*quantidadeComprada;
    }

    @Override
    public String toString() {
        String aux = "\nQuantidade comprada: "+quantidadeComprada;
        aux+="Total: "+calcularTotal();
        return aux;
    }
}
