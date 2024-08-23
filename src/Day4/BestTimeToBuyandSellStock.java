package Day4;

public class BestTimeToBuyandSellStock {
    // Leetcode 121 : Best Time To Buy and Sell Stocks
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
    public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int mini = prices[0];
            for(int i=1;i<prices.length;i++){
                int curProfit = prices[i]-mini;
                maxProfit= Math.max(maxProfit,curProfit);
                mini = Math.min(mini,prices[i]);
            }
            return maxProfit;
    }

}
