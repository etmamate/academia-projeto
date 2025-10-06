package br.com.cardapio.restaurante.classes;

public class PratoPrincipal extends Cardapio{

    private String ingredientePrincipal;
    private static final double TAXA_SERVICO = 0.10; // 10% de taxa de serviço

    public PratoPrincipal(String nome, double precoBase, String ingredientePrincipal) {
        super(nome, precoBase);
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * TAXA_SERVICO);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n--- Prato Principal ---");
        super.exibirDetalhes();
        System.out.println("Ingrediente Principal: " + ingredientePrincipal);
        System.out.println("Preço Final (com taxa): R$ " + String.format("%.2f", calcularPrecoFinal()));
    }
}
