package PowerPoint3.Exercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        a.nome=sc.next();
        System.out.println("Informe a matricula do aluno: ");
        a.matricula=sc.nextInt();

        for (int i = 0; i < 3; i++) {

            System.out.print("Nome da disciplina " + (i + 1) + ": ");
            a.disciplina[i]=sc.next();

            System.out.print("Nota 1: ");
            a.nota1[i] = sc.nextDouble();

            System.out.print("Nota 2: ");
            a.nota2[i] = sc.nextDouble();
        }

        a.imprimirInformacoes();
    }
}

