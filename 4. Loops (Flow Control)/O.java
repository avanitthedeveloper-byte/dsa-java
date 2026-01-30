
// 14. Continue Statement
import java.util.*;

public class O {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            } else {
                System.err.println("Entered number: " + n);
                // Remove break keyword during revision...
                break;
            }
        }
        sc.close();
    }
}