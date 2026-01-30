// Practice Question

import java.util.*;

public class Z {

    public static int countNumber(int matrix[][], int target) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }
        return count;

    }

    public static int rowSum(int matrix[][], int target) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[target][i];
        }
        return sum;

    }

    public static void transposeMatrix(int matrix[][]) {
        int newMatrix[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
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
        // System.out.print("Enter Key: ");
        // int key = sc.nextInt();
        // System.out.print(countNumber(matrix, key));
        // System.out.print("Enter row (0 to " + (n - 1) + " ): ");
        // int key = sc.nextInt();
        // System.out.println(rowSum(matrix, key));
        transposeMatrix(matrix);

        sc.close();
    }
}