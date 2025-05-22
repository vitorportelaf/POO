package CP2_1Sem.Consultório;

public class Medico {
    private int crm;
    private String nomeMedico;
    private String especialidade;
    private double valorConsulta;

    public Medico(int crm, String nomeMedico, String especialidade, double valorConsulta) {
        this.crm = crm;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
