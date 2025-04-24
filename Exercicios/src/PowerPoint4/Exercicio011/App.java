package PowerPoint4.Exercicio011;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor[] professor = new Professor[3];
        String nome, titulo;
        int totalAula;
        double valorAula;

        // entrada de dados
        for (int i = 0; i < professor.length; i++) {
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Título: ");
            titulo = sc.next();
            System.out.print("Total de aulas semanais: ");
            totalAula = sc.nextInt();
            System.out.print("Valor da aula: R$ ");
            valorAula = sc.nextDouble();
            sc.nextLine(); // retirar o enter que sobrou da entrada logo acima
            professor[i] = new Professor(nome, totalAula, valorAula, titulo);
            System.out.println(professor[i].getDados());
        }

        // saída de dados

    }
}
