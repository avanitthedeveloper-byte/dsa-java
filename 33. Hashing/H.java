
// 8. LinkedHashMap
import java.util.LinkedHashMap;

public class H {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Chaina", 150);
        lhm.put("US", 50);
        lhm.put("Nepal", 5);
        System.out.println(lhm);
    }
}