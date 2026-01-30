// 2. Operations on ArrayList

import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(97);
        list.add(96);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        list.set(1, 44);
        System.out.println(list.get(1));
        System.out.println(list.contains(96));
        System.out.println(list);
        sc.close();
    }
}