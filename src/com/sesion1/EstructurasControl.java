package com.sesion1;

public class EstructurasControl {
    public static void main(String[] args) {

        String[] nombres = {"Camilo", "Matias", "Favio", "Anabel"};
        String cadenaNombres = "";

        for (String nombre : nombres) {
            cadenaNombres += nombre;
            cadenaNombres += " ";
        }
        System.out.println(cadenaNombres);
    }
}
