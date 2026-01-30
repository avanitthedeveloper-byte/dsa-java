
// 12. Area of a Circle
import java.util.*;

public class L {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        float a = sc.nextFloat();
        System.out.println("Area of Circle: " + (3.14 * a * a));
        sc.close();
    }
}