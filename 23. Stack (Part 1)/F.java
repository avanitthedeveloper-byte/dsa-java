// 6. Reverse a String using a stack 

import java.util.Stack;

public class F {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx != str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.empty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String str = "NEXT";
        String result = reverseString(str);
        System.out.println(result);
    }
}