// 1. Introduction to Dynamic Programming (DP)

import java.util.*;

public class A {
    public static int fibonacci(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibonacci(n - 1, f) + fibonacci(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int f[] = new int[n + 1];
        System.out.println(fibonacci(n, f));
        sc.close();
    }
}