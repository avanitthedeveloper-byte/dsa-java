
// 2. Print the largest of two number
import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Greatest among these is: " + a);
        } else if (a == b) {
            System.out.println("Bothe are equal.");
        } else {
            System.err.println("Greatest among these is: " + b);
        }
        sc.close();
    }
}