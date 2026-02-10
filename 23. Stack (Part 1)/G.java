// 7. Reverse a Stack
import java.util.Stack;

public class G {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.add(data);
            return;
        }
        int element = s.pop();
        pushAtBottom(s, data);
        s.push(element);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int topElement = s.pop();

        reverseStack(s);

        pushAtBottom(s, topElement);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.peek());
        reverseStack(s);
        System.out.println(s.peek());
    }
}