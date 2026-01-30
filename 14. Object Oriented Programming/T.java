// 20. Abstract Classes

import java.util.*;

public class T {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        h1.changeColor();
        System.out.println(h1.color);
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        System.out.println(c1.color);
        sc.close();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Animal can eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("Horse walks with 4 legs.");
    }
}

class Chicken extends Animal {

    void walk() {
        System.out.println("Chicken wals with 2 legs.");
    }
}