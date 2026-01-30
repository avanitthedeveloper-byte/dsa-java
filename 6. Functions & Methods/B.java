// 2. Syntax - Function Code Demo

import java.util.*;

public class B {
    // Function
    public static void printHelloWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Function Call
        printHelloWorld();
        sc.close();
    }
}