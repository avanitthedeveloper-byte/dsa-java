// 4. Parameters v/s Arguments

import java.util.*;

public class D {
    public static float sum(float num1, float num2) { // num1 & num2 -> Parameters or Formal Parameters
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Sum of " + num1 + ", " + num2 + ": " + sum(num1, num2)); // num1 & num2 -> Arguments or
                                                                                     // Actual Parameters
        sc.close();
    }
}