package gg.matas.app0.homeWork.P3.task1;

public class Exe {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{1, 2, 5, 6, 3, 2};
        for (int value : a) {
            System.out.println(value);
        }
        int j = 0;
        System.out.println("--------------");
        while (j < a.length){
            System.out.println(a[j]);
            j++;
        }
        System.out.println("--------------");
        int k = 0;
        do {
            System.out.println(a[k]);
            k++;
        } while (k != a.length);
    }
}
