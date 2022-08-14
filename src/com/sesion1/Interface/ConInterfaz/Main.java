package com.sesion1.Interface.ConInterfaz;

import com.sesion1.Interface.SinInterfaz.Employee;

public class Main {
    // Aqui vemos dos implementaciones usando una misma interfaz
    static EmployeeCRUD employeeCRUD = new EmployeeCRUDMySQL();
    // static EmployeeCRUD employeeCRUD = new EmployeeCRUDExcel();

    public static void main(String[] args) {

        employeeCRUD.save(new Employee());
    }
}
