// 14. LinkedHashSet

import java.util.LinkedHashSet;

public class N {

    public static void main(String[] args) {
        int arr[] = { 1, 9, 4, 3, 3, 4, 2, 8, 2, 8, 0 };
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            lhs.add(arr[i]);
        }
        System.out.println(lhs);
    }
}