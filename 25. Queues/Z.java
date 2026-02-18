// Practice Questions

import java.util.*;

public class Z {

    // ---------- Question 1. ----------
    public static void printBinary(int n) {
        Deque<Integer> binaryNumber = new LinkedList<>();
        while (n > 0) {
            binaryNumber.addFirst(n % 2);
            n = n / 2;
        }
        while (!binaryNumber.isEmpty()) {
            System.out.print(binaryNumber.getFirst());
            binaryNumber.removeFirst();
        }
    }

    public static void printBinaryNumber(int n) {
        for (int i = 1; i <= n; i++) {
            printBinary(i);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        // ---------- 1. ----------
        printBinaryNumber(50000);

    }
}