// 19. Fast Exponentiation

import java.util.*;

public class S {
    public static int fastExpo(int num, int p) {
        int ans = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                ans = ans * num;
            }
            num = num * num;
            p = p >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter Power: ");
        int p = sc.nextInt();
        System.err.println(fastExpo(num, p));
        sc.close();

    }
}