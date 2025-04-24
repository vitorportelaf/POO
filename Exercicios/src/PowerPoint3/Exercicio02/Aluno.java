package PowerPoint3.Exercicio02;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d) {
        if (disciplinas.size() < 3) {
            disciplinas.add(d);
        } else {
            System.out.println("Limite de 3 disciplinas atingido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        for (Disciplina d : disciplinas) {
            System.out.println("Disciplina: " + d.getNome());
            System.out.println("Nota 1: " + d.getNota1());
            System.out.println("Nota 2: " + d.getNota2());
            System.out.println("Média: " + d.calcularMedia());
            System.out.println("Status: " + d.getStatus());
            System.out.println();
        }
    }
}
