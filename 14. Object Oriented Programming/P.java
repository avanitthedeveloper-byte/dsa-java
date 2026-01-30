// 16. Method Overloading

import java.util.*;

public class P {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(3.5f, 9.3f));
        sc.close();
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return (float) (a + b);
    }

    int sum(int a, int b, int c) {
        return a + b;
    }
}