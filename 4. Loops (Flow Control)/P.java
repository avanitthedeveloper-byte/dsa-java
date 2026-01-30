
// 15. Check if a number is prime or not.
import java.util.*;

public class P {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = true;
        // for (int i = 2; i < num; i++) {
        // if (num % i == 0) {
        // prime = false;
        // break;
        // }
        // }

        // Optimized Approach
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not a Prime");
        }
        sc.close();
    }
}