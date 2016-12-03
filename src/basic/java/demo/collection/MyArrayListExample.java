package basic.java.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

public class MyArrayListExample {
    public static void main(String a[]) {
        // By using name comparator (String comparison)
        List<Employee> nameCompEmp = new ArrayList<Employee>();
        nameCompEmp.add(new Employee("Ram", 3000));
        nameCompEmp.add(new Employee("John", 6000));
        nameCompEmp.add(new Employee("Crish", 2000));
        nameCompEmp.add(new Employee("Tom", 2400));
        Collections.sort(nameCompEmp, new NameComp());
        for (Employee e : nameCompEmp) {
            System.out.println(e);
        }
        System.out.println("===========================");

        // By using salary comparator (int comparison)
        List<Employee> salCompEMp = new ArrayList<Employee>();
        salCompEMp.add(new Employee("Ram", 3000));
        salCompEMp.add(new Employee("John", 6000));
        salCompEMp.add(new Employee("Crish", 2000));
        salCompEMp.add(new Employee("Tom", 2400));
        Collections.sort(salCompEMp, new SalaryComp());
        for (Employee e : salCompEMp) {
            System.out.println(e);
        }
    }
}

class NameComp implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class SalaryComp implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

class Employee {
    private String name;

    private int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + this.name + "-- Salary: " + this.salary;
    }
}
