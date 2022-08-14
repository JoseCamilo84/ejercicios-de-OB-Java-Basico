package com.sesion1.ClasesObjetos;

public class ClasesObjetos {
    public static void main(String[] args) {

        SmartPhone celular = new SmartPhone();
        celular.fabricante = "Samsung";
        celular.sistemaOperativo = "Android";
        celular.smartOnOff(true);
        celular.smartOnOff(false);
        System.out.println(celular);

        SmartWatch reloj = new SmartWatch();
        reloj.fabricante = "Xiaomi";
        reloj.sistemaOperativo = "IOS";
        reloj.tipoConexion = "Bluetooth";
        reloj.smartOnOff(true);
        reloj.smartOnOff(false);
        System.out.println(reloj);
    }
}
