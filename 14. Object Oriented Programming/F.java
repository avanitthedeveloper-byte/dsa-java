// 6. Types of Constructors

import java.util.*;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pen p1 = new Pen();
        // p1.color = "Brown";
        // System.out.println(p1.color);
        Pen p1 = new Pen("Pink");
        System.out.println(p1.color);
        sc.close();
    }
}

class Pen {
    String color;
    int tip;

    // Non-parameterized Constructor
    Pen() {
        System.out.println("Non-parameterized Constructor");
    }

    // Parameterized Constructor
    Pen(String color) {
        System.out.println("Parameterized Constructor");
    }

    Pen(int tip) {
        System.out.println("Parameterized Constructor");
    }
}