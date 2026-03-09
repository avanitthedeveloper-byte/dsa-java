// 15. TreeSet

import java.util.TreeSet;

public class O {

    public static void main(String[] args) {
        int arr[] = { 1, 9, 0, 2, 3, 8, 4, 3, 7, 2 };
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        System.out.println(ts);
    }
}