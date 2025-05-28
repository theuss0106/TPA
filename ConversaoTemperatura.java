/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaotemperatura;

/** Eu, Matheus Sampaio Moreira produzi um projeto para conversão de temperatura 28/05/2025
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
        
        scanner.close();
    }
}
