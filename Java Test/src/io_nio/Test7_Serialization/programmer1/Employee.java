package io_nio.Test7_Serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 3;

    String name;
    String department;
    int age;
    double salary;
//    Car car;

    public Employee(String name, String department, int age
            , double salary
//            , Car car
    ) {
        this.name = name;
        this.department = department;
        this.age = age;
//        this.car = car;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
//                ", car=" + car.model +
//                ", color=" + car.color +
                '}';
    }
}
