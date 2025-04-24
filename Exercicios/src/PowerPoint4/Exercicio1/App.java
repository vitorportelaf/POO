package PowerPoint4.Exercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cor;
        int marcha;
        double valor;

        Bicicleta b = new Bicicleta();

        System.out.println("Informe a cor da bicicleta:");
        b.cor=sc.next();
        System.out.println("Informe a marcha da bicicleta:");
        b.marcha=sc.nextInt();
        System.out.println("Informe o valor da bicicleta:");
        b.valor=sc.nextDouble();

        b.exibirDados();
    }
}
