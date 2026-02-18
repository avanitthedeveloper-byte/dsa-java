// 11. Deque (Double Ended Queue)

import java.util.Deque;
import java.util.LinkedList;

public class K {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addLast(2); // 1 2
        deque.addFirst(3); // 3 1 2
        System.out.println(deque.getFirst() + " & " + deque.getLast()); // 3 & 2
        deque.removeLast(); // 3 1
        deque.removeFirst(); // 1
        System.out.println(deque);
    }
}