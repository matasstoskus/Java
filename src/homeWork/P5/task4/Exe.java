package homeWork.P5.task4;

import java.io.*;

public class Exe {
    public static void main(String[] args) {
        File relativeFile = new File("P5task4.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Matas 25 869243113\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File relativeFileMultiLine = new File("P5task4.csv");
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
