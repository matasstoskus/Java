package sprint.sprint3;

import java.util.*;

public class Exe {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Apple"));
        computers.add(new Computer("Dell"));
        computers.add(new Computer("Asus"));
        System.out.println(computers);
        System.out.println("To add computer enter 0" + "\n" + "To remove computer enter 1" + "\n" + "To sort computers alphabetically enter 2");
        Scanner sc = new Scanner(System.in);
        int selection = Integer.parseInt(sc.nextLine());
        if (selection == 0) {
            System.out.println("Please enter computer mark");
            String mark = sc.nextLine();
            computers.add(new Computer(mark));
        } else if (selection == 1) {
            System.out.println(("Please choose which computer to delete"));
            int which = Integer.parseInt(sc.nextLine());
            computers.remove(which);
            System.out.println(computers);
        } else if (selection == 2) {
            Collections.sort(computers, Comparator.comparing(Computer::getMark));
            System.out.println(computers);
        }
    }
}

// class Computer {
//     private String mark;
//     private String model;
//     private String price;
//     private int year;
//     private int howManySold;
//
//     public Computer() {
//     }
//
//     public Computer(String mark, String model, String price, int year, int howManySold) {
//         this.mark = mark;
//         this.model = model;
//         this.price = price;
//         this.year = year;
//         this.howManySold = howManySold;
//     }
//
//     @Override
//     public String toString() {
//         return mark + " " + model + " " + price + " " + year + " " + howManySold;
//     }
// }

class Computer {
    private String mark;

    public Computer() {
    }

    public Computer(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark;
    }

    public String getMark() {
        return mark;
    }

}
