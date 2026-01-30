// 18. Code - Binary to Decimal

import java.util.*;

public class R {
    public static int binaryToDecimal(int binaryNumber) {
        int decimalNumber = 0;
        int count = 0;
        while (binaryNumber > 0) {
            int r = binaryNumber % 10;
            decimalNumber += ((int) Math.pow(2, count) * r);
            count++;
            binaryNumber = binaryNumber / 10;
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        int binaryNumber = sc.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        sc.close();
    }
}