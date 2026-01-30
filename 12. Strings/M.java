
// 13. Convert Letters to Uppercase
import java.util.*;

public class M {
    public static String myUpperCaseFunc(String str) {
        StringBuilder msg = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                msg.append(Character.toUpperCase(str.charAt(i)));
            } else {
                msg.append(str.charAt(i));
            }
        }
        return msg.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = myUpperCaseFunc(str);
        System.out.println(result);
        sc.close();
    }
}
