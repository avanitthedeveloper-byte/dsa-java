// 10. Print Largest String

import java.util.*;

public class J {
    public static String largestString(String msg[]) {
        int index = 0;
        for (int i = 1; i < msg.length; i++) {
            int number = msg[i - 1].compareTo(msg[i]);
            if (number < index) {
                index = i;
            }
        }
        return msg[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg[] = { "apple", "mango", "banana", "xyz" };
        System.out.println(largestString(msg));
        sc.close();
    }
}