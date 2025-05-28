/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradasaida;

/** Matheus Sampaio Moreira, projeto java da atividade de entrada e saída. 28/05/2025
 *
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static void main(String[] args) {
      
        int a = 0, b = 0, c = 0, d = 0, r = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero"));
        r = (a * b) + (a * c) + (a * d);
        JOptionPane.showMessageDialog(null, "O resultado é: "+ r);
        
    }
}
