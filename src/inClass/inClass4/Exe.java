package inClass.inClass4;

import java.util.Arrays;

public class Exe {
    public static void main(String[] args) {
        DynamicArray<String> dArr = new DynamicArray<>();
        dArr.add("String1");
        dArr.add("String2");
        dArr.add("String3");
        for (int i = 0; i < 10; i++) {
            dArr.add("String" + i);
        }
        System.out.println(dArr);
    }
}

class DynamicArray<T> {
    T[] arr;
    int counter = 0;

    public DynamicArray() {
        this.arr = (T[]) new Object[1];
    }

    public DynamicArray(int initialCount) {
        this.arr = (T[]) new Object[initialCount];
    }

    //add
    public void add(T item) {
        if (counter == this.arr.length) {
            T[] tmp = this.arr;
            this.arr = (T[]) new Object[counter + 1];
            for (int i = 0; i < tmp.length; i++ ){
                this.arr[i] = tmp[i];
            }
        }
        this.arr[counter] = item;
        counter++;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}