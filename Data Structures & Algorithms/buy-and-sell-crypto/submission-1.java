class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int res = 0;
        for (int price : prices) {
            res = Math.max(res, price - minBuy);
            minBuy = Math.min(minBuy, price); 
        }
        return res;
    }
}
