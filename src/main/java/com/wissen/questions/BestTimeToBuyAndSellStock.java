package com.wissen.questions;

/**
 * Solution for Best Time to Buy and Sell Stock problem
 * Given an array of prices where prices[i] is the price of a given stock on the ith day,
 * find the maximum profit from buying and selling the stock.
 * You cannot sell a stock before you buy one.
 */
public class BestTimeToBuyAndSellStock {
    /**
     * Finds the maximum profit that can be achieved from buying and selling the stock.
     * 
     * @param prices Array of stock prices
     * @return Maximum profit that can be achieved
     */
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int bestTimeToBuy = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < prices[bestTimeToBuy])
                bestTimeToBuy = i;
            maxprofit = Math.max(maxprofit,prices[i] - prices[bestTimeToBuy]);
        }
        return maxprofit;
    }


    public int method1(int[] prices) {
        int buy = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < prices[buy])
                buy =i;
            maxProfit = Math.max(maxProfit,prices[i] - prices[buy]);
        }
        return maxProfit;
    }
}
