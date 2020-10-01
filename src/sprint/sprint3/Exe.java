package sprint.sprint3;

import java.io.*;
import java.util.*;

public class Exe {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Lenovo", "200$", 3));
        computers.add(new Computer("Apple", "350$", 2));
        computers.add(new Computer("Dell", "400$", 10));
        write(computers);
        read();
        while (!computers.isEmpty()) {
            System.out.println("To add computer enter 1" + "\n" + "To remove computer enter 2" + "\n" + "To sort computers by sales enter 3");
            Scanner sc = new Scanner(System.in);
            int selection = Integer.parseInt(sc.nextLine());
            if (selection == 1) {
                System.out.println("Please enter model");
                String model = sc.nextLine();
                System.out.println("Please enter price");
                String price = sc.nextLine();
                System.out.println("Please enter amount sold");
                int sold = Integer.parseInt(sc.nextLine());
                computers.add(new Computer(model, price, sold));
                write(computers);
                read();
                continue;
            } else if (selection == 2) {
                System.out.println(("Please choose which computer to delete"));
                int which = Integer.parseInt(sc.nextLine());
                computers.remove(which);
                write(computers);
                read();
                continue;
            } else if (selection == 3) {
                computers.sort(Comparator.comparing(Computer::getSold));
                write(computers);
                read();
                continue;
            }
        }
    }

    public static void write(ArrayList x) {
        try {
            FileOutputStream fos = new FileOutputStream("output.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(x.toString());
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void read() {
        File relativeFileMultiLine = new File("output.csv");
        try {
            FileReader fileReader = new FileReader(relativeFileMultiLine);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                System.out.println(fileLine);
                fileLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Computer {
    private String model;
    private String price;
    private int sold;

    public Computer() {
    }

    public Computer(String model, String price, int sold) {
        this.model = model;
        this.price = price;
        this.sold = sold;
    }

    public int getSold() {
        return sold;
    }

    @Override
    public String toString() {
        return model + " " + price + " " + sold + " ";
    }
}