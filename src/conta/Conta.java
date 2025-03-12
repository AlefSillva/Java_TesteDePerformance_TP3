package conta;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    // Construtor
    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    void saca(double valorSaque){
        if (valorSaque > 0 && valorSaque <= saldo) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    void deposita(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public double calculaRendimento () {
        return this.saldo * 0.1;
    }


}

