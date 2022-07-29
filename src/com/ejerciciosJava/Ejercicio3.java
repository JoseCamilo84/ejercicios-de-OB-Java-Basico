package com.ejerciciosJava;

import java.util.Scanner;

/*
Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII
Por ejemplo si introduzco el 97 debe aparecer 'a'
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Introduzca un número: ");

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        char caracter = (char)numero;

        System.out.println("El número "+ numero + " es el carácter '"+caracter+"'");

    }
}
