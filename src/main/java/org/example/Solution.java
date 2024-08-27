package org.example;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 0) return 0;
        int minPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}
