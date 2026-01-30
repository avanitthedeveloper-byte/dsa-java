// Practice Questions

import java.util.*;

public class Z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a1 & b1 of (a1 + ib1): ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.print("Enter a2 & b2 of (a2 + ib2): ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        // ComplexNumber c = new ComplexNumber();
        // c.add(a1, a2, b1, b2);
        // ComplexNumber c = new ComplexNumber();
        // c.subtract(a1, a2, b1, b2);
        ComplexNumber c = new ComplexNumber();
        c.multiplication(a1, a2, b1, b2);
        sc.close();
    }
}

class ComplexNumber {
    int real;
    int img;

    void add(int a1, int a2, int b1, int b2) {
        this.real = a1 + a2;
        this.img = b1 + b2;
        if (img == 0) {
            System.out.println(real);
        } else if (real == 0) {
            System.out.println(img + "i");
        } else if (img <= 0) {
            System.out.println(real + "" + img + "i");
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }

    void subtract(int a1, int a2, int b1, int b2) {
        this.real = a1 - a2;
        this.img = b1 - b2;
        if (img == 0) {
            System.out.println(real);
        } else if (real == 0) {
            System.out.println(img + "i");
        } else if (img <= 0) {
            System.out.println(real + "" + img + "i");
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }

    void multiplication(int a1, int a2, int b1, int b2) {
        this.real = a1 * a2 - b1 * b2;
        this.img = b1 * a2 + b2 * a1;
        if (img == 0) {
            System.out.println(real);
        } else if (real == 0) {
            System.out.println(img + "i");
        } else if (img <= 0) {
            System.out.println(real + "" + img + "i");
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }
}