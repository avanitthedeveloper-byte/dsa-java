// 12. Overloading using Parameters

public class L {
    public static int sum(int a, int b) {
        System.out.println("One");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("Two");
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(3, 5));
        System.out.println("Sum: " + sum(3, 5, 7));
    }
}