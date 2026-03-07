// 10. Connect n Ropes

import java.util.PriorityQueue;

public class J {
    public static int minCostToConnectRopes(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size() != 1) {
            int a = pq.remove();
            int b = pq.remove();
            ans += (a + b);
            pq.add((a + b));
        }

        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = { 4, 3, 2, 6 };
        int arr[] = { 2, 3, 3, 4, 6 };
        System.out.println(minCostToConnectRopes(arr));
    }
}