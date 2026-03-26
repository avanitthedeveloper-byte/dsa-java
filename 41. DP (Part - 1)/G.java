// 7. Climbing Stairs Variation

import java.util.*;

public class G {
    public static int climbingStairsMemoization(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbingStairsMemoization(n - 1, dp) + climbingStairsMemoization(n - 2, dp)
                + climbingStairsMemoization(n - 3, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Stairs: ");
        int n = sc.nextInt();
        sc.close();
        int dp[] = new int[n + 1];
        System.out.println("Total Ways: " + climbingStairsMemoization(n, dp));
    }
}