package PowerPoint4.Exercicio8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Equacao[] equacao = new Equacao[5];
        double a, b, c;

        for(int i = 0; i < equacao.length; ) {
            System.out.print("a --> ");
            a = sc.nextDouble();
            if(a != 0) {
                System.out.print("b --> ");
                b = sc.nextDouble();
                System.out.print("c --> ");
                c = sc.nextDouble();
                equacao[i++] = new Equacao(a, b, c);
            } else {
                System.out.println("Não é uma equação do 2o grau");
            }
            System.out.println();
        }

        for(Equacao e : equacao) {
            System.out.println(e.calcularRaiz());
            System.out.println();
        }
    }
}