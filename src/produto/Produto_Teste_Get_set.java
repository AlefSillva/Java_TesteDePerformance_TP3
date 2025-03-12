package produto;

public class Produto_Teste_Get_set {
    public static void testarGettersSetters(Produto produto) {
        // Usando os métodos setters
        // Alterando as informações do produto
        produto.setNome("Café");
        produto.setPreco(32.0);
        produto.setQtdEmEstoque(20);

        // Usando os métodos getters
        // Exibindo as informações do produto apoós as alterações
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQtdEmEstoque());

    }
}
