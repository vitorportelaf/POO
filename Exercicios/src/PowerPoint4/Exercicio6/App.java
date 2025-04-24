package PowerPoint4.Exercicio6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;

        System.out.println("Informe a hora: ");
        hora=sc.nextInt();
        System.out.println("Informe o minuto: ");
        minuto=sc.nextInt();
        System.out.println("Informe o segundo: ");
        segundo=sc.nextInt();

        Hora h = new Hora(hora,minuto,segundo);

        System.out.println(h.formatar());

    }
}
