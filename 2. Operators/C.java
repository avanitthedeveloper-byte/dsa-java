// 3. Unary Operators

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = a++;
        System.out.println(b);
        System.out.println(a);
        int c = 10;
        int d = ++c;
        System.out.println(d);
        System.out.println(c);
        int e = 10;
        int f = --e;
        System.out.println(f);
        System.out.println(e);
        int g = 10;
        int h = g--;
        System.out.println(h);
        System.out.println(g);
        sc.close();
    }
}