/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeentradasaida;

/** Matheus Sampaio Moreira, projeto java de teste de entrada e saída. 28/05/2025
 *
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
        
public class TesteEntradaSaida {

    public static void main(String[] args) {
        
        String numero = JOptionPane.showInputDialog("Digite um numero:");
                
        JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero);
        
    }
}
