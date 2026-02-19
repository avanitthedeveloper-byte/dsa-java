// 8. Maximum length chain of pairs

import java.util.*;

public class H {

    public static void main(String[] args) {
        int arr[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        // int arr[][] = { { 2, 12 }, { 7, 19 }, { 5, 23 }, { 24, 82 } };
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        int ans = 1;
        int lastChosen = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= lastChosen) {
                ans++;
                lastChosen = arr[i][1];
            }
        }
        System.out.println(ans);
    }
}