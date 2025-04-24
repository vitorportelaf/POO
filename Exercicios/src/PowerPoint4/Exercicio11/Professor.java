package PowerPoint4.Exercicio11;

public class Professor {
    String nome;
    int totalAula;
    double valorAula;
    String titulo;

    public Professor(String nome, String titulo, int totalAula, double valorAula) {
        this.nome = nome;
        this.titulo = titulo;
        this.totalAula = totalAula;
        this.valorAula = valorAula;
    }

    public double calcularSalarioBase(){
        double salarioBase = totalAula * 4.5 * valorAula;
        if(titulo.equalsIgnoreCase("mestre")){
            salarioBase += salarioBase * 0.085;
        }else if(titulo.equalsIgnoreCase("doutor")){
            salarioBase += salarioBase * 0.12;
        }
        return salarioBase;
    }

    public double adicionalHoraAtividade(){
        return (calcularSalarioBase() * 0.05);
    }

    public double descanso(){
        return (calcularSalarioBase() + adicionalHoraAtividade()) / 6;
    }

    public double salarioTotal(){
        return (calcularSalarioBase() + adicionalHoraAtividade() + descanso());
    }
}
