
// Practice Questions
import java.util.*;

public class Z {
    // Containing Duplicates
    public static boolean containsDuplicate(int arr[]) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }

    // Searching after Rotation of Array
    public static int searchInRotatedArray(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Triplet Sum
    public static void tripletSum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if ((i != j && j != k && k != i) && (arr[i] + arr[j] + arr[k] == 0)) {
                        System.out.print("[ " + arr[i] + " " + arr[j] + " " + arr[k] + " ]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        // System.out.print("Enter target: ");
        // int target = sc.nextInt();
        // System.out.println(searchInRotatedArray(arr, target));
        tripletSum(arr);
        sc.close();
    }
}