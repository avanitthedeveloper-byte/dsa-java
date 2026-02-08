// ----------- Practice Question -----------
public class Z {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head1;
    public static Node tail1;
    public static Node head2;
    public static Node tail2;

    public void addFirstInFirst(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = tail1 = newNode;
            return;
        }
        newNode.next = head1;
        head1 = newNode;
    }

    public void addFirstInSecond(int data) {
        Node newNode = new Node(data);
        if (head2 == null) {
            head2 = tail1 = newNode;
            return;
        }
        newNode.next = head2;
        head2 = newNode;
    }

    // --------------- Q. 1. ---------------
    public void reverseList() {
        Node prev = null;
        Node curr = tail1 = head1;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head1 = prev;
    }

    public void reverseSecond() {
        Node prev = null;
        Node curr = tail2 = head2;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head2 = prev;
    }

    public void findNodeData(Node head1, Node head2) {
        if (head1.data != head2.data) {
            System.out.println("Connection formed at node data: " + head1.data);
            return;
        }
        Node temp = head1;
        while (head1.next == head2.next) {
            head1 = head1.next;
            head2 = head2.next;
            temp = head1;
        }
        System.out.println("Connection formed at node data: " + temp.next.data);
    }

    // --------------- Q. 2. ---------------
    public Node swapValue(int key1, int key2) {
        Node temp1 = head1;
        Node temp2 = head1;
        while (temp1.data != key1 && temp2.data != key2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        int temp = temp1.data;
        System.out.println(temp);
        temp1.data = temp2.data;
        System.out.println(temp2.data);
        temp2.data = temp;
        return head1;
    }

    public void printFirst(Node head) {
        if (head == null) {
            System.out.println("First Linked List is empty!");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Z ll = new Z();
        // ll.addFirstInFirst(7);
        // ll.addFirstInFirst(6);
        // ll.addFirstInFirst(3);
        // ll.addFirstInFirst(2);
        // ll.addFirstInFirst(1);
        // ll.printFirst(head1);
        // ll.reverseList();
        // ll.printFirst(head1);
        // ll.addFirstInSecond(7);
        // ll.addFirstInSecond(6);
        // ll.addFirstInSecond(5);
        // ll.addFirstInSecond(4);
        // ll.printFirst(head2);
        // ll.reverseSecond();
        // ll.printFirst(head2);
        // ll.findNodeData(head1, head2);


        ll.addFirstInFirst(4);
        ll.addFirstInFirst(3);
        ll.addFirstInFirst(2);
        ll.addFirstInFirst(1);
        ll.printFirst(head1);
        ll.swapValue(2, 4);
        ll.printFirst(head1);
    }
}