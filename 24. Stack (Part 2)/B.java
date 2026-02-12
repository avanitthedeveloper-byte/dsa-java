// 2. Valid Parentheses (Code)

import java.util.Stack;

public class B {
    public static boolean validParentheses(String str) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening Bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                charStack.push(ch);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                if ((charStack.peek() == '(' && ch == ')') || (charStack.peek() == '{' && ch == '}') || (charStack.peek() == '[' && ch == ']')) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (charStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "(({[]}())";
        System.err.println(validParentheses(str));
    }
}