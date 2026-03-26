// 5. Climbing Stairs Problem

import java.util.*;

public class E {
    public static int climbingStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(climbingStairs(n));
    }
}