package com.ejerciciosJava.Otrosejercicios;

import java.util.Scanner;

/**
 * Guillermo tiene n dolares. Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un progra
 * ma que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dolares que tiene Guillermo: ");
        float dineroGuille = scanner.nextFloat();

        float dineroLuis = dineroGuille / 2;
        float dineroJuan = (dineroGuille + dineroLuis) / 2;
        float dineroTotal = dineroGuille + dineroLuis + dineroJuan;

        System.out.println("Luis tiene $" + dineroLuis);
        System.out.println("Juan tiene $" + dineroJuan);
        System.out.print("La cantidad total de dinero es: " + dineroTotal);
    }
}
