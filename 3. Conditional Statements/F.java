
// 6. Print the largest of three number
import java.util.*;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Greatest among these is: " + a);
            } else {
                System.out.println("Greatest among these is: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest among these is: " + b);
            } else {
                System.out.println("Greatest among these is: " + c);
            }
        }
        sc.close();
    }
}