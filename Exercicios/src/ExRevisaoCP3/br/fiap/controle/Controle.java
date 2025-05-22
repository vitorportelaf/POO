package ExRevisaoCP3.br.fiap.controle;

import ExRevisaoCP3.br.fiap.assento.Assento;
import ExRevisaoCP3.br.fiap.cliente.Cliente;
import ExRevisaoCP3.br.fiap.cliente.PessoaFisica;
import ExRevisaoCP3.br.fiap.cliente.PessoaJuridica;
import ExRevisaoCP3.br.fiap.reserva.Reserva;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Controle {

    private static ArrayList<Cliente>clientes = new ArrayList<>();
    private static ArrayList<Assento>assentos = new ArrayList<>();
    private static ArrayList<Reserva>reservas = new ArrayList<>();

    static{
        for (int i = 1; i <= 10; i++) {
            assentos.add(new Assento(i));
        }
    }

    public String gerarMenu(){
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA";
        aux += "\n1. Reservar";
        aux += "\n2. Procurar reserva";
        aux += "\n3. Cancelar reserva";
        aux += "\n4. Finalizar";
        return aux;
    }

    public void menu(){
        int opcao;
        while(true){
            try{
                opcao=parseInt(showInputDialog(gerarMenu()));
                switch (opcao){
                    case 1:
                        reservar();
                        break;
                    case 2:
                        pesquisarReserva();
                        break;
                    case 3:
                        cancelarReserva();
                        break;
                    case 4:
                        return;
                    default:
                        showMessageDialog(null, "Insira uma opção EXISTENTE!");
                }
            }
            catch (NumberFormatException e){
                showMessageDialog(null, "Tente informar um número CORRETO!\n"+e);
            }
        }
    }

    public void reservar(){
        Cliente cliente;
        String nome = showInputDialog("Informe o nome do cliente:");
        String contato = showInputDialog("Informe o contato do cliente (email):");
        String tipoId = showInputDialog("Você é uma Pessoa Física(F) ou uma Pessoa Jurídica(J)?:");
        while(!tipoId.equalsIgnoreCase("f") && !tipoId.equalsIgnoreCase("j")){
            tipoId = showInputDialog("Você é uma Pessoa Física(F) ou uma Pessoa Jurídica(J)? (Insira opções CORRETAMENTE):");
        }
        if(tipoId.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe seu CPF:");
            cliente = new PessoaFisica(nome, contato, cpf);
        }else{
            String cnpj = showInputDialog("Informe seu CNPJ:");
            cliente = new PessoaJuridica(nome, contato, cnpj);
        }
        clientes.add(cliente);

        String assentosDisponiveis = "Assentos disponíveis:\n";
        for(Assento a : assentos){
            if(a.isDisponivel()){
                assentosDisponiveis += a.getNumero() + " ";
            }
        }
        int num = parseInt(showInputDialog(assentosDisponiveis + "\nEscolha um assento:"));
        Assento assento = assentos.get(num - 1);
        if (!assento.isDisponivel()) {
            showMessageDialog(null, "Assento indinponível, selecione outro!");
            return;
        }
        double valorOriginal = parseDouble(showInputDialog("Informe o valor da passagem:"));

        assento.setDisponivel(false);
        Reserva reserva = new Reserva(cliente, valorOriginal, assento);
        reservas.add(reserva);
        showMessageDialog(null, "Reserva realizada com sucesso!");
    }

    public void pesquisarReserva(){
        String tipoId = showInputDialog("Você é uma Pessoa Física(F) ou uma Pessoa Jurídica(J)?:");
        while(!tipoId.equalsIgnoreCase("f") && !tipoId.equalsIgnoreCase("j")){
            tipoId = showInputDialog("Você é uma Pessoa Física(F) ou uma Pessoa Jurídica(J)? (Insira opções CORRETAMENTE):");
        }
        if(tipoId.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe seu CPF:");
            for(Reserva r : reservas){
                if(r.getCliente().getIdentificador().equalsIgnoreCase(cpf)){
                    showMessageDialog(null, "Cliente: "+r.getCliente().getNome()+
                            "\nContato: "+r.getCliente().getContato()+
                            "\nAssento: "+r.getAssento().getNumero()+
                            "\nValor Pago: "+r.getValorFinal());
                }
            }
        }else{
            String cnpj = showInputDialog("Informe seu CNPJ:");
            for(Reserva r : reservas){
                if(r.getCliente().getIdentificador().equalsIgnoreCase(cnpj)){
                    showMessageDialog(null, "Cliente: "+r.getCliente().getNome()+
                            "\nContato: "+r.getCliente().getContato()+
                            "\nAssento: "+r.getAssento().getNumero()+
                            "\nValor Pago: "+r.getValorFinal());
                }
            }
        }
    }
    public void cancelarReserva(){
        Reserva reserva = null;
        String tipoId = showInputDialog("Você é uma Pessoa Física(F) ou uma Pessoa Jurídica(J)?:");
        while(!tipoId.equalsIgnoreCase("f") && !tipoId.equalsIgnoreCase("j")){
            tipoId = showInputDialog("Você é uma Pessoa Física(F) ou uma Pessoa Jurídica(J)? (Insira opções CORRETAMENTE):");
        }
        if(tipoId.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe seu CPF:");
            for(Reserva r : reservas){
                if(r.getCliente().getIdentificador().equalsIgnoreCase(cpf)){
                    reserva = r;
                }
                if(reserva!=null){
                    reservas.remove(reserva);
                    r.getAssento().setDisponivel(true);
                    showMessageDialog(null, "Reserva removida com sucesso!");
                }else{
                    showMessageDialog(null, "Reserva não encontrada");
                }
                return;
            }
        }else{
            String cnpj = showInputDialog("Informe seu CNPJ:");
            for(Reserva r : reservas){
                if(r.getCliente().getIdentificador().equalsIgnoreCase(cnpj)){
                    reserva = r;
                }
                if(reserva!=null){
                    reservas.remove(reserva);
                    r.getAssento().setDisponivel(true);
                    showMessageDialog(null, "Reserva removida com sucesso!");
                }else{
                    showMessageDialog(null, "Reserva não encontrada");
                }
                return;
            }
        }
    }

}
