
// 4. Creation of 2D Arrays
import java.util.*;

public class D {

    public static void largestAndSmallest(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximun element: " + max);
        System.out.println("Minimun element: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of Matrix(Row & Column): ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter (" + i + ", " + j + " ): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        largestAndSmallest(matrix);
        sc.close();
    }
}