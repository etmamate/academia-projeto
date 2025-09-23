package br.com.cardapio.restaurante.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Prato {
    public String nome;
    public Double preco;
    public ArrayList<String> ingredientes;
    public int tempoPreparo;
    public int calorias;
    public boolean disponivel;

    public void calcularPreco(int quantidade, Double preco) {
        // Realiza o calculo do valor d prato;
    }

    public void verificaDisponibilidade() {
        // Verifica a quantidade de itens disponiveis;
    }

    public void adicionarIngrediente(String novoIngrediente) {
        // Adicionar ingredientes ao pedido

        this.ingredientes.add(novoIngrediente);
    }

    public void removerIngrediente(String ingrediente) {
        // Remove ingrediente do prato

        this.ingredientes.remove(ingrediente);
    }

    

    public Prato(String nome, Double preco, int tempoPreparo, int calorias,
            boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = new ArrayList<>();
        this.tempoPreparo = tempoPreparo;
        this.calorias = calorias;
        this.disponivel = disponivel;
    }

    

    public Prato() {
        this.ingredientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    

}
