/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc202.practicadowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author pequi
 */
public class Practicadowhile {

    public static void main(String[] args) {
        int num_uno = 0;
        int num_dos = 0;
        do{num_uno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                + "su primer número: "));
        num_dos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                + "su segundo número: "));
        
        }while (num_uno != num_dos);
    }
}
