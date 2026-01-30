
// 14. Check if a number is prime or not
import java.util.*;

public class N {
    public static boolean primeChecker(int num) {
        boolean prime = true;
        if (num == 2) {
            return prime;
        } else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.print("Please enter a possitive number: ");
        } else {
            boolean res = primeChecker(num);
            System.out.println(res);
        }

        sc.close();
    }
}