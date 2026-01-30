// 11. Print x to the power of n

import java.util.*;

public class K {
    public static int powerOfN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerOfN(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x & n (x^n): ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerOfN(x, n));
        sc.close();
    }
}