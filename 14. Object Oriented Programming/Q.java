// 17. Method Overriding

import java.util.*;

public class Q {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bird b1 = new Bird();
        b1.canDance();
        Peacock p1 = new Peacock();
        p1.canDance();
        sc.close();
    }
}

class Bird {
    void canDance() {
        System.out.println("Bird can't Dance!");
    }
}

class Peacock extends Bird {
    void canDance() {
        System.out.println("Peacock can Dance!");
    }
}