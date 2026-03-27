// 3. Catalan's Number (Recursion + Memoization)

import java.util.Arrays;

public class C {
    public static int catRecur(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catRecur(i) * catRecur(n - i - 1);
        }

        return ans;
    }

    public static int catMemo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += catMemo(i, dp) * catMemo(n - i - 1, dp);
        }

        return dp[n] = ans;
    }

    public static void main(String[] args) {
        int n = 40;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(catMemo(n, dp));

    }
}