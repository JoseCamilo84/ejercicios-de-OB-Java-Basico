package com.sesion1.POO;

import com.sesion1.POO.Herencia.Camion;
import com.sesion1.POO.Herencia.Motocicleta;

public class ClasesPOO {
    public static void main(String[] args) {

        Vehiculo toyota = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 4);

        Vehiculo nissan = new Vehiculo("nissan", "XYZ", 2.1D, 2012, false, motorGTI);
        System.out.println(nissan.fabricante);
        System.out.println(nissan.sport);
        nissan.acelerar(50);
        nissan.acelerar(50);
        System.out.println(nissan.velocidad);

        // Herencia (hereda atributos de la clase padre)
        Motocicleta ninja = new Motocicleta();
        ninja.fabricante = "Kawasaki";

        // Polimorfismo: la misma variable carrito se la instancia con diferentes clases pero es de un sólo padre
        Vehiculo carrito;
        carrito = new Camion();
        carrito.acelerar(50);

        carrito = new Motocicleta();
        carrito.acelerar(50);
    }
}
