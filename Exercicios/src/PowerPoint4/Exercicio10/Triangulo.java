package PowerPoint4.Exercicio10;

public class Triangulo {
    // variáveis de instância
    int a;
    int b;
    int c;

    // construtor
    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // método para calcular e retornar a área
    public double calcularArea() {
        double s, p;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    // método para calcular e retornar o perímetro
    public double calcularPerimetro() {
        return a + b + c;
    }

    // método para calcular e retornar o centróide x
    public double centroideX() {
        double cx, lambda;
        lambda = calcularLambda();
        cx = (b + a * lambda) / 3;
        return cx;
    }

    // método para calcular e retornar o centroide y
    public double centroideY() {
        double cy, lambda;
        lambda = calcularLambda();
        cy = a / 3 * Math.sqrt(1 - lambda * lambda);
        return cy;
    }

    // método para calcular e retornar o valor de lambda
    public double calcularLambda() {
        double lambda;
        lambda = (a * a + b * b - c * c) / (2 * a * b);
        return lambda;
    }
}
