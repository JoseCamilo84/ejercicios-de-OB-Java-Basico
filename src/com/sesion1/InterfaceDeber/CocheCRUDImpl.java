package com.sesion1.InterfaceDeber;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Este metodo es para guardar");
    }

    @Override
    public void findAll() {
        System.out.println("Este metodo es para buscar");
    }

    @Override
    public void delete() {
        System.out.println("Este metodo es para borrar");
    }
}
