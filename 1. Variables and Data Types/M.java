
// 13. Type Conversion
import java.util.*;

public class M {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Conversion Possible Only: byte > short > int > float > long > double
        byte b = 8;
        short c = b;
        int d = c;
        float e = d;
        long f = (long) e;
        double g = f;
        System.out.println(g);
        sc.close();
    }
}