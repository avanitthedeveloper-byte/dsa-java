// 3. Arrays - Input, Output & Update

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter " + i + " index marks: ");
            marks[i] = sc.nextInt();
        }
        System.out.print("[ ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.print("]\n");
        sc.close();
    }
}