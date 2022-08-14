package com.ejerciciosJava.Otrosejercicios;

import javax.swing.*;

/**
 * Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Ambos son pares");
        }
        else if ((num1 % 2 != 0) && (num2 % 2 != 0)) {
            JOptionPane.showMessageDialog(null, "Ambos son impares");
        }
        else {
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro es impar");
        }
    }
}
