// 5. Linear Search

import java.util.*;

public class E {

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " number: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.print(target + " is at index: " + index);
        } else {
            System.out.println(target + " is not found.");
        }
        sc.close();
    }
}