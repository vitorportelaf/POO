package PowerPoint5.BilheteUnico;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    //banco de dados
    private BilheteUnico[] bilhete = new BilheteUnico[3];
    private int index = 0;

    public void menuPrincipal(){
        int opcao;
        String menu = "1. Administrador\n2. Usuário\n3. Finalizar";

        do {
            opcao = parseInt(showInputDialog(menu));
            if(opcao <1 || opcao >3){
                showMessageDialog(null, "Opção inválida!", "Aviso", WARNING_MESSAGE);
            }else{
                switch(opcao){
                    case 1:
                        menuAdm();
                        break;
                    case 2:
                        menuUsuario();
                        break;
                }
            }
            //if (opcao == 1) {
            //menuAdm();
            //}
        }while(opcao != 3);
    }

    private void menuAdm(){
        int opcao;
        String menu = "MENU ADMINISTRADOR\n";
        menu += "1. Emitir bilhete\n2. Listar bilhetes\n3. Excluir bilhete\n4. Sair";
        do{
            opcao = parseInt(showInputDialog(menu));
            if(opcao <1 || opcao >4){
                showMessageDialog(null, "Opção inválida!", "Aviso", WARNING_MESSAGE);
            }else{
                switch (opcao){
                    case 1:
                        emitirBilhete();
                        break;
                    case 2:
                        listarBilhetes();
                        break;
                    case 3:
                        excluirBilhete();
                        break;
                }
            }
        }while(opcao != 4);
    }

    private void emitirBilhete(){
        String nome, perfil;
        long cpf;
        if(index<bilhete.length){
            nome=showInputDialog("Nome do usuário: ");
            cpf=parseLong(showInputDialog("CPF do usuário: "));
            perfil=showInputDialog("Perfil do usuário:\nEstudante\nProfessor\nComum");
            bilhete[index] = new BilheteUnico(cpf, nome, perfil);
            index++;
            showMessageDialog(null,"Bilhete emitido com sucesso!");
        }else{
            showMessageDialog(null,"Procure um posto de atendimento!");
        }
    }

    private void listarBilhetes() {
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        for(int i=0;i<index;i++){
            aux="Número do bilhete: "+bilhete[i].numero+"\n";
            aux+="Saldo do bilhete: "+df.format(bilhete[i].saldo)+"\n";
            aux+="Nome do usuário: "+bilhete[i].usuario.nome+"\n";
            aux+="Perfil do usuário: "+bilhete[i].usuario.perfil+"\n";
            aux+="CPF do usuário: "+bilhete[i].usuario.cpf+"\n";
            aux+="\n";
        }
        showMessageDialog(null, aux);
    }

    private void excluirBilhete(){
        int indice = pesquisarBilhete();
        int resposta;

        if(indice != -1){
            resposta = showConfirmDialog(null, "Deseja excluir seu Bilhete?");
            if(resposta == YES_OPTION){
                bilhete[indice] = bilhete[index - 1];
                index--;
            }
        }

    }

    private void menuUsuario(){
        int opcao;
        String menu = "MENU USUÁRIO";
        menu += "\n1. Carregar bilhete\n2. Consultar saldo\n3. Passar catraca\n4. Sair";
        do{
            opcao = parseInt(showInputDialog(menu));
            if(opcao <1 || opcao >4){
                showMessageDialog(null, "Opção inválida!", "Aviso", WARNING_MESSAGE);
            }else{
                switch (opcao){
                    case 1:
                        carregarBilhete();
                        break;
                    case 2:
                        consultarSaldo();
                        break;
                    case 3:
                        passarCatraca();
                        break;
                }
            }
        }while(opcao != 4);
    }

    private int pesquisarBilhete(){
        long cpf = parseLong(showInputDialog("CPF"));
        for(int i=0;i<index;i++){
            if(bilhete[i].usuario.cpf == cpf){
                return i;
            }
        }
        showMessageDialog(null, cpf+" não encontrado", "Aviso", WARNING_MESSAGE);
        return -1;
    }

    private void carregarBilhete() {
        int indice = pesquisarBilhete();
        double valor;
        if(indice != -1){
            valor = parseDouble(showInputDialog("Digite o valor da recarga:"));
            bilhete[indice].carregarBilhete(valor);
        }
    }

    private void consultarSaldo(){
        int indice = pesquisarBilhete();
        if(indice != -1){
            showMessageDialog(null, "Saldo atual: R$"+bilhete[indice].consultarSaldo());
        }
    }

    private void passarCatraca(){
        int indice = pesquisarBilhete();
        if(indice != -1){
            showMessageDialog(null, bilhete[indice].passarCatraca());
        }
    }

}
