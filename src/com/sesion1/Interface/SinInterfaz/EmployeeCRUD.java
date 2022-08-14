package com.sesion1.Interface.SinInterfaz;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {

    // Simulando un BBDD pero con una lista (Estructura de datos)
    List<Employee> employees = new ArrayList<>();

    // Metodo para guardar un empleado
    public void save(Employee employee) {
        employees.add(employee);
    }

}
