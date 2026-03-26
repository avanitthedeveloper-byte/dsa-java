// 6. Target Sum Subset (Code)

public class F {
    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // i = items & j = target sum
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];
                // Include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                System.out.print(dp[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int sum = 11;
        System.out.println(targetSumSubset(arr, sum));
    }
}