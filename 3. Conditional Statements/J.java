
// 10. Calculator
import java.util.*;

public class J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbe: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("Enter Operation[+ or - or * or /]: ");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Something went wrong, please try again!");
                break;
        }

        sc.close();
    }
}