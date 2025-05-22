package DesafioAlura1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente=sc.nextLine();
        System.out.println("Insira o tipo de conta: ");
        String tipoConta=sc.next();
        System.out.println("Insira o saldo da conta:");
        double saldo=sc.nextDouble();

        Banco banco = new Banco(nomeCliente, tipoConta, saldo);

        System.out.println("\n****************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: "+banco.getNomeCliente());
        System.out.println("Tipo conta: "+banco.getTipoConta());
        System.out.println("Saldo: R$"+df.format(banco.getSaldo()));
        System.out.println("****************************************\n");

        int opcao;
        do{
            System.out.println("Operações\n");
            System.out.println("1- Consultar saldo\n2- Receber valor\n3- Transferir valor\n4- Sair\n");
            opcao=sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Saldo atual: R$"+banco.getSaldo());
                    break;
                case 2:
                    System.out.println("Insira o valor recebido: ");
                    double valor = sc.nextDouble();
                    if(valor<=0){
                        System.out.println("Insira um valor positivo!: ");
                        valor = sc.nextDouble();
                    }
                    System.out.println("Saldo atual: R$"+banco.receberValor(valor));
                    break;
                case 3:
                    System.out.println("Insira o valor transferido: ");
                    valor = sc.nextDouble();
                    if(valor>banco.getSaldo()){
                        System.out.println("Saldo insuficiente!");
                        System.out.println("Insira um valor menor ou igual ao saldo:");
                        valor = sc.nextDouble();
                    }
                    System.out.println("Saldo atual: R$"+banco.transferirValor(valor));
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (opcao!=4);
        sc.close();


    }
}
