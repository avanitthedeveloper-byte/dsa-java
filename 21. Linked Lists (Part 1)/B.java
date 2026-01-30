
// 2. Head and Tail in Linked List
public class B {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Write Method Here For The Operation
    public static void main(String[] args) {
        B ll = new B();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        // No need to do this. We have to write function for this functionaliy.
    }
}