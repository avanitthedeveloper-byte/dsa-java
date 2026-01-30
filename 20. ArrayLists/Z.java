// Practice Question

import java.util.*;

public class Z {
    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        // Is Increasing
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                isIncreasing = false;
            }
            if (list.get(i) > list.get(i + 1)) {
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        int n;
        for (int i = 0; i < list.size(); i++) {
            n = list.get(i);
            int nm1 = n - 1;
            int np1 = n + 1;
            boolean left = true;
            boolean right = true;
            boolean appear = true;
            for (int j = 0; j < list.size(); j++) {
                if (j != i) {
                    if (n == list.get(j)) {
                        appear = false;
                    }
                }
                if (list.get(j) == nm1) {
                    left = false;
                }
                if (list.get(j) == np1) {
                    right = false;
                }
            }
            if (left && right && appear == true) {
                newList.add(n);
            }
        }
        return newList;
    }

    public static int mostFrequent(ArrayList<Integer> list, int key) {
        int count = 0;
        int nextNumber = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i) == key) {
                nextNumber = list.get(i + 1);
                count++;
            } else if (list.get(i) == key && nextNumber != list.get(i + 1)) {
                count--;
            } else if (list.get(i) == key && count == 0) {
                nextNumber = list.get(i + 1);
                count++;
            }
        }
        return nextNumber;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2));
        // System.out.println(isMonotonic(list));

        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3));
        // System.out.println(lonelyNumber(list));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 3));
        int key = 2;
        System.out.println(mostFrequent(list, key));
    }
}