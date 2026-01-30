// 2. Input/Output

import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String str = sc.nextLine();
        System.out.println(str);

        sc.close();
    }
}