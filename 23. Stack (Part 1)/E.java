// 5. Push at Bottom of Stack

import java.util.Stack;

public class E {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.add(data);
            return;
        }
        int element = s.pop();
        pushAtBottom(s, data);
        s.push(element);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}