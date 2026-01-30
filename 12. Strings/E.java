// 5. String charAt Method

import java.util.*;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lName = sc.nextLine();
        String fullName = fName.concat(lName);
        System.out.print(fullName.charAt(5));
        sc.close();
    }
}