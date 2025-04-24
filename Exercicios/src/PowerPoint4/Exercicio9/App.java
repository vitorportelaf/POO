package PowerPoint4.Exercicio9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;

        Circulo circulo = new Circulo(Math.random()*10);

        System.out.println("Raio: "+circulo.raio);
        System.out.println("Area: "+circulo.calcularArea());
        System.out.println("Perimetro: "+circulo.calcularPerimetro());
    }
}
