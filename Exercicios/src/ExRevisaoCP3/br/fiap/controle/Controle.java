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

    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Assento> assentos = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            assentos.add(new Assento(i));
        }
    }

    private String gerarMenu(){
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA";
        aux += "\n1. Reservar";
        aux += "\n2. Pesquisar Reserva";
        aux += "\n3. Cancelar Reserva";
        aux += "\n4. Finalizar";
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
                        pesquisarReserva();
                        break;
                    case 3:
                        cancelarReserva();
                        break;
                    case 4:
                        return;
                    default:
                        showMessageDialog(null, "Informe uma opção CORRETAMENTE!");
                }
            }
            catch (NumberFormatException e){
                showMessageDialog(null, "Tente inserir um número CORRETAMENTE!");
            }
        }
    }

    public void reservar(){
        Cliente cliente;
        String nome = showInputDialog("Informe o nome do cliente:");
        String contato = showInputDialog("Informe o contato do cliente (email):");
        String tipoId = showInputDialog("Informe o tipo do cliente Físico(F) ou Jurídico(J):");
        while(!tipoId.equalsIgnoreCase("f") && !tipoId.equalsIgnoreCase("j")){
            tipoId = showInputDialog("Informe o tipo do cliente Físico(F) ou Jurídico(J) CORRETAMENTE:");
        }
        if(tipoId.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe o CPF do cliente:");
            cliente = new PessoaFisica(nome, contato, cpf);
        }else{
            String cnpj = showInputDialog("Informe o CNPJ do cliente:");
            cliente = new PessoaJuridica(nome, contato, cnpj);
        }
        clientes.add(cliente);

        String assentoDisponiveis = "Assentos Disponíveis:\n";
        for(Assento a : assentos){
            if(a.isDisponivel()){
                assentoDisponiveis+=a.getNumero()+" ";
            }
        }
        int num = parseInt(showInputDialog(assentoDisponiveis+"\nInforme o número do assento:"));
        Assento assento = assentos.get(num - 1);
        if(!assento.isDisponivel()){
            showMessageDialog(null, "Assento ja escolhido!");
            return;
        }

        double valorOriginal = parseDouble(showInputDialog("Informe o preço da passagem:"));

        assento.setDisponivel(false);
        Reserva reserva = new Reserva(cliente, valorOriginal, assento);
        reservas.add(reserva);
        showMessageDialog(null, "Reserva concluída com sucesso!");
    }

    public void pesquisarReserva(){
        String resultado = null;
        String tipoId = showInputDialog("Informe o tipo do cliente Físico(F) ou Jurídico(J):");
        while(!tipoId.equalsIgnoreCase("f") && !tipoId.equalsIgnoreCase("j")){
            tipoId = showInputDialog("Informe o tipo do cliente Físico(F) ou Jurídico(J) CORRETAMENTE:");
        }
        if(tipoId.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe o CPF do cliente:");
            for(Reserva r : reservas){
                if (r.getCliente().getIdentificador().equalsIgnoreCase(cpf)) {
                    resultado = r.toString();
                }
            }
        }else{
            String cnpj = showInputDialog("Informe o CNPJ do cliente:");
            for(Reserva r : reservas){
                if (r.getCliente().getIdentificador().equalsIgnoreCase(cnpj)) {
                    resultado = r.toString();
                }
            }
        }
        if(resultado!=null){
            showMessageDialog(null, resultado);
        }else{
            showMessageDialog(null, "Reserva não encontrada!");
        }
    }

    public void cancelarReserva(){
        Reserva reserva = null;
        String tipoId = showInputDialog("Informe o tipo do cliente Físico(F) ou Jurídico(J):");
        while(!tipoId.equalsIgnoreCase("f") && !tipoId.equalsIgnoreCase("j")){
            tipoId = showInputDialog("Informe o tipo do cliente Físico(F) ou Jurídico(J) CORRETAMENTE:");
        }
        if(tipoId.equalsIgnoreCase("f")){
            String cpf = showInputDialog("Informe o CPF do cliente:");
            for(Reserva r : reservas){
                if (r.getCliente().getIdentificador().equalsIgnoreCase(cpf)) {
                    reserva = r;
                }
                if(reserva!=null){
                    reservas.remove(reserva);
                    r.getAssento().setDisponivel(true);
                    showMessageDialog(null, "Reserva cancelada com sucesso!");
                }else{
                    showMessageDialog(null, "Reserva não encontrada!");
                }
                return;
            }
        }else{
            String cnpj = showInputDialog("Informe o CNPJ do cliente:");
            for(Reserva r : reservas){
                if (r.getCliente().getIdentificador().equalsIgnoreCase(cnpj)) {
                    reserva = r;
                }
                if(reserva!=null){
                    reservas.remove(reserva);
                    r.getAssento().setDisponivel(true);
                    showMessageDialog(null, "Reserva cancelada com sucesso!");
                }else{
                    showMessageDialog(null, "Reserva não encontrada!");
                }
                return;
            }
        }
    }
}
