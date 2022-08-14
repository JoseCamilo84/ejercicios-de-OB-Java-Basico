package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Hacer un programa que calcule el cuadrado de una suma
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num1Elev, num2Elev, cuadradoSuma, cuadradoSuma1;

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble();

        cuadradoSuma = (num1 + num2);

        System.out.println("El Cuadrado de una suma es: " + Math.pow(cuadradoSuma, 2));

        num1Elev = Math.pow(num1, 2);
        num2Elev = Math.pow(num2, 2);

        cuadradoSuma1 = num1Elev + num2Elev + (2 * num1 * num2);

        System.out.println("El Cuadrado de una suma es: " + cuadradoSuma1);

    }
}
