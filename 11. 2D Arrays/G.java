
// 7. Spiral Matrix Code
import java.util.*;

public class G {

    // public static void spiralMatrix(int matrix[][]) {
    // int sR = 0;
    // int eR = matrix.length - 1;
    // int sC = 0;
    // int eC = matrix[0].length - 1;
    // while (sC <= matrix[0].length / 2 && sR <= matrix.length / 2 && eC >=
    // matrix[0].length / 2
    // && eR >= matrix.length / 2) {
    // for (int i = sC; i <= eC; i++) {
    // System.out.print(matrix[sR][i] + " ");
    // }
    // sR++;
    // for (int i = sR; i <= eR; i++) {
    // if (matrix.length == 1) {
    // return;
    // } else {
    // System.out.print(matrix[i][eC] + " ");
    // }

    // }
    // eC--;
    // for (int i = eC; i >= sC; i--) {
    // if (matrix[0].length == 1) {
    // return;
    // } else {
    // System.out.print(matrix[eR][i] + " ");
    // }

    // }
    // eR--;
    // for (int i = eR; i >= sR; i--) {
    // if (matrix.length == 2 || matrix[0].length == 2) {
    // return;
    // } else {
    // System.out.print(matrix[i][sC] + " ");
    // }

    // }
    // sC++;
    // }

    // }

    public static void spiralMatrix(int matrix[][]) {
        int sR = 0;
        int eR = matrix.length - 1;
        int sC = 0;
        int eC = matrix[0].length - 1;
        while (sC <= matrix[0].length / 2 && sR <= matrix.length / 2 && eC >= matrix[0].length / 2
                && eR >= matrix.length / 2) {
            for (int i = sC; i <= eC; i++) {
                System.out.print(matrix[sR][i] + " ");
            }
            sR++;
            for (int i = sR; i <= eR; i++) {
                if (matrix.length == 1) {
                    return;
                } else {
                    System.out.print(matrix[i][eC] + " ");
                }
            }
            eC--;
            for (int i = eC; i >= sC; i--) {
                if (matrix[0].length == 1) {
                    return;
                } else {
                    System.out.print(matrix[eR][i] + " ");
                }
            }
            eR--;
            for (int i = eR; i >= sR; i--) {
                if (matrix.length == 2 || matrix[0].length == 2) {
                    return;
                } else {
                    System.out.print(matrix[i][sC] + " ");
                }
            }
            sC++;
        }

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
        spiralMatrix(matrix);
        sc.close();
    }
}