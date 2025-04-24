package PowerPoint5.BilheteUnico;

import java.util.Random;

public class BilheteUnico {
    double saldo;
    long numero;
    Usuario usuario;
    static final double TARIFA = 5.20;

    public BilheteUnico(long cpf, String nome, String perfil) {
        Random random = new Random();
        numero = random.nextLong(1000, 10000);
        usuario = new Usuario(cpf,nome,perfil);
    }

    //metodo para carregar o bilhete
    public double carregarBilhete(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor deve ser positivo!");
        }
        return saldo;
    }

    //metodo para consultar o saldo do bilhete
    public double consultarSaldo() {
        return saldo;
    }

    //metodo para passar na catraca
    public String passarCatraca() {
        double debito = TARIFA;
        if(usuario.perfil.equalsIgnoreCase("comum")){
            debito = TARIFA;
        }
        if(saldo>=debito){
            saldo-=debito;
            return "Catraca liberada!";
        }
        return "Saldo insuficiente!";
    }
}
