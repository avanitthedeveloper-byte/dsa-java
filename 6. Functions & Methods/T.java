// 20. Decimal to Binary

import java.util.*;

public class T {
    public static int decimalToBinary(int num) {
        int reverseBinary = 0;
        int count = 0;
        while (num > 0) {
            int r = num % 2;
            reverseBinary = reverseBinary + (int) Math.pow(10, count) * r;
            count++;
            num /= 2;
        }
        return reverseBinary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();
        System.out.println(decimalToBinary(num));
        sc.close();
    }
}