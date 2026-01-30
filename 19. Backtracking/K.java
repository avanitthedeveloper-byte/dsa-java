// 11. N Queens - Prints only one solutions

import java.util.*;

public class K {
    public static boolean nQueenProblem(char board[][], int row) {

        if (row == board.length) {
            // printBoard(board);
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueenProblem(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';
            }
        }

        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Verticle Up Check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal Left Up Check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal Right Up Check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------Queen Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Queen: ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueenProblem(board, 0)) {
            System.out.println("Solution Exist");
            printBoard(board);
        } else {
            System.out.println("Solution Doesn't Exist");
        }
        sc.close();
    }
}