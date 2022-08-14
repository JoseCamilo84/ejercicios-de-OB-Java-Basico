package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales,
 * mas una comision de $150 por cada carro vendido, mas el 5% del valor de la venta por carro. Cada mes
 * el capturista de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que
 * calcule e imprima el salario mensual de un vendedor dado.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int salario = 1000;
        final int comision = 150; // Por carro vendido
        float interes = 0.05f, totalInteres, totalSalario;
        int numCarros, totalComision, costoCarro;

        System.out.print("Cuantos carros vendio el empleado en el mes: ");
        numCarros = scanner.nextInt();

        System.out.print("Cual es el valor del carro: ");
        costoCarro = scanner.nextInt();

        totalComision = comision * numCarros;
        totalInteres = interes * numCarros * costoCarro;
        totalSalario = salario + totalComision + totalInteres;

        System.out.println("Comision: " + totalComision);
        System.out.println("Interes: " + totalInteres);
        System.out.println("El salario total del empleado en el mes es: " + totalSalario);
    }
}
