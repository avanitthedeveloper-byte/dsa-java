// 5. Queue using Java Collection Framework

import java.util.Queue;
import java.util.ArrayDeque;
// import java.util.LinkedList;

public class E {

    public static void main(String[] args) {
        // Queue<Integer> newQueue = new LinkedList<>();
        Queue<Integer> newQueue = new ArrayDeque<>();
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        System.out.println(newQueue.peek());
    }
}