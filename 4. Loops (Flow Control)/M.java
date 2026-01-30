// 12. Question - break Keyword

import java.util.*;

public class M {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 10 != 0) {
                System.out.println("Enterd Number is: " + n);
            } else {
                break;
            }
        }
        sc.close();
    }
}