// 5. Find Maximum

import java.util.ArrayList;
import java.util.Arrays;

public class E {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum number: " + max);
    }
}