// 8. Inbuilt Sort

// import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 4);
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
