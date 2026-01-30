// 4. Print numbers in increasing order

import java.util.*;

public class D {
    // public static void printNumbersInIncOrder(int n, int m) {
    // if (m > n) {
    // return;
    // }

    // System.out.print(m + " ");
    // m++;
    // printNumbersInIncOrder(n, m);
    // }

    public static void printNumbersInIncOrder(int n) {
        if (n < 1) {
            return;
        }
        printNumbersInIncOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbersInIncOrder(n);
        sc.close();
    }
}