package com.ejerciciosJava.Otrosejercicios;

import javax.swing.*;

/**
 * Pedir tres numeros y mostrarlos ordenandos de mayor a menor.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));

        if ((num1 > num2) && (num1 > num3)) {
            if (num2 > num3) {
                JOptionPane.showMessageDialog(null, "Ordenados de mayor a menor: " + num1 + " " + num2 + " " + num3);
            }
            else {
                JOptionPane.showMessageDialog(null, "Ordenados de mayor a menor: " + num1 + " " + num3 + " " + num2);
            }
        }
        else if (num2 > num3) {
            if (num1 > num3) {
                JOptionPane.showMessageDialog(null, "Ordenados de mayor a menor: " + num2 + " " + num1 + " " + num3);
            }
            else {
                JOptionPane.showMessageDialog(null, "Ordenados de mayor a menor: " + num2 + " " + num3 + " " + num1);
            }
        }
        else if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Ordenados de mayor a menor: " + num3 + " " + num1 + " " + num2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Ordenados de mayor a menor: " + num3 + " " + num2 + " " + num1);
        }
    }
}
