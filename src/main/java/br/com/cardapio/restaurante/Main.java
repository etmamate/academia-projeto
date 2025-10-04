package br.com.cardapio.restaurante;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.cardapio.restaurante.classes.Aluno;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Aluno aluno = new Aluno("Mateus", "19026760760", "11/03/2004");

        System.out.println(aluno.cadastroAluno());

        JOptionPane.showMessageDialog(null, aluno.cadastroAluno(), "CADASTRO ALUNO!", 1);

        System.out.println("Teste cadastro: ");

        String novoNome = scn.nextLine();
        aluno.setNome(novoNome);
        System.out.println(aluno.cadastroAluno());
    }
}