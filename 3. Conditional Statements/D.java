
// 4. else if Statements
import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You Age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are Adult!");
        } else if (age >= 13 && age < 18) {
            System.out.println("Yor are teenager!");
        } else {
            System.out.println("You are kid now!");
        }
        sc.close();
    }
}