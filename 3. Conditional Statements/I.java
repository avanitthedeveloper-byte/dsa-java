
// 9. Switch Statement
import java.util.*;

public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number[1-7]: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is Monday!");
                break;
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is Wednesday!");
                break;
            case 4:
                System.out.println("Today is Thrusday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
            case 7:
                System.out.println("Today is Sunday!");
                break;
            default:
                System.out.println("Please enter the correct day! ");
                break;
        }
        sc.close();
    }
}