// 9. String Functions - Substring

import java.util.*;

public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "HelloWorld";
        System.out.println(msg.substring(4));
        System.out.println(msg.substring(4, 7));
        sc.close();
    }
}