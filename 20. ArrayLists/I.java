// 9. Multi-dimentational ArrayList

import java.util.*;

public class I {

    public static void main(String[] args) {
        // // Mathod 1
        // ArrayList<ArrayList<Integer>> mulList1 = new ArrayList<>();

        // mulList1.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        // mulList1.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        // mulList1.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));

        // // Method 2
        // ArrayList<ArrayList<Integer>> mulList2 = new ArrayList<>(Arrays.asList(
        // new ArrayList<>(Arrays.asList(1, 2, 3, 4)),
        // new ArrayList<>(Arrays.asList(1, 2, 3, 4)),
        // new ArrayList<>(Arrays.asList(1, 2, 3, 4))));

        // System.out.println(mulList1);
        // System.out.println(mulList2);
        // for (int i = 0; i < mulList1.size(); i++) {
        // for (int j = 0; j < mulList1.get(i).size(); j++) {
        // System.out.print(mulList1.get(i).get(j) + " ");
        // }
        // System.out.println();
        // }

        // -------------------------------------------------------------------------
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        multiList.add(list1);
        multiList.add(list2);

        for (int i = 0; i < multiList.size(); i++) {
            for (int j = 0; j < multiList.get(i).size(); j++) {
                System.out.print(multiList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(multiList);
    }
}