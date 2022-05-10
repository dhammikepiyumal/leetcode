# Solution 01 - Exceeds the time limit

class Solution(object):
    def maxProfit(self, prices):
        
        buy_price = prices[0]
        max_profit = 0
        
        for i in range(len(prices)):
            if (prices[i] < buy_price):
                buy_price = prices[i]
                
            for j in range(i+1, len(prices)):
                if((prices[j] > buy_price) and ((prices[j] - buy_price) > max_profit)):
                    max_profit = prices[j] - buy_price
                    
        return max_profit

# Solution 02

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        buy_price = prices[0]
        max_profit = 0
        
        for i in range(len(prices)):
            
            if buy_price > prices[i]:
                buy_price = prices[i]
                
            max_profit = max(max_profit, prices[i] - buy_price)
            
        return max_profit