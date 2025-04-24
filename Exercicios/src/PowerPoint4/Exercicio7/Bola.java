package PowerPoint4.Exercicio7;

public class Bola {
    String cor;
    double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public Bola maiorBola(Bola b2, Bola b3){
        Bola aux;
        if(this.raio > b2.raio && this.raio > b3.raio){
            aux = this;
        }else if(b2.raio > b3.raio){
            aux = b2;
        }else{
            aux = b3;
        }
        return aux;
    }

    public String retornarDados() {
        return cor + " " + raio;
    }
}
