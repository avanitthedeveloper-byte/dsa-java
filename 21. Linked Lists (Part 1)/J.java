// 10. Iterative Search

public class J {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //----------------------- add Methof -----------------------

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //----------------------- remove Methof -----------------------

    public int removeFirst() {
        if (size == 0) {
            System.err.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        // prev: i = size - 2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int value = tail.data;
        prev.next = null;
        size--;
        return value;
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        J ll = new J();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(0);
        ll.addLast(-1);
        ll.addLast(34);
        ll.addFirst(20);
        ll.add(2, 19);
        ll.print(); // 20 -> 2 -> 19 -> 1 -> 0 -> -1 -> 34 -> null
        // System.err.println(ll.removeFirst());
        // ll.print();
        // System.err.println(ll.removeLast());
        // ll.print();
        // System.out.println(ll.size);
        // Or
        // System.out.println("Size of Linked List: "+size);
        System.out.println("Index of key: "+ll.iterativeSearch(77));;
    }
}
