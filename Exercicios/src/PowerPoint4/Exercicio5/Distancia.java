package PowerPoint4.Exercicio5;

public class Distancia {
    double distancia;

    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    public double paraPes() {
        return distancia * 3.28084;
    }

    public double paraMilhas() {
        return distancia * 0.000621371;
    }
}
