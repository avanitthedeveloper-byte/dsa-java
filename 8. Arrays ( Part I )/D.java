// 4. Arrays as Function Arguments

import java.util.*;

public class D {
    // Function to calculate Average Marks
    public static float averageMarks(int marks[]) {
        float averageMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            averageMarks += marks[i];
        }
        return averageMarks / marks.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total number of Students: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter " + i + " marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.print("Average marks: " + averageMarks(marks));

        sc.close();
    }
}