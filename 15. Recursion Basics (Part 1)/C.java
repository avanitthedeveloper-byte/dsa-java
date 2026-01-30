// 3. Stack Overflow

// Always use base case to avoid stack overflow.

import java.util.*;

public class C {
    public static void printNumbersInDreOrder(int n) {
        // if (n < 1) {
        // return;
        // }
        System.out.print(n + " ");
        printNumbersInDreOrder(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbersInDreOrder(n);
        sc.close();
    }
}