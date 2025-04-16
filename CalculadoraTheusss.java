/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoratheusss;

/** Eu, Matheus Sampaio estou fazendo um programa em JAVA que vai funçionar como uma calculadora 16/04/2025
 *
 * @author FATEC ZONA LESTE
 */


public class CalculadoraTheusss {
    public static void main(String[] args) {                 
    //Definção de dois números  
    double n1 = 11.9;
    double n2 = 4.7;
    
    //Realizando operações matemáticas
    double soma = n1 + n2;
    double subtracao = n1 - n2;
    double multiplicacao = n1 * n2;
    double divisao = n2 != 0 ? n1 / n2 : Double.NaN;
    double resto = n1 % n2;
            
            //Resultados
            System.out.println("Resultados das operacoes");
            System.out.println("Soma: " + soma);
            System.out.println("Subtracao: " + subtracao);
            System.out.println("Multiplicacao: " + multiplicacao);
            System.out.println("Divisao: " + (n2 != 0 ? divisao : "Indefinida (divisao por zero)"));
            System.out.println("Resto da divisao: " + resto);
            
   
    }
  }
