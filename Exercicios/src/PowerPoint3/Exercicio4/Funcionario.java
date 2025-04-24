package PowerPoint3.Exercicio4;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(String cargo, double porcentagem){
        salario = salario + (salario*porcentagem/100);
    }

    public void aumentarSalarioCargo(String cargo, double percentual){
        if(this.cargo.equalsIgnoreCase(cargo)){
            aumentarSalario(cargo, percentual);
        }
    }

    public void promover(String novoCargo){
        this.cargo = novoCargo;
    }

}
