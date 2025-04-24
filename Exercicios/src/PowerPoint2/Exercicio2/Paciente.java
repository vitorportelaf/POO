package PowerPoint2.Exercicio2;

public class Paciente {
    String nome;
    int idade;

    public int frequenciaMax(){
        return 220 - idade;
    }

    public double frequenciaMinAlvo(){
        return frequenciaMax()*0.5;
    }
    public double frequenciaMaxAlvo(){
        return frequenciaMax()*0.85;
    }
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Frequência Cardíaca Máxima: " + frequenciaMax() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + frequenciaMinAlvo() + " bpm a " + frequenciaMaxAlvo() + " bpm");
    }
}

