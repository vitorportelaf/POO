package CP2_1Sem.Consultório;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private double valor;

    public Consulta(Paciente paciente, Medico medico, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.valor = valor;
    }

    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public double getValor() { return valor; }
}

