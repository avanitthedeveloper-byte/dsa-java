// 11. Single Level Inheritance

import java.util.*;

public class K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fish f1 = new Fish();
        f1.eat();
        sc.close();
    }
}

// Base Or Parent Class
class Animal {
    void eat() {
        System.out.println("Animal can Eat.");
    }

    void breathe() {
        System.out.println("Animal can Breathe.");
    }

    void skinColor() {
        System.out.println("Animal can have Skin Color.");
    }
}

// Derived Or Child Class
class Fish extends Animal {
    void fins() {
        System.out.println("Fish have Fins.");
    }

    void swim() {
        System.out.println("Fish can Swim.");
    }
}