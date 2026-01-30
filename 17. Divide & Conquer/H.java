// 8. Sorted & Rotated arrays Code

import java.util.*;

public class H {

    public static int searchInSortedAndRotatedArray(int arr[], int target, int si, int ei) {
        if (si > si) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (target == arr[mid]) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return searchInSortedAndRotatedArray(arr, target, si, mid - 1);
            } else {
                return searchInSortedAndRotatedArray(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchInSortedAndRotatedArray(arr, target, mid + 1, ei);
            } else {
                return searchInSortedAndRotatedArray(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        System.out.println(searchInSortedAndRotatedArray(arr, target, 0, arr.length - 1));
        sc.close();
    }
}