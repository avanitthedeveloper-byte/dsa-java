
// 9. Find Binomial Coefficient
import java.util.*;

public class I {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n & r of nCr: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(
                "Binomial Coefficient of " + n + "C" + r + ": " + binomialCoefficient(n, r));

        sc.close();
    }
}