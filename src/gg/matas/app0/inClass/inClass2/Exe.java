package gg.matas.app0.inClass.inClass2;

public class Exe {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Vaidas");
        people[1] = new Employee("Marius", "123");
        people[2] = new Janitor("Dobis", "69", "Yes");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person {
    String badgeID;

    public Employee() {
    }

    public Employee(String name, String badgeID) {
        super(name);
        this.badgeID = badgeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", badgeID='" + badgeID + '\'' +
                '}';
    }
}

class Janitor extends Employee {
    String specialUniform;

    public Janitor() {
    }

    public Janitor(String name, String badgeID, String specialUniform) {
        super(name, badgeID);
        this.specialUniform = specialUniform;
    }

    @Override
    public String toString() {
        return "Janitor{" +
                "name='" + name + '\'' +
                ", badgeID='" + badgeID + '\'' +
                ", specialUniform='" + specialUniform + '\'' +
                '}';
    }
}