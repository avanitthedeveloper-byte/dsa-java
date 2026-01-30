
// Intro to Nested Loops (Star Pattern)
import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter pattern: ");
        char pattern = sc.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + pattern + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}