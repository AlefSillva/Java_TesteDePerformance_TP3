package conta;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Alef", 123, "456", 1000.0, "01/01/2025");

        // Usando o método saca
        System.out.println("Saldo antes do saque: R$ " + c1.saldo);
        c1.saca(200.0);
        System.out.println("Saldo depois do saque: R$ " + c1.saldo);

        // Usando o método deposita
        System.out.println("Saldo antes do depósito: R$ " + c1.saldo);
        c1.deposita(300.0);
        System.out.println("Saldo depois do depósito: R$ " + c1.saldo);

        // Usando o método calculaRendimento
        System.out.println("Rendimento: R$ " + c1.calculaRendimento());
        c1.calculaRendimento();

        // Saldo + rendimento
        System.out.println("\nSaldo + rendimento: R$ " + (c1.saldo + c1.calculaRendimento()));
    }
}
