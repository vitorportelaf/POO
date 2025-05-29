package Ex11Geral01.br.fiap.notafiscal;

import Ex11Geral01.br.fiap.cliente.Cliente;
import Ex11Geral01.br.fiap.item.ItemProduto;
import Ex11Geral01.br.fiap.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<ItemProduto> notaFiscal;
    private Cliente cliente;
    private boolean status;

    public NotaFiscal(List<ItemProduto> notaFiscal, Cliente cliente, boolean status) {
        this.notaFiscal = notaFiscal;
        this.cliente = cliente;
        this.status = status;
    }

    public List<ItemProduto> getNotaFiscal() {
        return notaFiscal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void adicionarItem(ItemProduto item){
        notaFiscal.add(item);
    }

    public void removerProduto(Produto produto){
        notaFiscal.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemProduto item : notaFiscal) {
            total += item.calcularTotal();
        }
        return total;
    }
}
