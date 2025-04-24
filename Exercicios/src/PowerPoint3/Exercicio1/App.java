package PowerPoint3.Exercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador j = new Jogador();

        System.out.println("Informe o nome do jogador: ");
        j.nome=sc.next();
        for (int i=0;i<j.pontuacao.length;i++) {
            System.out.println("Informe a pontuação da "+(i+1)+"° rodada: ");
            j.pontuacao[i]=sc.nextInt();
        }
        System.out.println("\nNome do jogador: "+j.nome);
        for(int i=0;i<j.pontuacao.length;i++){
            System.out.println("Pontuação na rodada "+(i+1)+": "+ j.pontuacao[i]);
        }
        System.out.println("Pontuação total: "+j.pontuacaoTotal());
    }
}
