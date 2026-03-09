// 3. HashMap Operations

import java.util.HashMap;

public class C {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // put(key, val)
        hm.put("India", 100);
        hm.put("Japan", 25);
        hm.put("Nepal", 50);

        // Print HashMap (hm)
        System.out.println(hm);

        // get(key)
        System.out.println(hm.get("Nepal"));
        System.out.println(hm.get("US"));

        // containsKey(key)
        System.out.println(hm.containsKey("Nepal"));
        System.out.println(hm.containsKey("US"));

        // removeKey(key)
        System.out.println(hm.remove("Nepal"));
        System.out.println(hm.remove("Nepal"));

    }
}