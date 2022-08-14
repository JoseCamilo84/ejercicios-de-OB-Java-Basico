package com.ejerciciosJava.Otrosejercicios;

import javax.swing.*;
import java.util.Scanner;

/**
 * Programa que lea un caracter por teclado y compruebe que es una letra mayuscula.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        char letra;

        //System.out.print("Ingrese un caracter: ");
        //letra = (scanner.next()).charAt(0);

        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
            //System.out.println("La letra es mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
            //System.out.println("La letra es minuscula");
        }

    }
}
