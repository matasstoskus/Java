package homeWork.P12.task2;

import java.util.Queue;
import java.util.PriorityQueue;

public class Exe {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        for (int i : pQueue) System.out.println(i);
    }
}
