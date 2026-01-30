// 12. StringBuilder

import java.util.*;

public class L {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            str.append(i);
        }
        System.out.println(str);
        sc.close();
    }
}