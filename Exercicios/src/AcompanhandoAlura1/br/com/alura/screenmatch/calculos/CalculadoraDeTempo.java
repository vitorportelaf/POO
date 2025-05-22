package AcompanhandoAlura1.br.com.alura.screenmatch.calculos;


import AcompanhandoAlura1.br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal+=f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal+=s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo t){
        tempoTotal+=t.getDuracaoEmMinutos();
    }
}
