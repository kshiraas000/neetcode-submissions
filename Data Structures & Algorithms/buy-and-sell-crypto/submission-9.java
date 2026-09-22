class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int left = 0;
        int right = 1;

        while (right <= prices.length - 1) {
            int profit = prices[right] - prices[left];
            if (profit > 0) {
                if (profit > maxP) {
                    maxP = profit;
                }
                right++;  
            }
            else {
                left = right;
                right++;
            }
    
        }
        return maxP;
    }
}
