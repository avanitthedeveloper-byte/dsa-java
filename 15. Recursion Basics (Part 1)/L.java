// 12. Print x to the power of n (OPTIMIZED)

import java.util.*;

public class L {
    public static int powerOfN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = powerOfN(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
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