import java.util.*;

public class Z {

    public static void mazeSolver(int maze[][], int row, int col) {

        // Out of boundary OR blocked OR already visited
        if (row < 0 || col < 0 ||
                row >= maze.length || col >= maze[0].length ||
                maze[row][col] == 0 || maze[row][col] == 5) {
            return;
        }

        // Destination reached
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            maze[row][col] = 5;
            printMaze(maze);
            maze[row][col] = 1; // backtrack
            return;
        }

        // Mark current cell as part of path
        maze[row][col] = 5;

        // Explore all 4 directions
        mazeSolver(maze, row, col - 1); // Left
        mazeSolver(maze, row, col + 1); // Right
        mazeSolver(maze, row - 1, col); // Up
        mazeSolver(maze, row + 1, col); // Down

        // Backtrack (remove from path)
        maze[row][col] = 1;
    }

    public static void printMaze(int maze[][]) {
        System.out.println("\nOne Possible Path:");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int maze[][] = {
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 }
        };

        mazeSolver(maze, 0, 0);
    }
}
