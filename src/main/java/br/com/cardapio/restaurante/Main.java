=package br.com.cardapio.restaurante;

import java.util.ArrayList;
import java.util.List;

import br.com.cardapio.restaurante.classes.Entrada;
import br.com.cardapio.restaurante.classes.Prato;
import br.com.cardapio.restaurante.classes.PratoPrincipal;

public class Main {
    public static void main(String[] args) {
        
        List<PratoPrincipal> listaPratoPrincipal = new ArrayList<>();
        
        Prato strogonoff = new PratoPrincipal("Strogonoof", 25.00, 2, 300, true);
        
        String menu = """
        ========================
                CARDAPIO
        ========================
        [1] - Listar Entradas
        [2] - Listar Pratos Principais
                """;


        strogonoff.adicionarIngrediente("Creme de leite");
        strogonoff.adicionarIngrediente("Frango");
        strogonoff.adicionarIngrediente("Milho");
        strogonoff.adicionarIngrediente("Sal");
        strogonoff.adicionarIngrediente("Cebola");
        
        System.out.println("Lista de ingredientes: " + strogonoff.getIngredientes());
        




    }
}