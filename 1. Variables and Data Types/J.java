
// 10. Sum of a & b (Input from User)
import java.util.*;

public class J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First & Second Number: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Sum of " + a + " & " + b + ": " + (a + b));
        sc.close();
    }
}