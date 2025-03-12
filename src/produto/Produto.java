package produto;

public class Produto {
    String nome;
    double preco;
    int qtdEmEstoque;
    // --------------------------------------------

    //Construtor da classe Produto
    public Produto(String nome, double preco, int qtdEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }
    // --------------------------------------------

    //Criação de Métodos
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.qtdEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.qtdEmEstoque);
    }
    // --------------------------------------------

    // Criando Métodos Getters e Setters

    // GETTERS
    String getNome() {
        return this.nome;
    }

    double getPreco() {
        return this.preco;
    }

    int getQtdEmEstoque() {
        return this.qtdEmEstoque;
    }
    // --------------------------------------------

    // SETTERS
    void setNome(String novoNome) {
        this.nome = novoNome;
    }

    void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    void setQtdEmEstoque(int novaQuantidade) {
        this.qtdEmEstoque = novaQuantidade;
    }
    // --------------------------------------------

    public static void main(String[] args) {

        // Instanciando um objeto da classe Produto
        Produto arroz = new Produto("Arroz", 23.00, 10);

        // Chamada do método de "exibirInformacoes()" antes das alterações
        System.out.println("Informações antes das alterações:");
        arroz.exibirInformacoes();

        // Chamada dos métodos de "alterarPreco()" e "alterarQuantidade()"
        arroz.alterarPreco(28.00);
        arroz.alterarQuantidade(15);

        // Chamada do método de "exibirInformacoes()" depois das alterações
        System.out.println("\nInformações depois das alterações:");
        arroz.exibirInformacoes();
        // --------------------------------------------

        // Testando os métodos Getters e Setters
        System.out.println("\nTestando os métodos Getters e Setters e exibindo as informações allteradas:");
        Produto_Teste_Get_set.testarGettersSetters(arroz);

    }
}
