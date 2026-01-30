
// 4. Print numbers from 1 to n
import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while (count < num) {
            System.out.println(count + 1);
            count++;
        }
        sc.close();
    }
}