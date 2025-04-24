package PowerPoint3.Exercicio2;

public class Aluno {
    String nome;
    int matricula;
    String [] disciplina = new String[3];
    double [] nota1 = new double[3];
    double [] nota2 = new double[3];

    public void imprimirInformacoes(){
        System.out.println("\nNome: " + nome);
        System.out.println("Matrícula: " + matricula);
        for (int i = 0; i < 3; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            String status = media >= 6 ? "Aprovado" : "Reprovado";
            System.out.println("Disciplina: " + disciplina[i]);
            System.out.println("Nota 1: " + nota1[i]);
            System.out.println("Nota 2: " + nota2[i]);
            System.out.println("Média: "+ media);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }

}

