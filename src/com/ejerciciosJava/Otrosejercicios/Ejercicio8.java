package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de 2do grado de coeficientes reales.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2,num3, resultado1, resultado2, num2Cuadradro, raiz;

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextFloat();

        System.out.print("Ingrese el tercer numero: ");
        num3 = scanner.nextFloat();

        num2Cuadradro = Math.pow(num2, 2);

        raiz = Math.sqrt(num2Cuadradro - (4 * num1 * num3));

        resultado1 = (-(num2) + raiz) / (2 * num1);
        resultado2 = (-(num2) - raiz) / (2 * num1);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
