
// 9. Reverse an Array
import java.util.*;

public class I {

    public static void reverseAnArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (left == right) {
                break;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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
        reverseAnArray(arr);
        System.out.print("Reverse Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}