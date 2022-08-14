package com.ejerciciosJava.Otrosejercicios;

import javax.swing.*;

/**
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 * Si trabaja 40 horas o menos se le paga $16 por hora.
 * Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        int horasTrabajadas, horasAdicionales, salario;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas:"));

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 16;
        }
        else {
            horasAdicionales = horasTrabajadas - 40;
            horasAdicionales = horasAdicionales * 20;
            salario = (40 * 16) + horasAdicionales;
        }
        JOptionPane.showMessageDialog(null, "El salario del obrero es: " + salario);
    }
}
