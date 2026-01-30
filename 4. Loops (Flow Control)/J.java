// 10. do while Loop

import java.util.*;

public class J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        do {
            System.out.println(count + 1);
            count++;
        } while (count < num);
        sc.close();
    }
}