package PowerPoint4.Exercicio7;

public class App {
    public static void main(String[] args) {
        Bola bola1 = new Bola("azul", 2.75);
        Bola bola2 = new Bola("branca", 3.5);
        Bola bola3 = new Bola("vermelha", 3.25);

        Bola aux = bola1.maiorBola(bola2, bola3);
        System.out.println("Dados da bola com o maior raio -> "+aux.retornarDados());
    }
}

