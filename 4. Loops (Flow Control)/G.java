// 7. Print Square Pattern

import java.util.*;

public class G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}