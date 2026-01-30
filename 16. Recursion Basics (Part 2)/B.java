// 2. Tiling Problem code

import java.util.*;

public class B {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (tilingProblem(n - 1) + tilingProblem(n - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for 2 x n board: ");
        int n = sc.nextInt();
        System.out.println(tilingProblem(n));
        sc.close();
    }
}