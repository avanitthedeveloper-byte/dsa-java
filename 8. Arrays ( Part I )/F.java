// 6. Largest in array
// 5. Linear Search

import java.util.*;

public class F {

    public static int largestNumber(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
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
        int index = largestNumber(arr);
        System.out.println("Largest number is: " + index);
        sc.close();
    }
}