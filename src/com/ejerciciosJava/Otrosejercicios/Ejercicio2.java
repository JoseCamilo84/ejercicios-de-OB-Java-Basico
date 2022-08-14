package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Hacer un programa que calcule e imprima el salario semanal de un empleado
 * a partir de sus horas semanales trabajadas y de su salario por hora.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sus horas trabajadas: ");
        int horasSemTrabajadas = scanner.nextInt();

        System.out.print("Digite su salario por hora: ");
        float salarioHora = scanner.nextFloat();

        float salarioSemanal = horasSemTrabajadas * salarioHora;

        System.out.println("El salario semanal de un empleado es: " + salarioSemanal);

    }
}
