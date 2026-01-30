// 5. Constructors

import java.util.*;

public class E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen("Pink");
        p1.color = "Brown";
        System.out.println(p1.color);
        sc.close();
    }
}

class Pen {
    String color;
    int tip;

    Pen(String color) {
        this.color = color;
    }
}