// 7. Copy Constructor

import java.util.*;

public class G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen("Renolds", "Blue", 15);
        System.out.println(p1.name);
        System.out.println(p1.color);
        System.out.println(p1.price);
        System.out.println();
        Pen p2 = new Pen(p1);
        System.out.println(p2.name);
        System.out.println(p2.color);
        System.out.println(p2.price);
        for (int i = 0; i < 3; i++) {
            System.out.print(p2.tip[i] + " ");
        }
        p1.tip[2] = 15;
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(p1.tip[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(p2.tip[i] + " ");
        }
        sc.close();
    }
}

class Pen {
    String name;
    String color;
    int price;
    int tip[] = { 5, 12, 13 };

    Pen(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    Pen(Pen p1) {
        this.name = p1.name;
        this.color = p1.color;
        this.price = p1.price;
        this.tip = p1.tip;
    }
}