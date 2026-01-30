
// 2. Max Subarray Sum - II (Prefix Sum)
import java.util.*;

public class B {

    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];

        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
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
        maxSubArraySum(arr);
        sc.close();
    }
}