package ExRevisaoCP3.br.fiap.reserva;

import ExRevisaoCP3.br.fiap.cliente.Cliente;
import ExRevisaoCP3.br.fiap.assento.Assento;
import ExRevisaoCP3.br.fiap.cliente.PessoaJuridica;

public class Reserva {
    Cliente cliente;
    double valorOriginal;
    double valorFinal;
    Assento assento;

    public Reserva(Cliente cliente, double valorOriginal, Assento assento) {
        this.cliente = cliente;
        this.valorOriginal = valorOriginal;
        this.assento = assento;

        if(cliente instanceof PessoaJuridica){
            valorFinal = ((PessoaJuridica) cliente).aplicarDesconto(valorOriginal);
        }else{
            valorFinal = valorOriginal;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public Assento getAssento() {
        return assento;
    }
}
