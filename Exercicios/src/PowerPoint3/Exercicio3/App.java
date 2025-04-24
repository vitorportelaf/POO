package PowerPoint3.Exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //entrada de dados
        System.out.print("Informe a coordenada X do ponto 1: ");
        p1.x=sc.nextInt();
        System.out.print("Informe a coordenada Y do ponto 1: ");
        p1.y=sc.nextInt();
        System.out.print("Informe a coordenada X do ponto 2: ");
        p2.x=sc.nextInt();
        System.out.print("Informe a coordenada Y do ponto 2: ");
        p2.y=sc.nextInt();

        //impressao da distancia entre dois pontos
        System.out.println("\nDistancia do ponto 1 para o ponto 2: "+formato.format(p1.calcularDistancia(p2)));
        System.out.println("Distancia do ponto 2 para o ponto 1: "+formato.format(p2.calcularDistancia(p1)));

        //impressao da distancia entre cada ponto e a origem (0,0)
        System.out.println("\nDistancia do ponto 1 ate o ponto de origem: "+formato.format(p1.calcularDistanciaOrigem()));
        System.out.println("Distancia do ponto 2 ate o ponto de origem: "+formato.format(p2.calcularDistanciaOrigem()));

        //impressao de qual esta mais perto do ponto de origem
        Ponto aux = p1.maisProximoDaOrigem(p1, p2);
        System.out.println(aux.formatarPonto());
    }
}
