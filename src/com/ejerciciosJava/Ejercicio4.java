package com.ejerciciosJava;

import java.util.Scanner;

/*
    Indicar si un número pasado por consola es par o no
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Introduzca un número: ");
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        if(numero % 2 == 0) {
            System.out.println("El número "+ numero +" es par");
        }
        else {
            System.out.println("El número "+ numero +" no es par");
        }
    }
}
