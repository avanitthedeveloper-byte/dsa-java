
// 8. Check if a student will pass or fail
import java.util.*;

public class H {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("You are " + result + "!");
        sc.close();
    }
}