// 12. Set ith Bit

import java.util.*;

public class L {
    public static int setIthBit(int num, int bit) {
        int bitmask = (1 << bit);
        return (num | bitmask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter ith Bit: ");
        int bit = sc.nextInt();
        System.out.println(setIthBit(num, bit));
        sc.close();
    }
}