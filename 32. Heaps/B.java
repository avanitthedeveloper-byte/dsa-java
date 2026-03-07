
// 2. Priority Queue in JCF
import java.util.Comparator;
import java.util.PriorityQueue;

public class B {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 2, 9 };
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}