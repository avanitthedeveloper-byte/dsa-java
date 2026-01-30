// 7. Find Permutations Code

import java.util.*;

public class G {
    public static void printPermu(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a str: ");
        String str = sc.next();
        printPermu(str, "");
        sc.close();
    }
}