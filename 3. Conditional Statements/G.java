
// 7. Ternary Operator
import java.util.*;

public class G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        String type = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " is " + type);
        sc.close();
    }
}