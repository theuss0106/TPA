/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projetcscanner;

import java.util.Scanner;

/**
 * Matheus Moreira 14/05/2025 - Projeto Scanner em Java
 * (Como usar Scanner no JAVA)
 * 
 * @author FATEC ZONA LESTE
 */
public class ProjetcSCANNER {

    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome do usuário
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        // Pedindo a idade do usuário
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        // Exibindo a mensagem com o nome e a idade
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");

        // Fechando o scanner
        scanner.close();
    }
}

