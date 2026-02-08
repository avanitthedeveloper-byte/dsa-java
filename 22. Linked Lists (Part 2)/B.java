// 2. Detecting Cyle Code

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
    public static int size;

    //----------------------- add Method -----------------------
    // addFisrt Function
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

    // addLast Function
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

    // add at any given index Function
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

    // removeFirst Function
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

    // removeLast Function
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

    // removeNthElementFromEnd Function (Size is already known) 
    public void removeNthElementFromEnd(int idx){
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < size-idx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    // removeNthElementFromEnd Function (Size is not known)
    public void removeNthElementFromEndSNN(int idx) {
        if (head == null) {
            System.out.println("LinkedList is empty!");
            return;
        }
        int sizeOfLinkedList = 0;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            sizeOfLinkedList++;
        }
        temp = head;
        for (int i = 0; i < sizeOfLinkedList-idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    //----------------------- search Method -----------------------

    // iterativeSearch Function
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

    // recursiveSearch Function
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

    // reverseLinkedList Function
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

    //----------------------- is Palindrome -----------------------
    
    // slow-fast Approach
    public Node midFinder(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head){
        // Base case
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find Middle Node
        Node midNode = midFinder(head);

        // 2. reverse rightHalf
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHalf = prev;
        Node leftHalf = head;

        // 3. compare leftHalf & rightHalf
        while (rightHalf != null) {
            if (leftHalf.data != rightHalf.data) {
                return false;
            }
            leftHalf = leftHalf.next;
            rightHalf = rightHalf.next;
        }
        return true;
    }

    // Detecting Cycle
    public boolean isCycleInLinkedList(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // printLinkedList Function
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
        B ll = new B();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        System.out.println(ll.isCycleInLinkedList(head));
        ll.print();
    }
}
