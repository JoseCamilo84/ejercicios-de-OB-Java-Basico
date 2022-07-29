package com.JavaDesdeCero;

public class CadenasString {
    public static void main(String[] args) {

        String miNombre = "José Camilo Rodríguez Vera";

        System.out.println("Mi nombre es: " + miNombre);

        System.out.println("Mi nombre tiene " + miNombre.length() + " letras. ");

        System.out.println("La primera letra de mi nombre es: " + miNombre.charAt(0));

        int ultimaPosicion = miNombre.length();

        System.out.println("La última letra de mi nombre es: " + miNombre.charAt(ultimaPosicion - 1));

        String frase = "Hoy es un buen día para aprender a programar en Java";

        String otraFrase = frase.substring(10, 14);

        System.out.println(otraFrase);


    }
}
