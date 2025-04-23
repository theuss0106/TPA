/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/** Eu, Matheus Sampaio estou fazendo um programa em JAVA que vai calcular várias operações 23/04/2025
 *
 * @author FATEC ZONA LESTE
 */


public class OperacoesMatematicas {
    public static void main(String[] args) {                 
    //Definição das variáveis 
    double n1 = 21.9;
    double n2 = 17.3;
    int ladoQUADRADO = 4;
    int baseTRIANGULO = 6;
    int alturaTRIANGULO = 6;
    double baseRETANGULO = 3.5;
    double alturaRETANGULO = 5.6;
    double raio = 5.5;
    int diagonal1 = 3;
    int diagonal2 = 2;
    double PI = 3.14;
    
    
   
    
    //Realização das operações matemáticas
    double soma = n1 + n2;
    double subtracao = n1 - n2;
    double multiplicacao = n1 * n2;
    double divisao = n2 != 0 ? n1 / n2 : Double.NaN;
    double resto = n1 % n2;
    int areaQUADRADO = ladoQUADRADO * ladoQUADRADO;
    int areaTRIANGULO = baseTRIANGULO * alturaTRIANGULO / 2;
    double areaRETANGULO = baseRETANGULO + alturaRETANGULO;
    double areaCIRCUNFERENCIA = PI * Math.pow(raio, raio) ;
    int areaLOSANGO = diagonal1 * diagonal2 / 2;
    

    
            //Resultados
            System.out.println("Resultados das operacoes");
            System.out.println("Soma: " + soma);
            System.out.println("Subtracao: " + subtracao);
            System.out.println("Multiplicacao: " + multiplicacao);
            System.out.println("Divisao: " + (n2 != 0 ? divisao : "Indefinida (divisao por zero)"));
            System.out.println("Resto da divisao: " + resto);
            System.out.println("Área do Quadrado: " + areaQUADRADO);
            System.out.println("Área do Triangulo: " + areaTRIANGULO);
            System.out.println("Área do Retangulo: " + areaRETANGULO);
            System.out.println("Área do Losango: " + areaLOSANGO);
            System.out.println("Área da Circunferencia: " + areaCIRCUNFERENCIA);
    }
  }