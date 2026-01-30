// 11. Break Statement

import java.util.*;

public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.err.println(i);
            if (i == 3) {
                break;
            }
        }
        sc.close();
    }
}
