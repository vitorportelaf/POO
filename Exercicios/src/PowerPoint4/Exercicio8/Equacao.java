package PowerPoint4.Exercicio8;

import java.text.DecimalFormat;

public class Equacao {
    double a, b, c;

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcularRaiz() {
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        double delta;
        double[] raiz = new double[2];

        delta = calcularDelta();
        if(delta < 0) {
            aux = "A equação não tem raiz real";
        } else {
            raiz[0] = (-b + Math.sqrt(delta)) / (2 * a);
            raiz[1] = (-b - Math.sqrt(delta)) / (2 * a);
            aux += "x1 = " + df.format(raiz[0]) + "\n";
            aux += "x2 = " + df.format(raiz[1]) + "\n";
        }
        return aux;
    }

    private double calcularDelta() {
        return (b * b - 4 * a * c);
    }
}