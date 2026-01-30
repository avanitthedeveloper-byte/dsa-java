// 5. Sum of first N natural number

import java.util.*;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int nNumber = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (count <= nNumber) {
            sum += count;
            count++;
        }
        System.out.println("Sum of first " + nNumber + " natural Number: " + sum);
        sc.close();
    }
}