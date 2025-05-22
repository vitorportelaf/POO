package ExRevisaoCP3.br.fiap.reserva;

import ExRevisaoCP3.br.fiap.assento.Assento;
import ExRevisaoCP3.br.fiap.cliente.Cliente;
import ExRevisaoCP3.br.fiap.cliente.PessoaJuridica;

public class Reserva {
    private Cliente cliente;
    private double valorOriginal;
    private double valorFinal;
    private Assento assento;

    public Reserva(Cliente cliente, double valorOriginal, Assento assento) {
        this.cliente = cliente;
        this.valorOriginal = valorOriginal;
        this.assento = assento;
        if(cliente instanceof PessoaJuridica){
            this.valorFinal = valorOriginal - ((PessoaJuridica) cliente).aplicarDesconto(valorOriginal);
        }else{
            this.valorFinal = valorOriginal;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public Assento getAssento() {
        return assento;
    }

    @Override
    public String toString() {
        String aux = cliente.toString();
        aux += assento.toString();
        aux += "\nValor Pago: "+valorFinal;
        return aux;
    }
}
