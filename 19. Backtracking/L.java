// 11. Grid Ways

import java.util.*;

public class L {
    public static void gridWay(int arr[][], int row, int col) {
        if (col >= arr[0].length || row >= arr.length) {
            return;
        }
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            count++;
            return;
        }

        // Right
        gridWay(arr, row, col + 1);

        // Down
        gridWay(arr, row + 1, col);

    }

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter (row & column) : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        gridWay(arr, 0, 0);
        System.out.println(count);
        sc.close();
    }
}