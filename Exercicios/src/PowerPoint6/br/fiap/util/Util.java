package PowerPoint6.br.fiap.util;

import PowerPoint6.br.fiap.fornecedor.Fornecedor;
import PowerPoint6.br.fiap.produto.Produto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;


public class Util {

    private Fornecedor[] fornecedores = new Fornecedor[3];
    private Produto[] produto = new Produto[3];
    private int idxProduto = 0;
    private int idxFornecedor = 0;

    public void menuPrincipal() {
        int opcao;
        String menu = "1. Cadastrar Produto\n2. Pesquisar produto\n3. Pesquisar fornecedor\n4. Finalizar";

        while(true){
            opcao = parseInt(showInputDialog(menu));
            if(opcao == 4){
                return;
            }
            switch(opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisar();
                    break;
                default:
                    showMessageDialog(null, "Opção inválida!", "Aviso", WARNING_MESSAGE);
            }
        }
    }

    private void pesquisar(){
        String aux = "";
        Fornecedor fornecedor = pesquisarFornecedor();
        if(fornecedor != null){
            aux += "Fornecedor: "+fornecedor.getNome()+"\n";
            aux += "CNPJ: "+fornecedor.getCnpj()+"\n";
            showMessageDialog( null, aux);
        }
    }

    private void cadastrarProduto(){
        String nome;
        int qtdEstoque;
        double valor;
        Fornecedor fornecedor = pesquisarFornecedor();
        if(fornecedor == null){
            fornecedor=cadastrarFornecedor();
        }
        nome = showInputDialog("Nome do produto: ");
        valor = parseDouble(showInputDialog("Valor do produto: "));
        qtdEstoque = parseInt(showInputDialog("Quantidade no estoque: "));


        produto[idxProduto] = new Produto(nome,valor,qtdEstoque,fornecedor);
        idxProduto++;
    }

    private Fornecedor cadastrarFornecedor(){
        String nomeFornecedor = showInputDialog("Informe o nome do fornecedor: ");
        long cnpj = parseLong(showInputDialog("Informe o CNPJ do fornecedor: "));
        fornecedores[idxFornecedor] = new Fornecedor(nomeFornecedor, cnpj);
        idxFornecedor++;
        return fornecedores[idxFornecedor-1];
    }

    private void pesquisarProduto(){
        String aux = "Produto não encontrado";
        String nomeProduto = showInputDialog("Nome do produto: ");
        for(int i=0;i<idxProduto;i++){
            if(produto[i].getNome().equalsIgnoreCase(nomeProduto)){
                aux = "";
                aux+="Nome do produto : "+nomeProduto+"\n";
                aux+="Valor unitário: R$"+produto[i].getValor()+"\n";
                aux+="Fornecedor: "+produto[i].getFornecedor().getNome()+"\n";
            }
        }
        showMessageDialog(null, aux);
    }

    private Fornecedor pesquisarFornecedor(){
        long cnpj = parseLong(showInputDialog("Informe o CNPJ do fornecedor: "));
        for(int i = 0; i<idxFornecedor; i++){
            if(fornecedores[i].getCnpj() == cnpj){
                return fornecedores[i];
            }
        }
        showMessageDialog(null, "CNPJ não cadastrado!", "Aviso", WARNING_MESSAGE);
        return null;
    }
}
