package ExRevisaoCP3_2.br.fiap.reserva;

import ExRevisaoCP3_2.br.fiap.assento.Assento;
import ExRevisaoCP3_2.br.fiap.cliente.Cliente;
import ExRevisaoCP3_2.br.fiap.cliente.PessoaJuridica;

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
            valorFinal = valorOriginal - ((PessoaJuridica) cliente).aplicarDesconto(valorOriginal);
        }else{
            valorFinal = valorOriginal;
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

}
