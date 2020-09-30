package homeWork.P3.task4;

public class Exe {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Sum: " + getSum(a));
        System.out.println("Sum: " + getSum(b));
    }

    public static int getSum(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }
}
