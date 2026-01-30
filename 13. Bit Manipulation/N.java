// 14. Update ith Bit

import java.util.*;

public class N {
    public static int updateIthBit(int num, int ithBit, int value) {
        int bitMask = 1 << ithBit;
        if (value == 1) {
            return num | bitMask;
        } else {
            return num & (~bitMask);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter i: ");
        int ithBit = sc.nextInt();
        System.out.print("Enter Update Value(0 or 1): ");
        int value = sc.nextInt();
        System.out.println(updateIthBit(num, ithBit, value));
        sc.close();

    }
}
