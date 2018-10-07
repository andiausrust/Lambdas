package andi.com;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    new Thread (() -> {
        System.out.println("printing from the runnabel");
        System.out.println("test second line");
    }).start();

    Employee john = new Employee("hohn", 30);
    Employee max = new Employee("max", 30);
    Employee mile = new Employee("mile", 30);
    Employee auni = new Employee("auni", 30);

    List<Employee> employeeList = Arrays.asList(john, max, mile, auni);

    Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

    employeeList.forEach(employee -> System.out.println(employee.getName()));

    }
}

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}