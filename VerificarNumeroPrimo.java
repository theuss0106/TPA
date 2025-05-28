/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarnumeroprimo;

/**Eu, Matheus Sampaio Moreira criei um projeto java que calcula a média de quatro notas
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite um numero inteiro: ");
            int numero = scanner.nextInt();

            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " nao é um número primo.");
            }

            System.out.print("Deseja verificar outro numero? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
