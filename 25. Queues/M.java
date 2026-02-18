// 13. Implement stack using Deque

import java.util.Deque;
import java.util.LinkedList;

public class M {
    static class Stack {
        Deque<Integer> stack = new LinkedList<>();

        public void push(int data) {
            stack.addLast(data);
        }

        public void pop() {
            System.out.println(stack.removeLast());
        }

        public void peek() {
            System.out.println(stack.getLast());
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.pop();
    }
}