// 10. Container with Most Water (Brute Force)

import java.util.*;

public class J {
    public static int maxWater(ArrayList<Integer> containerSize) {
        int storedWater = 0;
        for (int i = 0; i < containerSize.size() - 1; i++) {
            for (int j = i + 1; j < containerSize.size(); j++) {
                int width = j - i;
                int height = Math.min(containerSize.get(i), containerSize.get(j));
                storedWater = Math.max(storedWater, width * height);
            }
        }
        return storedWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> containerSize = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(maxWater(containerSize));
    }
}