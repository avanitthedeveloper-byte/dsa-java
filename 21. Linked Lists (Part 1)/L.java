// 12. Reverse a Linked List (Iterative Approach)

public class L {

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

    //----------------------- add Method -----------------------

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

    //----------------------- remove Method -----------------------

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

    //----------------------- search Method -----------------------

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

    public int helperRecur(int key, Node head) {
        if (head == null) {
            return -1;
        }

        if (key == head.data) {
            return 0;
        }

        int idx = helperRecur(key, head.next);
        if (idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key) {
        return helperRecur(key, head);
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        L ll = new L();
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
        // System.out.println("Index of key: "+ll.iterativeSearch(77));
        // System.out.println("Index of key: "+ll.recursiveSearch(34));
        ll.reverseLinkedList();
        ll.print();
    }
}
