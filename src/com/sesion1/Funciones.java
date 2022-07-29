package com.sesion1;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        final double iva = 0.12;

        System.out.println("Introduce un precio: ");
        Scanner scan = new Scanner(System.in);
        double precio = Double.parseDouble(scan.nextLine());

        double resultado = precioIVA(precio, iva);
        System.out.println("El precio con IVA es: " + resultado);
    }

    static double precioIVA(double precio, double iva) {
        double precioConIVA = precio * iva;
        return precio + precioConIVA;
    }
}
