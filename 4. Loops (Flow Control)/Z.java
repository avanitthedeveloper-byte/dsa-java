
// Practice Questions
// 2.
// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Total number: ");
// int n = sc.nextInt();
// int evenSum = 0, oddSum = 0;
// for (int i = 0; i < n; i++) {
// System.out.print("Enter " + (i + 1) + " number: ");
// int digit = sc.nextInt();
// if (digit % 2 == 0) {
// evenSum += digit;
// } else {
// oddSum += digit;
// }
// }
// System.out.println("Sum of all Even Number: " + evenSum);
// System.out.println("Sum of all Odd Number: " + oddSum);
// sc.close();
// }
// }

// 3.

// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int num = sc.nextInt();
// double fact = 1;
// if (num == 0) {
// System.out.println(0 + "!: " + fact);
// } else if (num < 0) {
// System.out.println("Factorial of negative number is not defined!...");
// } else {
// for (int i = 1; i <= num; i++) {
// fact *= i;
// }
// System.out.println(num + "!: " + fact);
// }
// sc.close();
// }
// }

// 4.
// import java.util.*;

// public class Z {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter n: ");
// int num = sc.nextInt();
// for (int i = 1; i <= 10; i++) {
// System.out.println(num * i);
// }
// sc.close();
// }
// }