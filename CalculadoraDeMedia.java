/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorademedia;

/**Eu, Matheus Sampaio Moreira criei um projeto java que calcula a média de quatro notas
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;
        System.out.printf("A média das notas = %.2f%n", media);
        
        scanner.close();
    }
}
