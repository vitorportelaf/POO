package PowerPoint3.Exercicio4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cargo, novoCargo;
        double salario, porcentagem;

        System.out.println("Nome do funcionario: ");
        nome=sc.next();
        System.out.println("Cargo do funcionario: ");
        cargo=sc.next();
        System.out.println("Salario do funcionario: ");
        salario=sc.nextDouble();

        Funcionario f = new Funcionario(nome, cargo, salario);

        System.out.println("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem=sc.nextDouble();
        while(porcentagem<0 || porcentagem>100){
            System.out.println("Digite a porcentagem de aumento CORRETAMENTE (0 - 100): ");
            porcentagem=sc.nextDouble();
        }

        f.aumentarSalario(cargo, porcentagem);
        System.out.println("Novo salario R$ "+f.salario);

        //aumentar o salario de acordo com o cargo e uma porcentagem
        System.out.println("\nDigite a porcentagem de aumento (0 - 100): ");
        porcentagem=sc.nextDouble();
        while(porcentagem<0 || porcentagem>100){
            System.out.println("Digite a porcentagem de aumento CORRETAMENTE (0 - 100): ");
            porcentagem=sc.nextDouble();
        }
        System.out.println("Digite o cargo que tera aumento: ");
        cargo = sc.next();
        f.aumentarSalarioCargo(cargo, salario);
        System.out.println("Novo salario R$ "+f.salario);

        //promover cargo
        System.out.println("Informe o cargo que deseja promover: ");
        novoCargo=sc.next();
        f.promover(novoCargo);
        System.out.println("Novo cargo: "+f.cargo);
    }
}