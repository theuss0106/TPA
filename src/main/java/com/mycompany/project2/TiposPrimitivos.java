/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.project2;

/**Eu, Matheus Moreira, estou criando meu primeiro em java no dia 26/03, entre o horário de 13:00 até 15:30.
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        //Declaração de variáveis primitivas
    byte século = 21; // Armazena números pequenos até a centena (-128 a 127)
    short anoDeNascimento = 2009; // Armazena valores um pouco maiores (-32.769 a 32.768)
    int populacaoRicaDaCidade = 500000; // Tipo mais comum para números inteiros
    long populacaoComFome = 100000000L; // Necessário 'L' para valores longos
    
    float pronfundidadeDaPiscina  = 1.75f; // Necessaário 'f' no final para indicar float
    double peso = 72.5; // Mais preciso que float
    
    char inicial = 'J' ; // Armazena um único caractere
    boolean ativo = true; // Armazena verdaddeiro ou falso
    //Exibição de valores
    System.out.println("Século: " + século);
    System.out.println("Ano: " + anoDeNascimento);
    System.out.println("População rica da Cidade: " + populacaoRicaDaCidade);
    System.out.println("População mundial que passa fome: " + populacaoComFome);
    System.out.println("Altura: " + pronfundidadeDaPiscina + "m");
    System.out.println("Peso :" + peso + "kg");
    System.out.println("Inicial do objeto: " + inicial);    
    System.out.println("Está ativo?: " + ativo);
            }
}