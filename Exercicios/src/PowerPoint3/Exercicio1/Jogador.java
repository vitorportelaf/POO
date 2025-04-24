package PowerPoint3.Exercicio1;

import java.util.Scanner;

public class Jogador {
    String nome;
    int [] pontuacao = new int[3];

    public int pontuacaoTotal(){
        int total = 0;
        for(int i : pontuacao){
            total += i;
        }
        return total;
    }
}

