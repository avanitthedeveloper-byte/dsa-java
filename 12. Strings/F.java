// 6. Check if a String is Palindrome

import java.util.*;

public class F {
    public static String palindromeChecker(String str) {
        for (int i = 0; i < (str.length()) / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "Not a Palindrome";
            }
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        System.out.println(palindromeChecker(str));
        sc.close();
    }
}