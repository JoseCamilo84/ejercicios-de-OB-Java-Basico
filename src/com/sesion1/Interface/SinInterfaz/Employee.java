package com.sesion1.Interface.SinInterfaz;

public class Employee {

    // 1- attributes
    String name;
    int age;
    double salary;
    boolean high;

    // 2- builders
    public Employee() {}

    public Employee(String name, int age, double salary, boolean high) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                ", salario=" + salary +
                ", alta=" + high +
                '}';
    }
}
