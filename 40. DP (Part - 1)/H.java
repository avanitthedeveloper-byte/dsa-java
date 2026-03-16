// 8. Climbing Stairs (Tabulation DP)

import java.util.*;

public class H {
    public static int climbingStairsTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Stairs: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Total Ways: " + climbingStairsTabulation(n));
    }
}