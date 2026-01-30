// 17. Check if a number is power of 2 or not

import java.util.*;

public class Q {
    public static boolean powOfTwoFun(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.err.println(powOfTwoFun(num));
        sc.close();

    }
}