// Solution 01 - Exceeds the time limit

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > buyPrice) {
                    if ((prices[j] - buyPrice) > maxProfit) {
                        maxProfit = prices[j] - buyPrice; 
                    }
                }
            }
        }
        
        return maxProfit;
    }
}

// Solution 02

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }
        
        return maxProfit;
    }
}