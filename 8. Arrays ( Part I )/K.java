// 11. Print Subarrays

// 9. Reverse an Array
import java.util.*;

public class K {

    public static void subArrays(int arr[]) {
        int totalSubArr = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                    sum += arr[j2];
                }
                totalSubArr++;
                System.out.println();
                if (maxSum < sum) {
                    maxSum = sum;
                }

                if (minSum > sum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total number of sub array: " + totalSubArr);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
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
        subArrays(arr);
        sc.close();
    }
}