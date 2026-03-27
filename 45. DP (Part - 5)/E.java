// 5. Count BSTs

public class E {

    public static int countingTree(int n, int dp[]) {
        dp[0] = dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        System.out.println(countingTree(n, dp));
    }
}