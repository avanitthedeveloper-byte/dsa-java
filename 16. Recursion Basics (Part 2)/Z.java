
// Practice Questions
import java.util.*;

public class Z {

    public static void printOcc(int arr[], int index, int key) {
        if (index == arr.length) {
            return;
        }

        if (key == arr[index]) {
            System.out.print(index + " ");
        }

        printOcc(arr, index + 1, key);
    }

    public static void printDigit(int n, String number[]) {
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        System.out.print(number[lastDigit] + " ");
        printDigit(n / 10, number);
    };

    public static int countChar(StringBuffer str, int n, int count) {
        if (str.length() == 0) {
            return count;
        }

        str.deleteCharAt(n);
        count++;

        return countChar(str, n, count);
    }

    public static void subString(String str, int si, int ei, int count) {
        if (si == str.length()) {
            System.out.println("\n" + count);
            return;
        }

        String newStr = str.substring(si, ei);

        if (newStr.charAt(0) == newStr.charAt(newStr.length() - 1)) {
            System.out.print(newStr + " ");
            count++;
        }

        if (ei == str.length()) {
            si++;
            ei = si + 1;
        } else {
            ei++;
        }

        subString(str, si, ei, count);
    }

    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);

    // System.out.println("transfer disk " + n + " from " + src + " to " + helper);

    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    public static void towerOfHanoi(int n, String source, String destination, String helper) {
        if (n == 1) {
            System.out.println("Move " + n + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, helper, destination);
        System.out.println("Move " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q.1
        // System.out.print("Enter size of array: ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter " + i + " elemnt: ");
        // arr[i] = sc.nextInt();
        // }
        // System.out.print("Enter Key: ");
        // int key = sc.nextInt();
        // printOcc(arr, 0, key);

        // Q.2
        // System.out.print("Enter number: ");
        // int n = sc.nextInt();
        // String number[] = { "zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // int p = 0;
        // while (n > 0) {
        // p = p * 10 + (n % 10);
        // n = n / 10;
        // }
        // printDigit(p, number);

        // Q.3
        // StringBuffer str = new StringBuffer("avanit");
        // System.out.println(countChar(str, 0, 0));

        // Q.4
        // subString("abcab", 0, 1, 0);

        // Q.5
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "C", "B");
        sc.close();
    }
}