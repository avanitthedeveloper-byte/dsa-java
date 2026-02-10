// 3. Stack using Linked List

public class C {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    public static class Stack {
        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push Function
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop Function;
        public static void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
            head = head.next;
        }

        // peak Function 
        public static void peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
            System.out.println(head.data);
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            s.peek();
            s.pop();
        }
        System.out.println(s.isEmpty());
    }
}