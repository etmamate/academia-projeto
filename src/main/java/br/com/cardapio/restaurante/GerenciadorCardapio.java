package br.com.cardapio.restaurante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.cardapio.restaurante.classes.Cardapio;
import br.com.cardapio.restaurante.classes.Entrada;
import br.com.cardapio.restaurante.classes.PratoPrincipal;
import br.com.cardapio.restaurante.classes.Sobremesa;

public class GerenciadorCardapio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cardapio> cardapio = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner

                switch (opcao) {
                    case 1:
                        cadastrarPratoPrincipal(scanner, cardapio);
                        break;
                    case 2:
                        cadastrarEntrada(scanner, cardapio);
                        break;
                    case 3:
                        cadastrarSobremesa(scanner, cardapio);
                        break;
                    case 4:
                        exibirCardapio(cardapio);
                        break;
                    case 5:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // Limpar o buffer em caso de erro
            }
        }
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n===== GERENCIADOR DE CARDÁPIO =====");
        System.out.println("1. Cadastrar Prato Principal");
        System.out.println("2. Cadastrar Entrada");
        System.out.println("3. Cadastrar Sobremesa");
        System.out.println("4. Exibir Cardápio Completo");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarEntrada(Scanner scanner, ArrayList<Cardapio> cardapio){
        try {
            System.out.print("Nome da entrada: ");
            String nome = scanner.nextLine();
            System.out.print("Preço base: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            System.out.print("Ingrediente principal: ");
            String ingrediente = scanner.nextLine();

            Entrada prato = new Entrada(nome, preco, ingrediente);
            cardapio.add(prato);
            System.out.println("Entrada cadastrada com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: O preço deve ser um número. Tente novamente.");
            scanner.nextLine(); // Limpar o buffer
        }
    }

    private static void cadastrarPratoPrincipal(Scanner scanner, ArrayList<Cardapio> cardapio) {
        try {
            System.out.print("Nome do prato: ");
            String nome = scanner.nextLine();
            System.out.print("Preço base: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            System.out.print("Ingrediente principal: ");
            String ingrediente = scanner.nextLine();

            PratoPrincipal prato = new PratoPrincipal(nome, preco, ingrediente);
            cardapio.add(prato);
            System.out.println("Prato principal cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: O preço deve ser um número. Tente novamente.");
            scanner.nextLine(); // Limpar o buffer
        }
    }

    private static void cadastrarSobremesa(Scanner scanner, ArrayList<Cardapio> cardapio) {
        try {
            System.out.print("Nome da sobremesa: ");
            String nome = scanner.nextLine();
            System.out.print("Preço base: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            System.out.print("É uma sobremesa gelada? (s/n): ");
            char resposta = scanner.nextLine().toLowerCase().charAt(0);
            boolean gelada = (resposta == 's');

            Sobremesa sobremesa = new Sobremesa(nome, preco, gelada);
            cardapio.add(sobremesa);
            System.out.println("Sobremesa cadastrada com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: O preço deve ser um número. Tente novamente.");
            scanner.nextLine(); // Limpar o buffer
        }
    }

    private static void exibirCardapio(ArrayList<Cardapio> cardapio) {
        if (cardapio.isEmpty()) {
            System.out.println("\nO cardápio está vazio.");
            return;
        }

        System.out.println("\n========= CARDÁPIO COMPLETO =========");
        for (Cardapio item : cardapio) {
            item.exibirDetalhes();
        }
        System.out.println("=====================================");
    }
}