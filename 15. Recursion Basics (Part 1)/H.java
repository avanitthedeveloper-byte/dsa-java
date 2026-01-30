// 8. Check if array is sorted or not Number

import java.util.*;

public class H {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 9, 5 };
        System.out.println(isSorted(arr, 0));
        sc.close();
    }
}