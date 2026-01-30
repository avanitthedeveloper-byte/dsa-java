// 7. Find product of a & b

import java.util.*;

public class G {
    public static int productOfTwoNumber(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Product will be: " + productOfTwoNumber(num1, num2));
        sc.close();
    }
}