// 9. First Occurence

import java.util.*;

public class I {

    public static int firstOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        if (key == arr[i]) {
            return i;
        }

        return firstOccur(arr, i + 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 8, 9, 7, 3, 4, 2, 5, 6 };
        System.out.println(firstOccur(arr, 0, 6));
        sc.close();
    }
}