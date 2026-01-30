// 6. Swap 2 Numbers

import java.util.*;

public class F {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter both index(0to" + (list.size() - 1) + "): ");
        int idx1 = sc.nextInt();
        int idx2 = sc.nextInt();
        System.out.println(list);
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
        sc.close();
    }
}