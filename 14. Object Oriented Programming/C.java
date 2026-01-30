// 3. Getters & Setters

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(9);
        System.out.println(p1.getTip());
        sc.close();
    }
}

class Pen {
    private String color;
    private int tip;

    // Getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // Setters
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}