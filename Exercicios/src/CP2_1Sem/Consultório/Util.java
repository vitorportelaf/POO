package CP2_1Sem.Consultório;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    private Paciente [] paciente = new Paciente[3];
    private Medico [] medico =  new Medico[3];
    private Consulta [] consultas = new Consulta[3];
    private int idxPaciente;
    private int idxMedico;
    private int idxConsulta;
    private int faturamentoTotal = 0;

    public void menuPrincipal(){
        int opcao;
        String menu = "1- Cadastrar Paciente\n2- Cadastrar Médico\n3- Marcar Consulta\n4- Listar Consultas\n5- Faturamento\n6- Finalizar";
        while(true){
            try{
                opcao=parseInt(showInputDialog(menu));
                if(opcao == 6){
                    return;
                }
                switch (opcao){
                    case 1:
                        cadastrarPaciente();
                        break;
                    case 2:
                        cadastrarMedico();
                        break;
                    case 3:
                        marcarConsulta();
                        break;
                    case 4:
                        listarConsulta();
                        break;
                    case 5:
                        faturamento();
                        break;
                    default:
                        showMessageDialog(null, "Opção inválida!", "Aviso", WARNING_MESSAGE);
                }
            }
            catch (NumberFormatException e){
                showMessageDialog(null, "Você deve digitar um número\n"+e);
            }
        }
    }

    private Paciente cadastrarPaciente(){
        if(idxPaciente < paciente.length){
            int cpf;
            String nomePaciente;
            int telefone;
            cpf = parseInt(showInputDialog("Informe o CPF do paciente:"));
            nomePaciente = showInputDialog("Informe o nome do paciente:");
            telefone = parseInt(showInputDialog("Informe o telefone do paciente:"));
            paciente[idxPaciente] = new Paciente(cpf, nomePaciente,telefone);
            idxPaciente++;
        }else{
            showMessageDialog(null, "Limite de cadastros atingido!");
        }
        return paciente[idxPaciente-1];
    }

    private Medico cadastrarMedico(){
        if(idxMedico < medico.length){
            int crm;
            String nomeMedico;
            String especialidade;
            double valorConsulta;
            crm = parseInt(showInputDialog("Informe o CRM do médico:"));
            nomeMedico = showInputDialog("Informe o nome do médico:");
            especialidade = showInputDialog("Informe a especialidade do médico");
            valorConsulta= parseDouble(showInputDialog("Informe o valor da consulta com o médico:"));
            medico[idxMedico] = new Medico(crm, nomeMedico, especialidade, valorConsulta);
            idxMedico++;
        }else{
            showMessageDialog(null, "Limite de cadastros atingido!", "Aviso", ERROR_MESSAGE);
        }
        return medico[idxMedico-1];
    }

    private Paciente pesquisarPaciente(int cpf) {
        for (int i = 0; i < idxPaciente; i++) {
            if (paciente[i].getCpf() == cpf) {
                return paciente[i];
            }
        }
        return null;
    }

    private Medico pesquisarMedico(int crm) {
        for (int i = 0; i < idxMedico; i++) {
            if (medico[i].getCrm() == crm) {
                return medico[i];
            }
        }
        return null;
    }

    public void marcarConsulta() {
        int cpf = parseInt(showInputDialog("Insira o CPF do paciente:"));
        Paciente p = pesquisarPaciente(cpf);
        if (p == null) {
            showMessageDialog(null, "Paciente não cadastrado", "Aviso", WARNING_MESSAGE);
            return;
        }
        int crm = parseInt(showInputDialog("Insira o CRM do médico:"));
        Medico m = pesquisarMedico(crm);
        if (m == null) {
            showMessageDialog(null, "Médico não cadastrado", "Aviso", WARNING_MESSAGE);
            return;
        }
        if (idxConsulta < consultas.length) {
            Consulta novaConsulta = new Consulta(p, m, m.getValorConsulta());
            consultas[idxConsulta] = novaConsulta;
            idxConsulta++;
            faturamentoTotal += m.getValorConsulta();
            showMessageDialog(null, "Consulta marcada para o paciente " + p.getNomePaciente() + " com o médico " + m.getNomeMedico());
        } else {
            showMessageDialog(null, "Limite de consultas atingido!", "Aviso", WARNING_MESSAGE);
        }
    }

    private void listarConsulta(){
        if(idxConsulta == 0){
            showMessageDialog(null, "Nenhuma consulta marcada!", "Aviso", WARNING_MESSAGE);
        }else{
            String lista = "";
            for (int i = 0; i < idxConsulta; i++) {
                Consulta c = consultas[i];
                lista += "Paciente: " + c.getPaciente().getNomePaciente()
                        + " | Médico: " + c.getMedico().getNomeMedico()
                        + " | Valor: R$" + c.getValor()
                        + "\n";
            }
            showMessageDialog(null, lista);
        }
    }

    private void faturamento(){
        showMessageDialog(null, "O faturamento total da clínica é de: R$"+faturamentoTotal);
    }

}
