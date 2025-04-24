package PowerPoint3.Exercicio02;

public class Disciplina {
    private String nomeDisciplina;
    private double nota1;
    private double nota2;

    public Disciplina(String nomeDisciplina, double nota1, double nota2) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getStatus() {
        return calcularMedia() >= 6 ? "Aprovado" : "Reprovado";
    }

    public String getNome() {
        return nomeDisciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}

