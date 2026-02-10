// 2. Stack Using ArrayList
import java.util.ArrayList;

public class B {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push Function (Addition on Top)
        public static void push(int data) {
            list.add(data);
        }

        // pop Function (Deletion from Top)
        public static int pop() {
            if (isEmpty() == true) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        
        // peek Function (Viewing on Top)
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.isEmpty());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());
    }
}