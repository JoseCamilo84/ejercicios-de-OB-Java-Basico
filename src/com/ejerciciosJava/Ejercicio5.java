package com.ejerciciosJava;

import java.util.Scanner;

/*
    Pedir 2 números por teclado y preguntar si es mayor que otro o si son iguales
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Introduzca 1er número:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Introduzca 2do número:");
        Scanner scan1 = new Scanner(System.in);
        int num2 = scan1.nextInt();

        if(num1 <= num2) {

            if(num1 == num2) {
                System.out.println("Son Iguales");
            }
            else {
                System.out.println("El número "+num2+" es el mayor");
            }

        }
        else {
            System.out.println("El número "+num1+" es el mayor");
        }
    }
}
