package PowerPoint1;

import java.util.Scanner;

public class Exercicio2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i, j;
        int totalParcial, maior = 0;

        System.out.println("Informe o primeiro número: ");
        i=sc.nextInt();
        System.out.println("Informe o segundo número: ");
        j=sc.nextInt();

        while(i<=j){
            totalParcial = calcular(i);
            if(totalParcial>maior){
                maior = totalParcial;
            }
            i++;
        }
        System.out.println("\nMaior número de impressões: "+maior);
    }

    public static int calcular(int i){
        int total = 0;

        while(true){
            total++;
            System.out.print(i+" ");
            if(i == 1){
                break;
            }if(i%2!=0){
                i=3*i+1;
            }else{
                i=i/2;
            }
        }
        return total;
    }
}