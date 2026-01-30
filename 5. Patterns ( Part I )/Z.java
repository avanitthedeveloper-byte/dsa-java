
// 1. Hollow Rectangle
// import java.util.*;

// public class Z {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n + 1; j++) {
//                 if (i == 1 || i == n) {
//                     System.out.print("* ");
//                 } else if (j == 1 || j == n + 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// 2. Inverted & Rotated Half-Pyramid Pattern
import java.util.*;

public class Z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= n + 1) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// 3. Inverted Half-Pyramid with Numbers Pattern
// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i + j <= n + 1) {
// System.out.print(j + " ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 4. FLOYD'S Triangle Pattern
// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int num = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(num + " ");
// num++;
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 5. 0 - 1 Ractangle Pattern

// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int num = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(num + " ");
// if (num == 1) {
// num = 0;
// } else {
// num = 1;
// }
// }
// if (i % 2 == 0) {
// num = 1;
// } else {
// num = 0;
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 6. BUTTERFLY Pattern

// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= 2 * n; j++) {
// if (j <= i || j >= 2 * n + 1 - i) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// for (int i = n; i >= 1; i--) {
// for (int j = 2 * n; j >= 1; j--) {
// if (j <= i || j >= 2 * n + 1 - i) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 7. SOLID RHOMBUS

// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= 2 * n - 1; j++) {
// if (i + j > n && j <= 2 * n - i) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 8. HOLLOW RHOMBUS Pattern

// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= 2 * n - 1; j++) {
// if (i == 1 || i == n) {
// if (i + j >= n + 1 && i + j <= 2 * n) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// } else {
// if (i + j == n + 1 || i + j == 2 * n) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 9. DIAMOND Pattern
// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= 2 * n - 1; j++) {
// if ((i + j >= n + 1) && (i + j <= n + 2 * i - 1)) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// for (int i = n; i >= 1; i--) {
// for (int j = 2 * n - 1; j >= 1; j--) {
// if ((i + j >= n + 1) && (i + j <= n + 2 * i - 1)) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 10. NUMBER PYRAMID Pattern

// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= 2 * n - 1; j++) {
// if (n % 2 == 0) {
// if (i + j > n && (i + j) % 2 != 0 && i + j <= n + 2 * i - 1) {
// System.out.print(i);
// } else {
// System.out.print(" ");
// }
// } else {
// if (i + j > n && (i + j) % 2 == 0 && i + j <= n + 2 * i - 1) {
// System.out.print(i);
// } else {
// System.out.print(" ");
// }
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// PALINDROMIC Pattern with Number Pattern
// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// int m = i;
// for (int j = 1; j <= 2 * n - 1; j++) {
// if ((i + j >= n + 1) && (i + j <= n + 2 * i - 1)) {
// System.out.print(m + " ");
// if (m == 1) {
// m++;
// } else {
// m--;
// }
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }