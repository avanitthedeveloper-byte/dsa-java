// 16. Clear range of Bits

import java.util.*;

public class P {
    public static int clearRangeOfBits(int num, int sBit, int eBit) {
        int sBitMask = (~0) << (eBit + 1);
        int eBitMask = (int) (Math.pow(2, sBit) - 1);
        return (num & (sBitMask | eBitMask));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter Starting Bit: ");
        int sBit = sc.nextInt();
        System.out.print("Enter Ending Bit: ");
        int eBit = sc.nextInt();
        System.out.println(clearRangeOfBits(num, sBit, eBit));
        sc.close();

    }
}