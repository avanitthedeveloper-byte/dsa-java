// 3. Circular Queues using Arrays
public class C {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add OR enque
        public static void add(int data) {
            if (isFull()) {
                System.out.println("CircularQueue is Full");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove OR Dequeue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("CircularQueue is Empty!");
                return;
            }
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
        }

        // peek
        public static void peek() {
            if (isEmpty()) {
                System.out.println("CircularQueue is Empty!");
                return;
            }
            System.out.println(arr[front] + " ");
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.peek();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.remove();
        cq.add(4);
        cq.remove();
        cq.add(5);
        cq.remove();
        cq.add(6);
        cq.remove();
        cq.add(7);
        while (!cq.isEmpty()) {
            cq.peek();
            cq.remove();
        }
    }
}