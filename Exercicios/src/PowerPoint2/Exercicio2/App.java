package PowerPoint2.Exercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente p = new Paciente();

        System.out.print("Nome do paciente: ");
        p.nome=sc.next();

        System.out.print("Idade do paciente: ");
        p.idade=sc.nextInt();
        System.out.println("");
        p.imprimirInformacoes();
    }

}
