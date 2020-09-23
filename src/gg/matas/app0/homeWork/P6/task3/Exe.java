package gg.matas.app0.homeWork.P6.task3;

public class Exe {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Matas");
        employees[1] = new Employee("Vaidas");
        employees[2] = new Employee("Karolis");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}

class Employee {
    String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}