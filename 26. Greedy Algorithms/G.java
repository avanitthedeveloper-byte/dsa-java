// 7. Minimum sum absolute difference pairs

import java.util.Arrays;

public class G {

    public static void main(String[] args) {
        // int A[] = { 1, 2, 3 };
        // int B[] = { 2, 1, 3 };
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 5, 6 };
        Arrays.sort(A);
        Arrays.sort(B);
        int ans = 0;
        for (int i = 0; i < B.length; i++) {
            ans += Math.abs(A[i] - B[i]);
        }
        System.out.println(ans);
    }
}