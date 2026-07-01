class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
        int profit = 0;
        
        for(int j=1; j<prices.length; j++){
            int cost = prices[j] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[j]);
        }
        return profit;
    }
}