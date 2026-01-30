// 11. Get ith Bit

import java.util.*;

public class K {
    public static int getIthBit(int num, int bit) {
        int bitmask = 1 << bit;
        if ((num & bitmask) != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter ith Bit: ");
        int bit = sc.nextInt();
        System.out.println(getIthBit(num, bit));
        sc.close();
    }
}