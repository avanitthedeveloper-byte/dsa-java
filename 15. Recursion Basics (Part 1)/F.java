// 6. Print Sum of N natural number

import java.util.*;

public class F {
    public static int sumOfNNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(sumOfNNatural(n));
        sc.close();
    }
}