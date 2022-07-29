package com.sesion1.POO;

public class Vehiculo {

    // 1- Atributos
    protected String fabricante;
    String modelo;
    double centimetroCubico;
    int anyo;
    boolean sport;
    int velocidad;
    Motor motor;

    // 2- Constructores
    public Vehiculo() {}
    public Vehiculo(String fabricante, String modelo, double centimetroCubico, int anyo, boolean sport, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.centimetroCubico = centimetroCubico;
        this.anyo = anyo;
        this.sport = sport;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, int anyo) {
        this.fabricante = fabricante;
        this.anyo = anyo;
    }

    // 3- Métodos (comportamientos)
    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
    }
}
