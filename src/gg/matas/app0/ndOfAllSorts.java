package gg.matas.app0;

import java.util.Arrays;
import java.util.Scanner;

public class NdOfAllSorts {
    public static void main(String[] args) {
        ///// P2 - 32
        System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MAX_VALUE + 1);
        System.out.println("-------------------------------------------");

        ///// P2 - 33
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number which I will divide by 5 and find the remainder: ");
        // String number = sc.nextLine();
        // int x = int(number) % 5;
        // System.out.println(x);
        int x = 5;
        int y = 2;
        int z = x % y;
        System.out.println(z);
        System.out.println("-------------------------------------------");

        ///// P2 - 34
        String jonai2 = "Sveikas, Jonai\nkaip sekasi?";
        System.out.println(jonai2);
        String lorem8 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println(lorem8.toLowerCase());
        System.out.println(lorem8.toUpperCase());
        System.out.println(lorem8.replace('o', 'z'));
        // System.out.println(lorem8.endsWith("elit"));
        System.out.println("-------------------------------------------");

        ///// P2 - 35
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        // int age = Integer.parseInt(sc.nextLine());
        // System.out.println("You are: " + age);
        // if (age >= 100){
        //     System.out.println("You should be dead according to statistics");
        // }
        // else if (age >= 35) {
        //     System.out.println("You can candidate and vote for president");
        // }
        // else if (age >= 18) {
        //     System.out.println("You can vote for president");
        // }
        // else {
        //     System.out.println("You shall not participate in the holy matrimony");
        // }
        System.out.println("-------------------------------------------");

        ///// P2 - 36
        //1111111111111
        // for (int i0 = 1; i0 < 1; i0 ++){
        //     System.out.println("This won't work");
        // }
        // int i0 = 1;
        // while (i0 < 1){
        //     System.out.println("This won't work");
        // }
        //2222222222222
        // for (int i0 = 1; i0 > 0; i0 ++){
        //     System.out.println("Infinity");
        // }
        // int i0 = 1;
        // while (i0 > 0){
        //     System.out.println("Infinity");
        // }
        //333333333333
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter, I will stop asking only after you enter Q: \n");
        // int i0 = 1;
        // while (i0 > 0) {
        //     String letter = sc.nextLine();
        //     if (letter.equals("Q")) {
        //         System.out.println("Gz");
        //         break;
        //     }
        // }
        //444444444444
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter word, I will make it backwards, Bekky \n");
        // String backwardsInit = sc.nextLine();
        // String backwardsDone = new StringBuffer(backwardsInit).reverse().toString();
        // System.out.println(backwardsDone);
        //555555555555
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter word, I will count the letters \n");
        // String letterCount = sc.nextLine();
        // for (int i = 0; i < letterCount.length(); i++) {
        //     System.out.println(letterCount.charAt(i) + " " + (i+1));
        // }
    }
}
