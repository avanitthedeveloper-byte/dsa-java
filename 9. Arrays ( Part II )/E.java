
// 5. Trapping rain water problem Code
import java.util.*;

public class E {

    public static int trappedWater(int buildHeight[]) {
        int trapWater = 0;
        int leftBound[] = new int[buildHeight.length];
        int rightBound[] = new int[buildHeight.length];
        leftBound[0] = buildHeight[0];
        rightBound[buildHeight.length - 1] = buildHeight[buildHeight.length - 1];
        for (int i = 1; i < leftBound.length; i++) {
            leftBound[i] = Math.max(leftBound[i - 1], buildHeight[i]);
        }

        for (int i = rightBound.length - 2; i >= 0; i--) {
            rightBound[i] = Math.max(rightBound[i + 1], buildHeight[i]);
        }

        for (int i = 0; i < buildHeight.length; i++) {
            trapWater += Math.min(leftBound[i], rightBound[i]) - buildHeight[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of buildings: ");
        int numOfBuild = sc.nextInt();
        int buildHeight[] = new int[numOfBuild];
        for (int i = 0; i < buildHeight.length; i++) {
            System.out.print("Enter height of " + i + " building: ");
            buildHeight[i] = sc.nextInt();
        }
        System.out.println("Total trapped water: " + trappedWater(buildHeight));

        sc.close();
    }
}