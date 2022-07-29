package com.ejerciciosJava;

/*
    Realizar la suma, resta, multiplicación, división y resto de 2 números
*/

public class Ejercicio2 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;

        int resultadoSuma = num1 + num2;

        int resultadoResta = num1 - num2;

        int resultadoMultiplicacion = num1 * num2;

        double resultadoDivision = (double) num1 / num2; //Casteo

        int resultadoResto = num1 % num2;

        System.out.println("La suma es: " + resultadoSuma);

        System.out.println("La resta es: " + resultadoResta);

        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        System.out.println("La divisón es: " + resultadoDivision);

        System.out.println("El resto de la divisón es: " + resultadoResto);
    }
}
