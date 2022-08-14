package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Hacer un programa que calcula e imprima la suma de tres calificaciones
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese 1era. Calificacion: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingrese 2da. Calificacion: ");
        float num2 = scanner.nextFloat();

        System.out.print("Ingrese 3era. Calificacion: ");
        float num3 =  scanner.nextFloat();

        float resultado = num1 + num2 + num3;
        System.out.print("El resultado es " + resultado);
    }
}
