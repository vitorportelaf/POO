package PowerPoint4.Exercicio5;

public class App {
    public static void main(String[] args) {

        Distancia[] distancia = new Distancia[5];

        for (int i = 0; i < distancia.length; i++) {
            distancia[i] = new Distancia(Math.random()*50);
        }

        for (Distancia d : distancia) {
            System.out.println("Distância em metros --> " + d.distancia);
            System.out.println("Distância em milhas --> " + d.paraMilhas());
            System.out.println("Distância em pés --> " + d.paraPes());
            System.out.println();
        }

    }
}
