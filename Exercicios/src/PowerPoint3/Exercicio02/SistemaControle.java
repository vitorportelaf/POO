package PowerPoint3.Exercicio02;

import java.util.Scanner;

public class SistemaControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        Aluno aluno = new Aluno(nome, matricula);

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome da disciplina " + (i + 1) + ": ");
            String nomeDisciplina = sc.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            sc.nextLine();

            Disciplina d = new Disciplina(nomeDisciplina, nota1, nota2);
            aluno.adicionarDisciplina(d);
        }

        System.out.println("\n--- Boletim do Aluno ---");
        aluno.exibirInformacoes();

        sc.close();
    }
}