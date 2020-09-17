package gg.matas.app0;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;
import java.util.Scanner;

public class sprint2 {
    public static void main(String[] args) {
        File relativeFile = new File("monthlyPay.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("January 390$\n");
            bw.write("February 600$\n");
            bw.write("March 550$\n");
            bw.write("April 770$\n");
            bw.write("May 490$\n");
            bw.write("June 320$\n");
            bw.write("July 500$\n");
            bw.write("August 530$\n");
            bw.write("September 420$\n");
            bw.write("October 900$\n");
            bw.write("November 1000$\n");
            bw.write("December 800$\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
