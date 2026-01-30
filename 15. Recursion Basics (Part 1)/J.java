// 10. Last Occurence

import java.util.*;

public class J {

    public static int lastOccur(int arr[], int i, int key) {
        if (i < 0) {
            return -1;
        }

        if (key == arr[i]) {
            return i;
        }

        return lastOccur(arr, i - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 8, 9, 7, 3, 9, 2, 5, 8 };
        System.out.println(lastOccur(arr, arr.length - 1, 4));
        sc.close();
    }
}