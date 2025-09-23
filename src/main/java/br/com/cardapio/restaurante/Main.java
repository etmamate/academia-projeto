package br.com.cardapio.restaurante;

import br.com.cardapio.restaurante.classes.Entrada;
import br.com.cardapio.restaurante.classes.Prato;

public class Main {
    public static void main(String[] args) {
        
        Prato strogonoff = new Prato("Strogonoof", 25.00, 2, 300, true);

        strogonoff.adicionarIngrediente("Creme de leite");
        strogonoff.adicionarIngrediente("Frango");
        strogonoff.adicionarIngrediente("Milho");
        strogonoff.adicionarIngrediente("Sal");
        strogonoff.adicionarIngrediente("Cebola");
        

        System.out.println("Lista de Ingrediente: \n" + strogonoff.getIngredientes());

        strogonoff.removerIngrediente("Cebola");

        System.out.println(" ");

        System.out.println("Após remoção da cebola: \n" + strogonoff.getIngredientes());

    }
}