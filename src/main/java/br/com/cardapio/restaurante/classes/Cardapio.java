package br.com.cardapio.restaurante.classes;

public abstract class Cardapio {
    protected String nome;
    protected double precoBase;

    public Cardapio(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract double calcularPrecoFinal();

    // Método para exibir informações comuns
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço Base: R$ " + String.format("%.2f", precoBase));
    }
}
