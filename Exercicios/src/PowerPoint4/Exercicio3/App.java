package PowerPoint4.Exercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Retangulo retangulo;
        double base, altura;

        // entrada de dados

            System.out.println("Retângulo: ");
            System.out.print("Base --> ");
            base = teclado.nextDouble();
            System.out.print("Altura --> ");
            altura = teclado.nextDouble();
            retangulo = new Retangulo(base, altura);
            System.out.println();


        // saída de dados (aqui vou usar o for tradicional)

            System.out.println("Retângulo: ");
            System.out.println("Área: " + retangulo.calcularArea());
            System.out.println("Perímetro: " + retangulo.calcularPerimetro());
            System.out.println();

    }
}
