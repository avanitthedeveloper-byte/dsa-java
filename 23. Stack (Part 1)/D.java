// 4. Stack using Collections Framework

import java.util.Stack;

public class D {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.isEmpty());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}