// 4. Queue using LinkedList

public class D {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        public static Node head = null;
        public static Node tail = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add OR enque
        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove OR Dequeue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return;
            }
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }

        // peek
        public static void peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return;
            }
            System.out.println(head.data + " ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.peek();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            q.peek();
            q.remove();
        }
    }
}