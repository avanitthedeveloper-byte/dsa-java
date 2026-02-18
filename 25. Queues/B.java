// 2. Queues using Arrays
public class B {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add OR enque
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue if Full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove OR Dequeue
        public static void remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
        }

        // peek
        public static void peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return;
            }
            System.out.println(arr[0] + " ");
        }

    }

    public static void main(String[] args) {
        Queue qb = new Queue(5);
        qb.peek();
        qb.add(1);
        qb.add(2);
        qb.add(3);
        qb.add(4);
        qb.add(5);
        qb.add(6);
        while (!qb.isEmpty()) {
            qb.peek();
            qb.remove();
        }
    }
}