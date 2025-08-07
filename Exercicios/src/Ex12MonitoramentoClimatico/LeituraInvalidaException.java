package Ex12MonitoramentoClimatico;

public class LeituraInvalidaException extends RuntimeException {
    public LeituraInvalidaException(int posicao, double temperatura) {

        super("Leitura inválida na posição: "+posicao+": "+temperatura+"°C");
    }
}
