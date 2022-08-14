package com.sesion1.ClasesObjetos;

public class SmartWatch extends SmartDevice {
    boolean alarma;

    public SmartWatch() {}

    public SmartWatch(String tipoConexion, String sistemaOperativo, String fabricante, boolean reprodAudio, boolean switchOnOff, boolean alarma) {
        super(tipoConexion, sistemaOperativo, fabricante, reprodAudio, switchOnOff);
        this.alarma = alarma;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "alarma=" + alarma +
                ", tipoConexion='" + tipoConexion + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
