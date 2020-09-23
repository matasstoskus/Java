package gg.matas.app0.homeWork.P3.task5;

public class Exe {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        int averageA = getSum(a) / a.length;
        int averageB = getSum(b) / b.length;
        System.out.println(averageA);
        System.out.println(averageB);
    }

    public static int getSum(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }
}
