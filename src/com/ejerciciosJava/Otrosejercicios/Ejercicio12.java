package com.ejerciciosJava.Otrosejercicios;

import javax.swing.*;

/**
 * En el Mall del Pacifico se hace un 20% de descuento a los clientes cuya compra supere los $300. ¿Cual sera la
 * cantidad que pagara una persona por su compra?
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        float valorSinDescuento, valorConDescuento, descuento;

        valorSinDescuento = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un valor de compra:"));

        if (valorSinDescuento > 300) {
            descuento = valorSinDescuento * 0.20f;
            valorConDescuento = valorSinDescuento - descuento;
            JOptionPane.showMessageDialog(null, "El valor a pagar (Con descuento) sera de: " + valorConDescuento);
        }
        else {
            JOptionPane.showMessageDialog(null, "El valor a pagar (Sin Descuento) sera de: " + valorSinDescuento);
        }

    }
}
