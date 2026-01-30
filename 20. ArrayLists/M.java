// 13. Pair Sum - 1 (2 Pointer Approach)

import java.util.*;

public class M {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i) + list.get(j) == target) {
                return true;
            } else if (list.get(i) + list.get(j) < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(pairSum(list, 5));

    }
}