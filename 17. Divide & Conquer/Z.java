
// Practice Question
import java.util.*;

public class Z {

    public static int inversionCount(int arr[], int i, int count) {
        if (i == arr.length - 1) {
            return count;
        }
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                count++;
            }
        }
        return inversionCount(arr, i + 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 1, 3, 5 };
        int ans = inversionCount(arr, 0, 0);
        System.out.println(ans);
        sc.close();
    }
}