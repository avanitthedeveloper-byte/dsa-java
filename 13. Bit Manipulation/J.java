// 10. Check if a number is ODD or EVEN

import java.util.*;

public class J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        sc.close();
    }
}