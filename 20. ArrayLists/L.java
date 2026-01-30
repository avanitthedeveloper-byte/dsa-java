// 12. Pair Sum - 1 (Brute Force)

import java.util.*;

public class L {
    public static ArrayList<ArrayList<Integer>> pairSum(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> newFinalList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    ArrayList<Integer> newList = new ArrayList<>();
                    newList.add(list.get(i));
                    newList.add(list.get(j));
                    newFinalList.add(newList);
                }
            }
        }
        return newFinalList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(pairSum(list, 7));
    }
}