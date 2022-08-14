package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * La calificacion final de un estudiante de Informatica se calcula con base a las calificaciones de 4 aspectos
 * de su rendimiento academico: participacion, primer examen parcial, segundo examen parcial y examen final.
 * Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones del 10%, 25%, 25% y 40%,
 * Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float participacion, primerExa, segundoExa, examenFinal, calificacionFinal;

        System.out.print("Ingrese la nota de participacion: ");
        participacion = scanner.nextFloat();

        System.out.print("Ingrese la nota del 1er Examen: ");
        primerExa = scanner.nextFloat();

        System.out.print("Ingrese la nota del 2do Examen: ");
        segundoExa = scanner.nextFloat();

        System.out.print("Ingrese la nota del Examen Final: ");
        examenFinal = scanner.nextFloat();

        participacion *= 0.1f;
        primerExa *= 0.25f;
        segundoExa *= 0.25f;
        examenFinal *= 0.4f;
        calificacionFinal = participacion + primerExa + segundoExa + examenFinal;

        System.out.println("La nota final es: " + calificacionFinal);


    }
}
