package br.com.cardapio.restaurante.classes;

public class Sobremesa extends Cardapio {

    private boolean gelada;
    private static final double ACRESCIMO_GELADA = 2.50; // Acréscimo para sobremesas geladas

    public Sobremesa(String nome, double precoBase, boolean gelada) {
        super(nome, precoBase);
        this.gelada = gelada;
    }

    public boolean isGelada() {
        return gelada;
    }

    @Override
    public double calcularPrecoFinal() {
        if (gelada) {
            return precoBase + ACRESCIMO_GELADA;
        }
        return precoBase;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n--- Sobremesa ---");
        super.exibirDetalhes();
        System.out.println("É gelada? " + (gelada ? "Sim" : "Não"));
        System.out.println("Preço Final: R$ " + String.format("%.2f", calcularPrecoFinal()));
    }
    
}
