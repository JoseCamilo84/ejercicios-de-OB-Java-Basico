package com.sesion1.Interface.SinInterfaz;

public class Main {
    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        Employee camilo = new Employee("Jose Camilo", 38, 2500, true);
        Employee matias = new Employee("Matias Jared", 38, 2500, true);
        Employee favio = new Employee("Favio Alejandro", 38, 2500, true);

        employeeCRUD.save(camilo);
        employeeCRUD.save(matias);
        employeeCRUD.save(favio);

        for (Employee employee : employeeCRUD.employees) {
            System.out.println(employee);
        }
    }
}
