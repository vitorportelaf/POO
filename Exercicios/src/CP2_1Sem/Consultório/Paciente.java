package CP2_1Sem.Consultório;

public class Paciente {
    private int cpf;
    private String nomePaciente;
    private int telefone;

    public Paciente(int cpf, String nomePaciente, int telefone) {
        this.cpf = cpf;
        this.nomePaciente = nomePaciente;
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nome) {
        this.nomePaciente = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
