// 7. Print Nth Fibonacci Number

import java.util.*;

public class G {

    public static int nthFibinacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fiboN = nthFibinacciNumber(n - 1) + nthFibinacciNumber(n - 2);
        return fiboN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Number: ");
        int n = sc.nextInt();
        System.out.println(nthFibinacciNumber(n));
        sc.close();
    }
}