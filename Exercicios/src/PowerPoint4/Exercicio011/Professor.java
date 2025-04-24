package PowerPoint4.Exercicio011;

public class Professor {
    // variáveis de instância
    String nome;
    int totalAula;
    double valorAula;
    String titulo;

    // construtor
    public Professor(String nome, int totalAula, double valorAula, String titulo) {
        this.nome = nome;
        this.totalAula = totalAula;
        this.valorAula = valorAula;
        this.titulo = titulo;
    }

    // método para calcular e retornar o salário bruto
    public double calcularSalario() {
        double salarioBase, horaAtividade, descanso;

        // cálculo do salário base
        salarioBase = totalAula * 4.5 * valorAula;
        if(titulo.equalsIgnoreCase("mestre")) {
            salarioBase *= 1.085;
        }
        else if(titulo.equalsIgnoreCase("doutor")) {
            salarioBase *= 1.12;
        }

        // cálculo da hora atividade
        horaAtividade = salarioBase * 0.05;

        // cálculo do descanso semanal
        descanso =  (salarioBase + horaAtividade) / 6;

        return (salarioBase + horaAtividade + descanso);
    }

    // método para retornar os dados (nome e salário)
    public String getDados() {
        String aux = "";
        aux += "Nome: " + nome + "\n";
        aux += "Salário bruto: R$ " + String.format("%.2f", calcularSalario()) + "\n";
        return aux;
    }

}
