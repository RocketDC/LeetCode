package com.wissen.questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Test class for BestTimeToBuyAndSellStock
 */
public class BestTimeToBuyAndSellStockTest {
    
    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
    
    @Test
    public void testMaxProfit() {
        // Test case 1: Basic case
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices1), "Basic case failed: Buy on day 2 (price = 1) and sell on day 5 (price = 6)");
        
        // Test case 2: No profit possible
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices2), "Prices are decreasing");
        
        // Test case 3: Single price
        int[] prices3 = {5};
        assertEquals(0, solution.maxProfit(prices3)); // Only one price
        
        // Test case 4: Empty array
        int[] prices4 = {};
        assertEquals(0, solution.maxProfit(prices4)); // Empty array
        
        // Test case 5: All prices same
        int[] prices5 = {1, 1, 1, 1};
        assertEquals(0, solution.maxProfit(prices5)); // No profit possible when all prices are same
        
        // Test case 6: Large array
        int[] prices6 = {100, 180, 260, 310, 40, 535, 695};
        assertEquals(655, solution.maxProfit(prices6)); // Buy on day 5 and sell on day 7
        
        // Test case 7: Negative prices
        int[] prices7 = {-1, -3, -2, -5, -4};
        assertEquals(1, solution.maxProfit(prices7)); // Buy on day 4 and sell on day 3
    }
}
