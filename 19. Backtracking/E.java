// 5. Find Subsets Code

import java.util.*;

public class E {

    public static void printSubArr(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }

        printSubArr(str, ans + str.charAt(i), i + 1);
        printSubArr(str, ans, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str = sc.next();
        printSubArr(str, "", 0);
        sc.close();
    }
}