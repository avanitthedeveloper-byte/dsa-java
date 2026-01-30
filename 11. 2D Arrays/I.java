// 9. Search in sorted arrays

import java.util.*;

public class I {
    public static void searchInMatrix(int matrix[][], int target) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int rows = 0;
        int cols = col;
        while (rows != row + 1 && cols != -1) {
            if (matrix[rows][cols] == target) {
                System.out.print("Key Found at (" + (rows) + ", " + (cols) + ") ");
                return;
            } else if (matrix[rows][cols] < target) {
                rows++;
            } else {
                cols--;
            }
        }
        System.out.print("Key not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row & Col of Matrix: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter (" + i + ", " + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Key: ");
        int target = sc.nextInt();
        searchInMatrix(matrix, target);
        sc.close();
    }
}