package ExRevisaoCP3.br.fiap.assento;

public class Assento {
    private int numero;
    private boolean disponivel;

    public Assento(int numero) {
        this.numero = numero;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        String aux = "\nAssento: "+getNumero();
        return aux;
    }
}
