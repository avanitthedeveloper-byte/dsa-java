// 3. Size of ArrayList

import java.util.ArrayList;

public class C {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(99);
        list.add(90);
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}