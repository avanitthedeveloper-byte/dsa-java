// 9. Reverse the given number

import java.util.*;

public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int revNumber = 0;
        while (num > 0) {
            int remainder = num % 10;
            revNumber = (revNumber * 10) + remainder;
            num /= 10;
        }
        System.out.println("Reverse of the number will be: " + revNumber);
        sc.close();
    }
}