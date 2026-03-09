// 4. Iteration of HashMap

import java.util.HashMap;
import java.util.Set;

public class D {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Nepal", 50);
        hm.put("USA", 75);
        hm.put("Japan", 25);
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(hm.get(key));
        }
    }
}