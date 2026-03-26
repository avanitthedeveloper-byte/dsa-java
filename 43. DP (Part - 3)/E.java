// 5. Longest Common Subsequence (Tabulation)

public class E {
    public static void lcs(String str1, String str2, int n, int m, int dp[][]) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ans: " + dp[n][m]);
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        lcs(str1, str2, n, m, dp);
    }
}