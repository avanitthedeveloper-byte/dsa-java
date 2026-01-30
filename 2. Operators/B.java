
// 2. Arithmatic Operators
import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First and Second Number: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(a + " + " + b + " : " + (a + b));
        System.out.println(a + " - " + b + " : " + (a - b));
        System.out.println(a + " * " + b + " : " + (a * b));
        System.out.println(a + " / " + b + " : " + (a / b));
        System.out.println(a + " % " + b + " : " + (a % b));
        sc.close();
    }
}