// 15. Pair Sum - 2 Code

import java.util.*;

public class O {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size() - 1;
        for (int k = 0; k < list.size() - 1; k++) {
            if (list.get(k) > list.get(k + 1)) {
                i = k + 1;
                j = k;
            }
        }
        while (i != j) {
            if (list.get(i) + list.get(j) == target) {
                return true;
            } else if (list.get(i) + list.get(j) < target) {
                i = (i + 1) % list.size();
            } else {

                j = (list.size() + j - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 15, 6, 8, 9, 10));
        System.out.println(pairSum(list, 16));
    }
}
