// 3. Removes Duplicates in a String

import java.util.*;

public class C {
    public static void removeDuplicates(String str, int n, StringBuilder newStr, boolean map[]) {
        if (n == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(n) - 'a'] == false) {
            newStr.append(str.charAt(n));
            map[str.charAt(n) - 'a'] = true;
        }
        removeDuplicates(str, n + 1, newStr, map);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        boolean map[] = new boolean[25];
        StringBuilder newStr = new StringBuilder();
        removeDuplicates(str, 0, newStr, map);
        sc.close();
    }
}