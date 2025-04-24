package PowerPoint4.Exercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperatura t = new Temperatura();

        System.out.println("Informe a temperatura em graus Celsius: ");
        t.temp=sc.nextDouble();

        System.out.println("Temperatura em Fahrenheit: "+t.converterFahrenheit(t.temp));
        System.out.println("Temperatura em Kelvin: "+t.converterKelvin(t.temp));
    }
}
