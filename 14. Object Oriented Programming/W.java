// 23. Super Keyword

import java.util.*;

public class W {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Horse h = new Horse();
        System.out.println(h.color);
        sc.close();
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor Called!");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "Brown";
        System.out.println("Horse Constructor Called!");
    }
}