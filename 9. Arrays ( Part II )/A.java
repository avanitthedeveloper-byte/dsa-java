
// 1. Max Subarray Sum - I (Broute Force)
import java.util.*;

public class A {

    public static void maxAndMinValue(int arr[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum += arr[j2];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }

                if (minSum > sum) {
                    minSum = sum;
                }
            }
        }
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
        maxAndMinValue(arr);
        sc.close();
    }
}