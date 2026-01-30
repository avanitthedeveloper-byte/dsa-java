// Practice Question

import java.util.*;

public class T {
    public static char upperToLowerCase(char ch) {
        int ch1 = ch;
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch1 | (1 << 5));
        } else {
            return (char) ch1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // System.out.println(num | (~(~0 << 1)));
        System.out.print("Enter a Character (A-Z): ");
        String input = sc.next();
        char ch = input.charAt(0);
        System.out.println(upperToLowerCase(ch));
        sc.close();
    }
}