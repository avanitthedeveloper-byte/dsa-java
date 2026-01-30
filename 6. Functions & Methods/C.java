// 3. Syntax with Parameters

import java.util.*;

public class C {
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Sum of " + num1 + ", " + num2 + ": " + sum(num1, num2));
        sc.close();
    }
}