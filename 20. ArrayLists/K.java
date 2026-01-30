// 11. Container with Most Water (2 Pointer Approach)

import java.util.*;

public class K {
    public static int maxWater(ArrayList<Integer> containerSize, int water, int i, int j) {
        if (i == containerSize.size() || j == 0) {
            return water;
        }
        int width = j - i;
        int height = Math.min(containerSize.get(i), containerSize.get(j));
        int currWater = width * height;
        if (currWater > water) {
            water = currWater;
        }
        if (containerSize.get(i) < containerSize.get(j)) {
            i++;
        } else {
            j--;
        }
        return maxWater(containerSize, water, i, j);
    }

    public static void main(String[] args) {
        ArrayList<Integer> containerSize = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(maxWater(containerSize, 0, 0, (containerSize.size() - 1)));
    }
}