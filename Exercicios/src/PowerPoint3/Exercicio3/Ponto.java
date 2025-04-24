package PowerPoint3.Exercicio3;

public class Ponto {
    //atributos ou variaveis de instancia
    int x;
    int y;

    //metodo para calcular e retornar a distancia entre dois pontos
    public double calcularDistancia(Ponto p){
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2)+Math.pow(y - p.y, 2));
        return distancia;
    }

    //metodo para calcular e retornar a distancia de um ponto ate o ponto de origem(0,0)
    public double calcularDistanciaOrigem(){
        double distancia;
        Ponto origem = new Ponto();
        distancia=calcularDistancia(origem);
        return distancia;
    }

    //metodo apra retornar os dados do ponto
    public String formatarPonto(){
        return "("+x+", "+y+")";
    }

    //metodo para retornar o ponto mais proximo da origem
    public Ponto maisProximoDaOrigem(Ponto p1, Ponto p2){
        double dp1 = p1.calcularDistanciaOrigem();
        double dp2 = p2.calcularDistanciaOrigem();
        if(dp1<dp2){
            return p1;
        }
        return p2;
    }

}