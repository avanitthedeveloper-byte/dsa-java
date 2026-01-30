// Call by Value(in Java)

import java.util.*;

public class F {
    public static void swap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.err.println(x);
        System.err.println(y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println("------------------------");
        swap(x, y);
        System.out.println("------------------------");
        // Here swap function did't be able to change the original value of x & y.
        // Because in Java, Java always calls by value.
        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
}