// 16. Count Distinct Element

import java.util.TreeSet;

public class P {

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        System.out.println(ts.size());
    }
}