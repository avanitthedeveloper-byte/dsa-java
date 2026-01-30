
// 5. Income TAX Calculator
import java.util.*;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income: ");
        double income = sc.nextDouble();
        if (income <= 500000) {
            System.out.println("No need to pay TAX.");
        } else if (income > 500000 && income < 1000000) {
            System.out.println("You have to pay TAX: " + income * 0.2);
        } else {
            System.out.println("You have to pay TAX: " + income * 0.3);
        }
        sc.close();
    }
}