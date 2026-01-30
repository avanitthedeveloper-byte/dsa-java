// 2. while Loop

import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        while (count < num) {
            System.out.println("Hello World!...");
            count++;
        }
        sc.close();
    }
}