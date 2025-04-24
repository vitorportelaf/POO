package PowerPoint1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Informe o N: ");
        n=sc.nextInt();
        metodo(n);
        sc.close();
    }
    public static void metodo(int n){
        while(true){
            System.out.print(n+" ");
            if(n == 1){
                break;
            }
            if(n%2!=0){
                n=3*n+1;
            }else{
                n=n/2;
            }
        }
    }

}
