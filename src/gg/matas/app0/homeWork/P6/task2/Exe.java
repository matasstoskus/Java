package gg.matas.app0.homeWork.P6.task2;

import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Person: \n");
        Person p = new Person();
        p.name = sc.nextLine();
        System.out.println(p.getName());
    }
}

class Person {
    String name;

    public String getName() {
        return name;
    }

}
