// 14. Implement Queue usning Deque

import java.util.*;

public class N {
    static class Queue {
        Deque<Integer> queue = new LinkedList<>();

        public void add(int data) {
            queue.addLast(data);
        }

        public void remove() {
            queue.removeFirst();
        }

        public void peek() {
            System.out.println(queue.getFirst());
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.peek();
    }
}