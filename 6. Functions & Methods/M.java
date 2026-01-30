// 13. Overloading using Datat Types

public class M {
    // Both are integer
    public static int multiply(int a, int b) {
        System.out.println("One");
        int pro = a * b;
        return pro;
    }

    // First float second Integer
    public static float multiply(float a, int b) {
        System.out.println("Two");
        float pro = a * b;
        return pro;
    }

    // First Integer second float
    public static float multiply(int a, float b) {
        System.out.println("Three");
        float pro = a * b;
        return pro;
    }

    // Both float
    public static float multiply(float a, float b) {
        System.out.println("Four");
        float pro = a * b;
        return pro;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication: " + multiply(3.4f, 3));
        System.out.println("Multiplication: " + multiply(3, 3));
        System.out.println("Multiplication: " + multiply(3.4f, 3.4f));
        System.out.println("Multiplication: " + multiply(3, 3.4f));

    }
}