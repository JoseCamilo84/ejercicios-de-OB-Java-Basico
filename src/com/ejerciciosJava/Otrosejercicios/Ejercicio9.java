package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Mostrar si un numero es multiplo de 10 o no
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        numero = scanner.nextInt();

        if (numero % 10 == 0) {
            System.out.println("Es multiplo de diez");
        }
        else {
            System.out.println("No es multiplo de diez");
        }
    }
}
