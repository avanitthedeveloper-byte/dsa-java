
// 6. Spiral Matrix
import java.util.*;

public class H {
    public static void diagSum(int matrix[][]) {
        int sum1 = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // if (i == j || i + j == matrix.length - 1) {
        // sum1 += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum1 += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.print("Diagonal Sum: " + (sum1));
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
        diagSum(matrix);
        sc.close();
    }
}