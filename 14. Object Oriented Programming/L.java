// 12. Milti Level Inheritance

import java.util.*;

public class L {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shark s1 = new Shark();
        s1.swim();
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

// Derived Or Child Class
class Shark extends Fish {
    void canEat() {
        System.out.println("Shark can eat Fish.");
    }
}