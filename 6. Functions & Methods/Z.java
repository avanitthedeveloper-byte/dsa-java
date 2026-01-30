// 5. Write a Java method to compute the sum of the digits in an integer.

import java.util.*;

public class Z {
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println(sumOfDigit(num));
        sc.close();
    }
}