// 1. Classes & Objects

import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        System.out.println(p1.color);
        System.out.print("Enter Pen's Color: ");
        p1.color = sc.next();
        System.out.println("Pen's Color: " + p1.color);
        p1.setTip(5);
        System.out.println("Pen's Tip: " + p1.tip);
        sc.close();
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}