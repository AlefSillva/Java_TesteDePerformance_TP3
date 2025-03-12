// Criação de uma classe Carro com atributos e métodos.
public class Carro { // Exemplo de criação da classe Carro

    // Atributos da classe
    String marca;
    String cor;
    int velocidade;

    // Ciração do método de aceleração do veículo.
    void acelerar(int incremento) {

        // Verificação de valor inválido
        if (incremento < 0) {
            System.out.println("Valor inválido. A aceleração não pode ser negativa.");
            return;
        }

        // Aceleração do veículo
        this.velocidade += incremento;

        // Verificação de velocidade e exibição de estado do veículo
        if (velocidade == 0 ){
            System.out.println("\nO carro está parado.");
        } else {
            System.out.println("\nO carro acelerou para " + velocidade + " Km/h.");
        }
    }
    // --------------------------------------------

    // Construtor da Classe "Carro".
    public Carro(String marca, String cor, int velocidade) {
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    // --------------------------------------------

    public static void main(String[] args) {
        // Instância de um novo Objeto da classe Carro
        Carro carro1 = new Carro ("Hyundai", "Vermelho Chilli", 0);

        System.out.println("CARACTERÍSTICAS DO VEÍCULO: ");
        System.out.println(
                        "Marca: " + carro1.marca + " | " +
                        "Cor: " + carro1.cor + " | " +
                        "Velocidade: " + carro1.velocidade);

        // utilizando o método acelerar()
        carro1.acelerar(20);
    }
}


