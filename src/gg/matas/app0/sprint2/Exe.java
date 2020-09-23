package gg.matas.app0.sprint2;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;
import java.util.Scanner;


public class Exe {
    public static void main(String[] args) {
        Month[] months = new Month[12];
        months[0] = new Month("January", "390$");
        months[1] = new Month("February", "660$");
        months[2] = new Month("March", "550$");
        months[3] = new Month("April", "770$");
        months[4] = new Month("May", "490$");
        months[5] = new Month("June", "320$");
        months[6] = new Month("July", "500$");
        months[7] = new Month("August", "530$");
        months[8] = new Month("September", "520$");
        months[9] = new Month("October", "900$");
        months[10] = new Month("November", "1000$");
        months[11] = new Month("December", "800$");
        Month.write(months.length);
        Month.read();
    }
}

class Month {
    String name;
    String amount;

    public Month() {
    }

    public Month(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }

    public static void write(int a) {
        File relativeFile = new File("monthlyPay.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < a; i++) {
                // bw.write();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        File relativeFileMultiLine = new File("monthlyPay.csv");
        try {
            FileReader fileReader = new FileReader(relativeFileMultiLine);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                System.out.println(fileLine);
                // String[] splitString = fileLine.split(" ");
                // System.out.println(Arrays.toString(splitString));
                fileLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
