// 4. String Concatenation

import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String str = sc.nextLine();
        System.out.print("Enter your last name: ");
        String str1 = sc.nextLine();
        System.out.println("Your Full Name: " + str + str1);
        System.out.println("Your Full Name: " + str.concat(str1));
        sc.close();
    }
}