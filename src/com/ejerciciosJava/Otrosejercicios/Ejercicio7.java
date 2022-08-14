package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Construir un programa que, dado un numero total de horas, devuelve el numero de semanas, dias y horas equivalentes.
 * Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias, semanas, horas, totalHoras;

        System.out.print("Ingrese el numero de horas: ");
        totalHoras = scanner.nextInt();

        semanas = totalHoras / 168; // 1 semana tiene 168 horas
        dias = (totalHoras % 168) / 24; // 1 dia tiene 24 horas
        horas = (totalHoras % 168) % 24;

        System.out.println("Numero de semanas: " + semanas);
        System.out.println("Numero de dias: " + dias);
        System.out.println("Numero de horas: " + horas);
    }
}
