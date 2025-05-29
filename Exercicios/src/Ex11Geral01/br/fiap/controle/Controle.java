package Ex11Geral01.br.fiap.controle;

import Ex11Geral01.br.fiap.cliente.Cliente;
import Ex11Geral01.br.fiap.item.ItemProduto;
import Ex11Geral01.br.fiap.notafiscal.NotaFiscal;
import Ex11Geral01.br.fiap.produto.Produto;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Cliente>clientes=new ArrayList<>();
    private ArrayList<Produto>produtos=new ArrayList<>();
    private ArrayList<ItemProduto>itemProdutos=new ArrayList<>();
    private NotaFiscal nf;
}
