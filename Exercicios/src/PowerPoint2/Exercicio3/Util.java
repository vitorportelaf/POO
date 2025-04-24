package PowerPoint2.Exercicio3;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    private Banco b = new Banco();

    public void menuPrincipal(){
        int opcao;
        String menu = "MENU PRINCIPAL";
        menu += "\n1. Consultar saldo\n2. Depositar\n3. Sacar\n4. Sair";

        do{
            opcao=parseInt(showInputDialog(menu));
            if(opcao <1 || opcao >4){
                showMessageDialog(null, "Opção inválida!", "Aviso", WARNING_MESSAGE);
            }else{
                switch(opcao){
                    case 1:
                        menuSaldo();
                        break;
                    case 2:
                        menuDepositar();
                        break;
                    case 3:
                        menuSacar();
                        break;
                }
            }
        }while(opcao != 4);
    }

    private void menuSaldo(){
        showMessageDialog(null, "SALDO ATUAL\n"+b.saldo);
    }

    private void menuDepositar(){
        double valorDepositar;
        valorDepositar=parseDouble(showInputDialog("MENU DEPOSITAR\nInsira o valor desejado para depositar: "));
        b.saldo = b.saldo + valorDepositar;
        showMessageDialog(null,"Deposito bem sucedido!");
    }

    private void menuSacar(){
        double valorSacar;
        valorSacar=parseDouble(showInputDialog("MENU SACAR\nInsira o valor desejado para sacar: "));
        b.saldo = b.saldo - valorSacar;
        showMessageDialog(null,"Saque bem sucedido!");
    }

}
