// Practice Question

import java.util.*;

public class Z {
    // public static void reverseBubbleSort(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - i - 1; j++) {
    // if (arr[j] < arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // public static void reverseSelectionSort(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // int index = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[index] < arr[j]) {
    // index = j;
    // }
    // }
    // int temp = arr[i];
    // arr[i] = arr[index];
    // arr[index] = temp;
    // }
    // }

    public static void reverseInsertionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int sizeOfArr = sc.nextInt();
        int arr[] = new int[sizeOfArr];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " th element: ");
            arr[i] = sc.nextInt();
        }
        reverseInsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}