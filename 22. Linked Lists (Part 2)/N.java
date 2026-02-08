// 13. Reverse a Doubly Linked List
public class N {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst Function
    public void addFisr(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast Function
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // removeFirst Function
    public void removeFirst() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty!");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    // removeLast Function
    public void removeLast() {
        if (head == null) {
            System.out.println("Doubly LinkedList is Empty!");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // reverseDLl Function
    public void reverseDLl() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print Function
    public void print() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty!");
            return;
        }
        System.out.print("null <-> ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
    }
}