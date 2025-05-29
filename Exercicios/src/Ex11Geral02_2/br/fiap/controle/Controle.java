package Ex11Geral02_2.br.fiap.controle;

import Ex11Geral02_2.br.fiap.assento.Assento;
import Ex11Geral02_2.br.fiap.cliente.Cliente;
import Ex11Geral02_2.br.fiap.cliente.PessoaFisica;
import Ex11Geral02_2.br.fiap.cliente.PessoaJuridica;
import Ex11Geral02_2.br.fiap.reserva.Reserva;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Controle {
    private static ArrayList<Cliente>clientes=new ArrayList<>();
    private static ArrayList<Assento>assentos=new ArrayList<>();
    private static ArrayList<Reserva>reservas=new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            assentos.add(new Assento(i));
        }
    }

    public String gerarMenu(){
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA";
        aux+="\n1. Reservar";
        aux+="\n2. Pesquisar reserva";
        aux+="\n3. Cancelar reserva";
        aux+="\n4. Finalizar";
        return aux;
    }

    public void menu(){
        int opcao;
        while(true){
            try{
                opcao = parseInt(showInputDialog(gerarMenu()));
                switch (opcao){
                    case 1:
                        reservar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        cancelar();
                        break;
                    case 4:
                        return;
                    default:
                        showMessageDialog(null, "Insira uma opção CORRETAMENTE!");
                }
            }catch (NumberFormatException e){
                showMessageDialog(null, "Insira um opção CORRETAMENTE");
            }
        }
    }

    public void reservar(){
        Cliente cliente;
        String nome = showInputDialog("Informe o nome do cliente:");
        String contato = showInputDialog("Informe o contato do cliente:");
        String id = showInputDialog("Informe se o cliente é uma Pessoa Física(F) ou Jurídica(J):");
        while(!id.equalsIgnoreCase("f") && !id.equalsIgnoreCase("j")){
            id = showInputDialog("Informe se o cliente é uma Pessoa Física(F) ou Jurídica(J) CORRETAMENTE:");
        }
        if(id.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe o CPF do cliente:");
            cliente = new PessoaFisica(nome, contato, cpf);
        }else{
            String cnpj = showInputDialog("Informe o CNPJ do cliente:");
            cliente = new PessoaJuridica(nome, contato, cnpj);
        }
        clientes.add(cliente);

        String assentosDisponiveis = "Assentos Disponíveis:\n";
        for(Assento a : assentos){
            if(a.isDisponivel()){
                assentosDisponiveis+=a.getNumero()+" ";
            }
        }
        int num = parseInt(showInputDialog(assentosDisponiveis+"\nInforme o número do assento:"));
        Assento assento = assentos.get(num - 1);
        if(!assento.isDisponivel()){
            showMessageDialog(null, "Assento ja escolhido, selecione outro!");
        }

        double valorOriginal = parseDouble(showInputDialog("Informe o valor da passagem:"));

        assento.setDisponivel(false);
        Reserva reserva = new Reserva(cliente, valorOriginal, assento);
        reservas.add(reserva);
        showMessageDialog(null, "Reserva concluída com sucesso!");
    }

    public void pesquisar(){
        String id = showInputDialog("Informe o CPF ou CNPJ do cliente:");
        String resultado = null;
        for(Reserva r : reservas){
            if(r.getCliente().getIdentificador().equals(id)){
                resultado = r.toString();
            }
        }
        if(resultado!=null){
            showMessageDialog(null, resultado);
        }else{
            showMessageDialog(null, "Reserva não encontrada!");
        }
    }

    public void cancelar(){
        String id = showInputDialog("Informe o CPF ou CNPJ do cliente:");
        Reserva reserva = null;
        for(Reserva r : reservas){
            if(r.getCliente().getIdentificador().equals(id)){
                reserva = r;
            }
        }
        if(reserva!=null){
            reservas.remove(reserva);
            reserva.getAssento().setDisponivel(true);
            showMessageDialog(null, "Reserva cancelada com sucesso!");
        }else{
            showMessageDialog(null, "Reserva não encontrada!");
        }
    }

}
