package com.pro.sky.hwlist;

import java.util.ArrayList;
import java.util.List;


public class Servise {
    static List<Employee> employee = new ArrayList<>(List.of(
            new Employee("Andy", "Warhol"),
            new Employee("Jean-Michel", "Basquiat"),
            new Employee("Kurt", "Cobain"),
            new Employee("Jared", "Leto"),
            new Employee("Johnny", "Depp"),
            new Employee("Angelina", "Jolie"),
            new Employee("Mike", "Tyson"),
            new Employee("Muhammed", "Ali"),
            new Employee("Lionel", "Messi"),
            new Employee("Kylian", "Mbappe")

    ));

    static void maxSize() throws EmployeeStorageIsFullException {
        int maxSize = 12;
        if (employee.size() > maxSize) {
            throw new EmployeeStorageIsFullException("ArrayIsFull");
        }
    }

    public static String allEmployee() {
        return (employee.toString());

    }

    public static void addEmployee(String firstName, String lastName) throws EmployeeAlreadyAddedException {
        maxSize();
        if (!employee.contains(new Employee(firstName, lastName))) {
            employee.add(new Employee(firstName, lastName));
        } else {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в списке");

        }
    }

    public static String findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee x = new Employee(firstName, lastName);
        if (employee.contains(x)) {
            return x.toString();
        } else {
            throw new EmployeeNotFoundException(" EmployeeNotFound");
        }
    }


    public static void removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        if (employee.contains(new Employee(firstName, lastName))) {
            employee.remove(new Employee(firstName, lastName));
        } else {
            throw new EmployeeNotFoundException(" EmployeeNotFound");
        }

    }

}











