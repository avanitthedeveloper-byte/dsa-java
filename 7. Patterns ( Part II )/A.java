
// 1. Hollow Rectangle
// import java.util.*;

// public class A {
//     public static void hollowRectangle(int n) {
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
//         invertedAndRotatedHalfPyramid(n);
//     }

//     public static void invertedAndRotatedHalfPyramid(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i + j <= n + 1) {
//                     System.out.print(j + " ");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         FLOYDSTriangle(n);
//     }

//     public static void FLOYDSTriangle(int n) {
//         int num = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }

//         zeroOneRectangle(n);
//     }

//     public static void zeroOneRectangle(int n) {
//         int num = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(n + " ");
//                 if (num == 1) {
//                     num = 0;
//                 } else {
//                     num = 1;
//                 }
//             }
//             if (i % 2 == 0) {
//                 num = 1;
//             } else {
//                 num = 0;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         hollowRectangle(n);
//         sc.close();
//     }
// }

// 2. Inverted & Rotated Half-Pyramid Pattern
// import java.util.*;

// public class A {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// if (i + j >= n + 1) {
// System.out.print(" *");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

// 3. Inverted Half-Pyramid with Numbers Pattern
// import java.util.*;

// public class A {

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

// public class A {

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

// import java.util.*;

// public class A {
// public static void palindromicPattern(int n) {
// for (int i = 1; i <= n; i++) {
// int m = i;
// int p = 2;
// for (int j = 1; j <= n; j++) {
// if ((i + j >= n + 1) && (i + j <= n + 2 * i - 1)) {
// System.out.print(m + " ");
// m--;
// } else {
// System.out.print(" ");
// }
// }

// for (int j = n + 1; j <= 2 * n - 1; j++) {
// if ((i + j >= n + 1) && (i + j <= n + 2 * i - 1)) {
// System.out.print(p + " ");
// p++;
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a Number: ");
// int n = sc.nextInt();
// palindromicPattern(n);
// sc.close();
// }
// }

// --------------- Alphabet Printing ---------------

import java.util.*;

public class A {

    public static void printA(int n) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == (n + 1) / 2 || j == 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printB(n);
    }

    public static void printB(int n) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == (n + 1) / 2 || i == n || j == 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printC(n);
    }

    public static void printC(int n) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == n || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printD(n);
    }

    public static void printD(int n) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == n || j == (n) / 2 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printE(n);
    }

    public static void printE(int n) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == (n + 1) / 2 || i == n || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        printF(n);
    }

    public static void printF(int n) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == (n + 1) / 2 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        printA(n);
        sc.close();
    }
}