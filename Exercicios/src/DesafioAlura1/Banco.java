package DesafioAlura1;

public class Banco {
    private String nomeCliente;
    private String tipoConta;
    private double saldo;

    public Banco(String nomeCliente, String tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double receberValor(double valor){
        saldo+=valor;
        return saldo;
    }

    public double transferirValor(double valor){
        saldo-=valor;
        return saldo;
    }
}
