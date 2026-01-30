// 15. Clear last ith Bit

import java.util.*;

public class O {
    public static int clearIBit(int num, int ithBit) {
        int bitMask = ~0 << ithBit;
        return (num & bitMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter last i bit: ");
        int ithBit = sc.nextInt();
        System.out.println(clearIBit(num, ithBit));
        sc.close();

    }
}