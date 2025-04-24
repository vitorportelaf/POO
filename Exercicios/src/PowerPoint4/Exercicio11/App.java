package PowerPoint4.Exercicio11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String titulo;
        int totalAula;
        double valorAula;


        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Título: ");
        titulo = sc.next();
        System.out.print("Total de aulas semanais: ");
        totalAula = sc.nextInt();
        System.out.print("Valor da aula: R$ ");
        valorAula = sc.nextDouble();

        Professor p = new Professor(nome, titulo, totalAula, valorAula);

        System.out.println("\nDados do Professor:");
        System.out.println("Nome: " + p.nome);
        System.out.println("Título: " + p.titulo);
        System.out.println("Total de aulas semanais: " + p.totalAula);
        System.out.println("Valor da aula: R$ " + p.valorAula);
        System.out.println("Salario: R$"+p.salarioTotal());

        sc.close();

    }
}
