// 9. Indian Coin

import java.util.*;

public class I {

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int val = 92;
        int ans = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> money = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= val) {
                while (coins[i] <= val) {
                    ans++;
                    money.add(coins[i]);
                    val = val - coins[i];
                }
            }
        }
        System.out.println(ans);
        for (int i = 0; i < money.size(); i++) {
            System.out.print(money.get(i) + " ");
        }
        System.out.println();
    }
}