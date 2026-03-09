// 13. Iteration on HashSets

import java.util.HashSet;
import java.util.Iterator;

public class M {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 3, 4, 2, 8, 2, 8, 9 };
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Using Enhanced Loop");
        for (Integer n : hs) {
            System.out.println(n);
        }
    }
}