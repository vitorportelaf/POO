package PowerPoint2.Exercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salario s = new Salario();

        for(int i=0;i<s.professor.length;i++){
            System.out.println("Informe o nome do professor: ");
            s.professor[i]=sc.next();
            System.out.println("Informe quantas aulas o professor faz por semana: ");
            s.aulasSemanais[i]=sc.nextInt();
            System.out.println("Informe qual o valor da hora-aula: ");
            s.valorHora[i]=sc.nextDouble();
        }

        for(int i=0;i<s.professor.length;i++){
            System.out.println("Salario do professor: "+s.professor[i]+" - "+s.salarioFinal()[i]);
        }


        sc.close();
    }
}
