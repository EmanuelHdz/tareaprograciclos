/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc202.tareafor;
import javax.swing.JOptionPane;

/**
 *
 * @author pequi
 */
public class TareaFor {

    public static void main(String[] args) {
        int sumatotal = 0;
        int numero = 0;
        int negativos=0;
        int positivos = 0;
        for (int i = 0; i<10; i++){
           numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un"
                + "número: "));
           sumatotal = sumatotal + numero;
           if (numero >= 0){
           positivos = positivos+1;
           }else {
           negativos = negativos+1;
        }
        
        }
        JOptionPane.showMessageDialog(null, "La suma de sus números"
                + " es " + sumatotal + "y la cantidad de positivos es " + 
                positivos + " y la cantidad de negativos es " + negativos);
        
    }
}
