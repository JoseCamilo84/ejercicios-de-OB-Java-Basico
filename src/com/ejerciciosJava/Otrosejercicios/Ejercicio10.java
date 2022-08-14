package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Pedir 2 numeros y decir cual es el mayor o si son iguales
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los dos numeros son iguales");
        } else if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que el " + num2);
        } else {
            System.out.println("El numero " + num2 + " es mayor que el " + num1);
        }
    }
}
