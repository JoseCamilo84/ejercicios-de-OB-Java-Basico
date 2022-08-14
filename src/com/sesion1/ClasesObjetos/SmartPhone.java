package com.sesion1.ClasesObjetos;

public class SmartPhone extends SmartDevice {
    boolean camara;
    boolean reprodVideo;

    public SmartPhone() {}

    public SmartPhone(String tipoConexion, String sistemaOperativo, String fabricante, boolean reprodAudio, boolean switchOnOff, boolean camara, boolean reprodVideo) {
        super(tipoConexion, sistemaOperativo, fabricante, reprodAudio, switchOnOff);
        this.camara = camara;
        this.reprodVideo = reprodVideo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara=" + camara +
                ", reprodVideo=" + reprodVideo +
                ", tipoConexion='" + tipoConexion + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
