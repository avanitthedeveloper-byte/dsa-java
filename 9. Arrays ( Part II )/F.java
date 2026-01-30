// 6. Best time to buy and sell stock

import java.util.*;

public class F {
    public static int buyAndSellStock(int stockPrice[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < stockPrice.length; i++) {
            if (buyPrice < stockPrice[i]) {
                int profit = stockPrice[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = stockPrice[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stock: ");
        int n = sc.nextInt();
        int stockPrice[] = new int[n];
        for (int i = 0; i < stockPrice.length; i++) {
            System.out.print("Enter the price of " + i + " day: ");
            stockPrice[i] = sc.nextInt();
        }
        System.out.print("Maximum profit will be: " + buyAndSellStock(stockPrice));
        sc.close();
    }
}