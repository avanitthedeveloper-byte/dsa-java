// 12. HashSet

import java.util.HashSet;

public class L {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 1, 5, 1 };
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
        System.out.println(hs.contains(0));
        System.out.println(hs.remove(5));
        System.out.println(hs);
    }
}