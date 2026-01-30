// 8. Print Reverse of a Number

import java.util.*;

public class H {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n > 0) {
            int p = n % 10;
            n /= 10;
            System.out.print(p + " ");
        }
        sc.close();
    }
}