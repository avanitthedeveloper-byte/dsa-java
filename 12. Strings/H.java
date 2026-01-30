// 8. String Functions - Compare

import java.util.*;

public class H {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if (s1 == s2) {
            System.out.println("S1 and S2 are equal.");
        }
        if (s1 == s3) {
            System.out.println("S1 and S3 are equal.");
        }

        System.out.println(s1.equals(s3));
        sc.close();
    }
}