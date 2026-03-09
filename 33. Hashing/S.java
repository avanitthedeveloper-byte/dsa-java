// 18. Largest Subarray with 0 Sum

import java.util.HashMap;

public class S {

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 20 };
        int sum = 0;
        int idx = 0;
        HashMap<Integer, Integer> sumIdx = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sumIdx.containsKey(sum)) {
                idx = Math.max(idx, i - sumIdx.get(sum));
                sumIdx.put(sum, idx - i);
            } else {
                sumIdx.put(sum, i);
            }
        }
        System.out.println(idx);
    }
}