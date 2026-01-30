// 7. Question - Shortest Path

import java.util.*;

public class G {
    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        float shortestLength = (float) (Math.sqrt(x * x + y * y));
        return shortestLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
        sc.close();
    }
}