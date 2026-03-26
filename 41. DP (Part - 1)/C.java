// 3. Ways of DP
// Tabulation DP

import java.util.Scanner;

public class C {
    public static int fibonacci(int n, int dp[]) {
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        System.out.println(fibonacci(n, dp));
    }
}