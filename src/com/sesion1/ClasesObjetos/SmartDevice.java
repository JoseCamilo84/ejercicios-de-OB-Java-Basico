package com.sesion1.ClasesObjetos;

public class SmartDevice {
    String tipoConexion; // Bluetooth, wifi, 3G, etc
    String sistemaOperativo; // Android, IOS
    String fabricante; // Xiaomi, Samsung, Apple, Huawei, Motorola
    boolean reprodAudio;
    boolean switchOnOff;

    public SmartDevice() {}

    public SmartDevice(String tipoConexion, String sistemaOperativo, String fabricante, boolean reprodAudio, boolean switchOnOff) {
        this.tipoConexion = tipoConexion;
        this.sistemaOperativo = sistemaOperativo;
        this.fabricante = fabricante;
        this.reprodAudio = reprodAudio;
        this.switchOnOff = switchOnOff;
    }

    public void smartOnOff(boolean activacion) {
        switchOnOff = activacion;
        if(switchOnOff) {
            System.out.println("Encendiendo Dispositivo...");
        }
        else {
            System.out.println("Apagando Dispositivo...");
        }
    }





}
