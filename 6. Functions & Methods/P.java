// 16. Primes in Range

import java.util.*;

public class P {
    public static boolean primeChecker(int num) {
        boolean prime = true;
        if (num == 2) {
            return prime;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static void primeInRange(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (primeChecker(i) == true) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime in this range: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Range: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 < 1 || num2 < 1) {
            System.out.print("Please enter a possitive number: ");
        } else {
            primeInRange(num1, num2);
        }

        sc.close();
    }
}