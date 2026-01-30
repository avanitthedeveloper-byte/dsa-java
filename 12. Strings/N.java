// 14. String Compression

import java.util.*;

public class N {
    public static void stringCompression(String str) {
        StringBuilder str1 = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str1.append(str.charAt(i));
            if (count > 1) {
                str1.append(count);
            }
        }
        System.out.println(str1.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        stringCompression(str);
        sc.close();
    }
}